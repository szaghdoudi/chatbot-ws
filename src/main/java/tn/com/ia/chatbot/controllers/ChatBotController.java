package tn.com.ia.chatbot.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tn.com.ia.chatbot.domain.ChatBotMessageRequest;
import tn.com.ia.chatbot.domain.ChatBotMessageResponse;
import tn.com.ia.chatbot.services.IChatBotService;
@CrossOrigin
@RestController
@RequestMapping("/api/ia")
public class ChatBotController {

	public static final Logger LOGGER = LoggerFactory.getLogger(ChatBotController.class);

	@Autowired
	IChatBotService chatBotService;

	@RequestMapping(value = "/chatbot", method = RequestMethod.POST,produces = "application/json",consumes="application/json")
	public ChatBotMessageResponse chatbot(@RequestBody ChatBotMessageRequest chatBotMessageRequest) {
		LOGGER.info("-----------------chatbot::start-------------------------");
		LOGGER.debug("user : " + chatBotMessageRequest.getUser());
		LOGGER.debug("request message : " + chatBotMessageRequest.getMessage());
		return chatBotService.chatbot(chatBotMessageRequest);
	}
	
	@RequestMapping(value = "/chatbotTest", method = RequestMethod.GET)
	public String chatbot() {
		LOGGER.info("-----------------chatbot::start-------------------------");
		return "hi";
	}

}
