package com.bewithme.www.domain;

public class CommunityVO {

	private int com_num;
	private String com_title;
	private String com_content;
	private int com_cnt;
	private String com_category;
	private String com_reg_date;
	private String com_isDel;
	private String id; //user연결
	
	//getter,setter
	public int getCom_num() {
		return com_num;
	}
	public void setCom_num(int com_num) {
		this.com_num = com_num;
	}
	public String getCom_title() {
		return com_title;
	}
	public void setCom_title(String com_title) {
		this.com_title = com_title;
	}
	public String getCom_content() {
		return com_content;
	}
	public void setCom_content(String com_content) {
		this.com_content = com_content;
	}
	public int getCom_cnt() {
		return com_cnt;
	}
	public void setCom_cnt(int com_cnt) {
		this.com_cnt = com_cnt;
	}
	public String getCom_category() {
		return com_category;
	}
	public void setCom_category(String com_category) {
		this.com_category = com_category;
	}
	public String getCom_reg_date() {
		return com_reg_date;
	}
	public void setCom_reg_date(String com_reg_date) {
		this.com_reg_date = com_reg_date;
	}
	public String getCom_isDel() {
		return com_isDel;
	}
	public void setCom_isDel(String com_isDel) {
		this.com_isDel = com_isDel;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "CommunityVO [com_num=" + com_num + ", com_title=" + com_title + ", com_content=" + com_content
				+ ", com_cnt=" + com_cnt + ", com_category=" + com_category + ", com_reg_date=" + com_reg_date
				+ ", com_isDel=" + com_isDel + ", id=" + id + "]";
	}
	
	//생성자
	public CommunityVO() {}
	
	
	//전체
	public CommunityVO(int com_num, String com_title, String com_content, int com_cnt, String com_category,
			String com_reg_date, String com_isDel, String id) {
		this.com_num = com_num;
		this.com_title = com_title;
		this.com_content = com_content;
		this.com_cnt = com_cnt;
		this.com_category = com_category;
		this.com_reg_date = com_reg_date;
		this.com_isDel = com_isDel;
		this.id = id;
	}
	
	//게시판 저장 register
	public CommunityVO(String com_title, String com_content, String com_category, String id) {
		this.com_title = com_title;
		this.com_content = com_content;
		this.com_category = com_category;
		this.id = id;
	}

	
	
	
	
	
	
}