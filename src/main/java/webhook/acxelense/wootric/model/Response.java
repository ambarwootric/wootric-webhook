package webhook.acxelense.wootric.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Response {
	
	private int id;
	private int responseId;
	private int endUserId;
	private int surveyId;
	private int score;
	private String text;
	private boolean completed;
	private boolean excludedFromCalculations;
	private String ipAddress;
	private String originUrl;
	private String createdAt;
	private String updatedAt;
	private List<String> tags = new ArrayList<String>();
	private List<String> notes = new ArrayList<String>();
	private Properties properties;
	
	public Response() {
		
	}
	
	public Response(int responseId, int endUserId, int surveyId, int score, String text, boolean completed,
			boolean excludedFromCalculations, String ipAddress, String originUrl, String createdAt, String updatedAt,
			List<String> tags, List<String> notes, Properties properties) {
		super();
		this.responseId = responseId;
		this.endUserId = endUserId;
		this.surveyId = surveyId;
		this.score = score;
		this.text = text;
		this.completed = completed;
		this.excludedFromCalculations = excludedFromCalculations;
		this.ipAddress = ipAddress;
		this.originUrl = originUrl;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.tags = tags;
		this.notes = notes;
		this.properties = properties;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(updatable = false, nullable = false, unique = true)
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getResponseId() {
		return responseId;
	}

	public void setResponseId(int responseId) {
		this.responseId = responseId;
	}

	public int getEndUserId() {
		return endUserId;
	}

	public void setEndUserId(int endUserId) {
		this.endUserId = endUserId;
	}

	public int getSurveyId() {
		return surveyId;
	}

	public void setSurveyId(int surveyId) {
		this.surveyId = surveyId;
	}

	public int getScore() {
		return score;
		
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public boolean isExcludedFromCalculations() {
		return excludedFromCalculations;
	}

	public void setExcludedFromCalculations(boolean excludedFromCalculations) {
		this.excludedFromCalculations = excludedFromCalculations;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getOriginUrl() {
		return originUrl;
	}

	public void setOriginUrl(String originUrl) {
		this.originUrl = originUrl;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	@ElementCollection
	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	@ElementCollection
	public List<String> getNotes() {
		return notes;
	}

	public void setNotes(List<String> notes) {
		this.notes = notes;
	}

	@OneToOne(cascade = CascadeType.ALL)
	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	
	
	
}
