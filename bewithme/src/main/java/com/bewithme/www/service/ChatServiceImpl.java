package com.bewithme.www.service;

import java.io.Console;
import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.bewithme.www.controller.ChatBotController;
import com.bewithme.www.domain.ChatVO;
import com.bewithme.www.repository.ChatDAO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ChatServiceImpl implements ChatService {

	@Inject
	private ChatDAO chatDAO;
	
	private static final Logger log = LoggerFactory.getLogger(ChatServiceImpl.class);

	@Override
	public int insertMsg(ChatVO chat) {
		// TODO Auto-generated method stub
		log.info("chatService 진입!!");
		int isOk=chatDAO.insertMsg(chat);
		return isOk;
	}

	@Override
	public List<ChatVO> getList(String fromId) {
		// TODO Auto-generated method stub
		log.info("chatService getList 진입!!");
		List<ChatVO> list=chatDAO.getList(fromId);
		return list;
	}

	@Override
	public List<ChatVO> getUserList() {
		// TODO Auto-generated method stub
		log.info("getUserList Serivice 진입!");
		List<ChatVO> list=chatDAO.getUserList();
		return list;
	}
}
