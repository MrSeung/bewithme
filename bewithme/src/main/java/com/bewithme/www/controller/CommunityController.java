package com.bewithme.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/community/*")
@Controller
public class CommunityController {
	
	@GetMapping("/community")
	public String subject(){
		return "/community/community";
	}
}
