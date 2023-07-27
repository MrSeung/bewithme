package com.bewithme.www.repository;

import java.util.List;

import com.bewithme.www.domain.BookmarkVO;

public interface BookmarkDAO {

	int isBook(BookmarkVO bookvo);

	int delete(BookmarkVO bookvo);

	int insert(BookmarkVO bookvo);

	List<Integer> bookList(String id);

}
