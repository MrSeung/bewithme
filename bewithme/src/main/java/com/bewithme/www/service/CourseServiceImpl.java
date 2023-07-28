package com.bewithme.www.service;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.bewithme.www.domain.CourseVO;
import com.bewithme.www.repository.CourseDAO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CourseServiceImpl implements CourseService {
	
	@Inject
	private CourseDAO cdao;
	
	private static final Logger log = LoggerFactory.getLogger(CourseServiceImpl.class);

	@Override
	public int insertCourse(CourseVO cvo) {
		log.info("inserCourse Service진입~!!");
		return cdao.insertCourse(cvo);
	}

	@Override
	public List<CourseVO> getList(int sub_num) {
		log.info("getList Service진입~!!");
		return cdao.getList(sub_num);
	}

	@Override
	public CourseVO getTitleContent(int cou_num) {
		log.info("getTitleContentt Service진입~!!");
		return cdao.getTitleContent(cou_num);
	}

	@Override
	public int remove(int cou_num) {
		log.info("getTitleContentt Service진입~!!");
		return cdao.remove(cou_num);
	}

	@Override
	public int cou_cnt(int cou_num) {
		log.info("조회수 Service진입~!!");
		return cdao.cou_cnt(cou_num);
	}




	
}
