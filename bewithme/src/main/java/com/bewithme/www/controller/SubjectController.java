package com.bewithme.www.controller;

<<<<<<< HEAD
import java.util.List;

import javax.inject.Inject;
import javax.security.auth.Subject;
import javax.servlet.http.HttpServletRequest;

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

	
	
=======
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
>>>>>>> c8c390bdb8bc1777844559db7184836c613d536d
}
