package com.bewithme.www.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ChatBotVO {
	private int bot_num;
	private String id;
	private String title_content;
	private String btn_content;
	private String bot_content;
	private int count;
	
	public int getBot_num() {
		return bot_num;
	}
	public void setBot_num(int bot_num) {
		this.bot_num = bot_num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle_content() {
		return title_content;
	}
	public void setTitle_content(String title_content) {
		this.title_content = title_content;
	}
	public String getBtn_content() {
		return btn_content;
	}
	public void setBtn_content(String btn_content) {
		this.btn_content = btn_content;
	}
	public String getBot_content() {
		return bot_content;
	}
	public void setBot_content(String bot_content) {
		this.bot_content = bot_content;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
}
