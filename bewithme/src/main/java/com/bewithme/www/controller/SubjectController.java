package com.bewithme.www.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/subject/*")
@Controller
public class SubjectController {
	@Inject
//	private SubjectService subjectService;
	
	@GetMapping("/subject")
	public String subject(){
		return "/subject/subject";
	}
}
