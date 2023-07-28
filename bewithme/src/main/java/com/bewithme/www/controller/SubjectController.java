package com.bewithme.www.controller;

import java.util.List;

import javax.inject.Inject;
import javax.security.auth.Subject;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bewithme.www.domain.SubjectVO;
import com.bewithme.www.service.SubjectService;

import lombok.extern.slf4j.Slf4j;

@RequestMapping("/sj/*")
@Slf4j
@Controller
public class SubjectController {
	
	@Inject
	private SubjectService ssv;
	
	private static final Logger log = LoggerFactory.getLogger(SubjectController.class);
	
	@GetMapping("/subject")
	public String subjectGet() {
		return "/subject/subject";
	}
	
    @GetMapping("/title")
    public String title(Model m, @RequestParam("sub_num")int sub_num, HttpServletRequest r) {
    	log.info(">>>sub_num : "+ sub_num);
    	log.info("mapping"+ r.getRequestURI());
    	String mapping = r.getRequestURI();
    	SubjectVO svo = ssv.getTitle(sub_num);
    	log.info(">>>svo : "+ svo);
    	
    	m.addAttribute("svo",svo);
    	
    	//강의수 받아옴
    	int count = ssv.courseCount(sub_num);
		log.info("count : "+ count);
		m.addAttribute("count",count);
    	
    	return "subject/subject";
    }
}
