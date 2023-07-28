package com.bewithme.www.service;

import java.util.List;

import com.bewithme.www.domain.TodoVO;

public interface TodoService {

	int insertTodo(TodoVO todo);

	List<TodoVO> getList();

	int deleteTodo(int todo_num);

}
