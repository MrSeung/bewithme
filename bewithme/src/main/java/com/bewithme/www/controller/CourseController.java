package com.bewithme.www.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bewithme.www.domain.CourseVO;
import com.bewithme.www.service.CourseService;

import lombok.extern.slf4j.Slf4j;



@RequestMapping("/co/*")
@Slf4j
@Controller
public class CourseController {
	@Inject
	private CourseService csv;
	
	
	@GetMapping("/write")
	public String write(CourseVO cvo) {
		return "/subject/course_reg";
	}
	
	@PostMapping("/write")
	public String insertCourse(CourseVO cvo) {
		log.info("cvo : "+ cvo);
		csv.insertCourse(cvo);
		
			
		return "/subject/subject";
	}
	
	@GetMapping("/link")
	public String link(@RequestParam("cou_num")int cou_num, Model m) {
		log.info(">>>cou_num : "+cou_num);
		CourseVO cvo  = csv.getTitleContent(cou_num);
		log.info(">>>cvo : "+cvo);
		m.addAttribute("cvo",cvo);
		
		int cou_cnt = csv.cou_cnt(cou_num);
			
		return "/subject/course2";
	}
	
//	@GetMapping("/list")
//	public String list(Model m) {
//		List<CourseVO> list = csv.getList();
//		m.addAttribute("list",list);
//		log.info(">>>list : "+list);
//		return "/subject/subject";
//	}
	
	@GetMapping(value = "/{sub_num}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<CourseVO>> spread(@PathVariable("sub_num")int sub_num){
		log.info(">>> course list sub_num : "+sub_num);
		List<CourseVO> list = csv.getList(sub_num);
		log.info(">>> courst_List : " + list.toString());
		
		return new ResponseEntity<List<CourseVO>>(list, HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/{cou_num}", produces = {MediaType.TEXT_PLAIN_VALUE})
	public ResponseEntity<String> remove(@PathVariable("cou_num")int cou_num){
		log.info(">>> remove cou_num : "+cou_num);
		
		int isOk = csv.remove(cou_num);
		return isOk > 0?
				new ResponseEntity<String>("1",HttpStatus.OK)
				: new ResponseEntity<String>("0",HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
}