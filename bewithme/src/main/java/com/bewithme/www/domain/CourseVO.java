package com.bewithme.www.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class CourseVO {
	
	private int cou_num;
	private String cou_title;
	private String cou_content;
	private int cou_cnt;
	private String cou_reg_date;
	private String cou_isDel;
	private int sub_num;
	private String id;
	private int cou_count;
	
	
	
	public int getCou_num() {
		return cou_num;
	}
	public void setCou_num(int cou_num) {
		this.cou_num = cou_num;
	}
	public String getCou_title() {
		return cou_title;
	}
	public void setCou_title(String cou_title) {
		this.cou_title = cou_title;
	}
	public String getCou_content() {
		return cou_content;
	}
	public void setCou_content(String cou_content) {
		this.cou_content = cou_content;
	}
	public int getCou_cnt() {
		return cou_cnt;
	}
	public void setCou_cnt(int cou_cnt) {
		this.cou_cnt = cou_cnt;
	}
	public String getCou_reg_date() {
		return cou_reg_date;
	}
	public void setCou_reg_date(String cou_reg_date) {
		this.cou_reg_date = cou_reg_date;
	}
	public String getCou_isDel() {
		return cou_isDel;
	}
	public void setCou_isDel(String cou_isDel) {
		this.cou_isDel = cou_isDel;
	}
	public int getSub_num() {
		return sub_num;
	}
	public void setSub_num(int sub_num) {
		this.sub_num = sub_num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getCou_count() {
		return cou_count;
	}
	public void setCou_count(int cou_count) {
		this.cou_count = cou_count;
	}



	public CourseVO() {}


	public CourseVO(int cou_num, String cou_title, String cou_content, int cou_cnt, String cou_reg_date,
			String cou_isDel, int sub_num, String id, int cou_count) {
		this.cou_num = cou_num;
		this.cou_title = cou_title;
		this.cou_content = cou_content;
		this.cou_cnt = cou_cnt;
		this.cou_reg_date = cou_reg_date;
		this.cou_isDel = cou_isDel;
		this.sub_num = sub_num;
		this.id = id;
		this.cou_count = cou_count;
	}
	
	
	@Override
	public String toString() {
		return "CourseVO [cou_num=" + cou_num + ", cou_title=" + cou_title + ", cou_content=" + cou_content
				+ ", cou_cnt=" + cou_cnt + ", cou_reg_date=" + cou_reg_date + ", cou_isDel=" + cou_isDel + ", sub_num="
				+ sub_num + ", id=" + id + ", cou_count=" + cou_count + "]";
	}
	
	
}
