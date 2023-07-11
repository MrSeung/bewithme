package com.bewithme.www.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.bewithme.www.domain.CommunityVO;
import com.bewithme.www.service.CommunityService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/community/*")
public class CommunityController {

	private static final Logger log = LoggerFactory.getLogger(CommunityController.class);
	
	@Inject
	private CommunityService csv;
	
	@GetMapping("/insert")
	private String insertComunnityGet(){
		return "/community/community_reg";
	}
	
	@PostMapping(value="/insert", consumes="application/json", produces = {MediaType.TEXT_PLAIN_VALUE})
	private ResponseEntity<String> insertComunnityPost(@RequestBody CommunityVO cvo, Model m, RedirectAttributes rAttr) {
		log.info(">>> cvo : " + cvo.toString());
		int isOk = csv.insertCommunity(cvo);
		
		return isOk > 0? new ResponseEntity<String>("1",HttpStatus.OK)
				: new ResponseEntity<String>("0",HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	//community page로 이동
	@GetMapping("/communitypage")
	private String CommunityPage(){
		return "/community/community";
	}
	
	
	@GetMapping(value="/list", produces = {MediaType.APPLICATION_JSON_VALUE} )
	private ResponseEntity<Map<String, List<CommunityVO>>> selectCommunityList(){
		
		List<CommunityVO> communityList = csv.selectComunnityList();
		List<CommunityVO> recommendList = csv.selectRecommendList();
		
		Map<String, List<CommunityVO>> map = new HashMap<>();
	    map.put("communityList", communityList);
	    map.put("recommendList", recommendList);
		
	    return new ResponseEntity<>(map, HttpStatus.OK);
	}
	
	
	
	
	
	
}
