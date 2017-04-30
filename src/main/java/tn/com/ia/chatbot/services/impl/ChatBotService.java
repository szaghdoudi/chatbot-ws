package tn.com.ia.chatbot.services.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import tn.com.ia.chatbot.domain.ChatBotMessageRequest;
import tn.com.ia.chatbot.domain.ChatBotMessageResponse;
import tn.com.ia.chatbot.services.IChatBotService;

@Service("ChatBotService")
public class ChatBotService implements IChatBotService {

	public static final Logger LOGGER = LoggerFactory.getLogger(ChatBotService.class);

	@Override
	public ChatBotMessageResponse chatbot(ChatBotMessageRequest chatBotMessageRequest) {
		LOGGER.info("-----------------chatbot::start-------------------------");
		String response = chatBotMessageRequest.getUser() + " said " + chatBotMessageRequest.getMessage();
		LOGGER.debug("response : " + response);
		return new ChatBotMessageResponse(response);
	}
}
