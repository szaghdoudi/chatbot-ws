package tn.com.ia.chatbot.domain;

public class ChatBotMessageRequest {

	private String message;
	private String user;

	public ChatBotMessageRequest() {
		super();
	}

	public ChatBotMessageRequest(String message, String user) {
		super();
		this.message = message;
		this.user = user;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

}
