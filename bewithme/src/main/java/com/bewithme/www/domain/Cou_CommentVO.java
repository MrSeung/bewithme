package com.bewithme.www.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Cou_CommentVO {
	
	private int cou_com_num;
	private String cou_com_content;
	private String cou_com_reg_date;
	private String cou_com_mod_date;
	private String id;
	private int cou_num;
	
	public int getCou_com_num() {
		return cou_com_num;
	}
	public void setCou_com_num(int cou_com_num) {
		this.cou_com_num = cou_com_num;
	}
	public String getCou_com_content() {
		return cou_com_content;
	}
	public void setCou_com_content(String cou_com_content) {
		this.cou_com_content = cou_com_content;
	}
	public String getCou_com_reg_date() {
		return cou_com_reg_date;
	}
	public void setCou_com_reg_date(String cou_com_reg_date) {
		this.cou_com_reg_date = cou_com_reg_date;
	}
	public String getCou_com_mod_date() {
		return cou_com_mod_date;
	}
	public void setCou_com_mod_date(String cou_com_mod_date) {
		this.cou_com_mod_date = cou_com_mod_date;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getCou_num() {
		return cou_num;
	}
	public void setCou_num(int cou_num) {
		this.cou_num = cou_num;
	}
	
	
}
