package com.bewithme.www.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.bewithme.www.domain.CalendarVO;
import com.bewithme.www.repository.CalendarDAO;

@Service
public class CalendarServiceImpl implements CalendarService {

	@Inject
	private CalendarDAO calDAO;
	@Override
	public int insertSchedule(CalendarVO cal) {
		// TODO Auto-generated method stub
		int isOk=calDAO.insertSchedule(cal);
		return isOk;
	}
	@Override
	public List<CalendarVO> getList() {
		// TODO Auto-generated method stub
		List<CalendarVO>list=calDAO.getList();
		return list;
	}

}