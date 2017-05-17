package webhook.acxelense.wootric.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import webhook.acxelense.wootric.model.Properties;
import webhook.acxelense.wootric.model.Response;
import webhook.acxelense.wootric.service.ResponseService;

@RestController
@RequestMapping("/api")
public class ResponseController {
	
	@Autowired
	private ResponseService responseService;
	
	@RequestMapping(value= "/responses", method = RequestMethod.POST)
	public void addResponse(@RequestBody HashMap<String, Object> response) {
		int responseId =  (int) response.get("id");
		int endUserId = (int) response.get("end_user_id");
		int surveyId = (int) response.get("survey_id");
		int score = (int) response.get("score");
		String text = (String) response.get("text");
		boolean completed = (boolean) response.get("completed");
		boolean excludedFromCalculations = (boolean) response.get("excluded_from_calculations");
		String ipAddress = (String) response.get("ip_address");
		String originUrl = (String) response.get("origin_url");
		String createdAt = (String) response.get("created_at");
		String updatedAt = (String) response.get("updated_at");
		@SuppressWarnings("unchecked")
		List<String> tags = (List<String>) response.get("tags");
		@SuppressWarnings("unchecked")
		List<String> notes = (List<String>) response.get("notes");
		Object endUserObject = response.get("end_user");
		@SuppressWarnings("unchecked")
		HashMap<String, Object> propertiesHash = (HashMap<String, Object>) ((HashMap<String, Object>) endUserObject).get("properties");
		
		System.out.println(
				(String) propertiesHash.get("persona") +  
				(String) propertiesHash.get("pricing_plan") +  
				(String) propertiesHash.get("product_plan") +  
				(int) propertiesHash.get("purchase_date") +  
				(int) propertiesHash.get("revenue_amount")
				);
		Properties properties = new Properties(
				(String) propertiesHash.get("persona"),
				(String) propertiesHash.get("pricing_plan"), 
				(String) propertiesHash.get("product_plan"),  
				(int) propertiesHash.get("purchase_date"), 
				(int) propertiesHash.get("revenue_amount")
				);
		
		responseService.addResponse(new Response(
				responseId,
				endUserId,
				surveyId,
				score,
				text,
				completed,
				excludedFromCalculations,
				ipAddress,
				originUrl,
				createdAt,
				updatedAt,
				tags,
				notes,
				properties
				));
	}

}
