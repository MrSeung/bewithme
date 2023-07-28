package com.bewithme.www.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bewithme.www.domain.ChatVO;
import com.bewithme.www.domain.TodoVO;
import com.bewithme.www.service.ChatService;

import lombok.extern.slf4j.Slf4j;


@RequestMapping("/chat/*")
@Controller
public class ChatController {
	
	@Inject
	private ChatService chatService;
	
	private static final Logger log = LoggerFactory.getLogger(ChatController.class);
	
	@PostMapping(value="/register",consumes = "application/json", produces = MediaType.TEXT_PLAIN_VALUE )
	private ResponseEntity<String> registerMsg(Model m, @RequestBody ChatVO chat){
		int isOk=chatService.insertMsg(chat);
		
		return isOk>0 ? new ResponseEntity<String>("1",HttpStatus.OK)
				: new ResponseEntity<String>("0",HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@GetMapping(value = "/list/{from_id}", produces = MediaType.APPLICATION_JSON_VALUE)
	private ResponseEntity<List<ChatVO>> getChatList(Model m, @PathVariable("from_id")String fromId){
		log.info("fromId >> "+fromId);
		List<ChatVO> list = chatService.getList(fromId);
		
		return new ResponseEntity<List<ChatVO>>(list,HttpStatus.OK);
	}
	
	@GetMapping(value = "/userList", produces=MediaType.APPLICATION_JSON_VALUE)
	private ResponseEntity<List<ChatVO>> getUserList(Model m){
		List<ChatVO> list = chatService.getUserList();
		return new ResponseEntity<List<ChatVO>>(list,HttpStatus.OK);
	}
}
