package com.bewithme.www.service;

import java.util.List;

import com.bewithme.www.domain.BookmarkVO;
import com.bewithme.www.domain.CourseVO;

public interface CourseService {
	
	public int insertCourse(CourseVO cvo);

	public List<CourseVO> getList(int sub_num);

	public CourseVO getTitleContent(int cou_num);

	public int remove(int cou_num);

	public int cou_cnt(int cou_num);

	public int updateBookmark(BookmarkVO bookvo);

	public List<Integer> bookList(String id);




}
