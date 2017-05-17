package webhook.acxelense.wootric.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webhook.acxelense.wootric.model.Response;
import webhook.acxelense.wootric.repository.ResponseRepository;

@Service
public class ResponseService {
	
	@Autowired
	private ResponseRepository responseRepository;
	
	public void addResponse(Response response) {
		responseRepository.save(response);
	}

}
