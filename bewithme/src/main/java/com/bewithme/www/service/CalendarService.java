package com.bewithme.www.service;

import java.util.List;

import com.bewithme.www.domain.CalendarVO;

public interface CalendarService {

	int insertSchedule(CalendarVO cal);

	List<CalendarVO> getList();

}
