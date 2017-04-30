package tn.com.ia.chatbot.services;

import tn.com.ia.chatbot.domain.ChatBotMessageRequest;
import tn.com.ia.chatbot.domain.ChatBotMessageResponse;

public interface IChatBotService {

	ChatBotMessageResponse chatbot(ChatBotMessageRequest chatBotMessageRequest);

}
