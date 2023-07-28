package com.bewithme.www.domain;

public class Com_CommentPagingVO {

	private int commentNo; //현재 화면에 출력된 댓글 페이지의 번호
	private int cty; //한페이지당 보여지는 댓글의 수
	
	public Com_CommentPagingVO() {
		this(1,5);
	}
	public Com_CommentPagingVO(int commentNo, int cty) {
		this.commentNo = commentNo;
		this.cty = cty;
	}
	
	public int getCommentStart() { //출력될 게시글의 시작 번호 (DB상 limit에 시작값을 구하는 메서드) 
		return (this.commentNo-1)*cty; 
	}
	
	//setter,getter
	public int getCommentNo() {
		return commentNo;
	}
	public void setCommentNo(int pageNo) {
		this.commentNo = pageNo;
	}
	public int getCty() {
		return cty;
	}
	public void setCty(int qty) {
		this.cty = qty;
	}
		
	@Override
	public String toString() {
		return "PagingVO [commentNo=" + commentNo + ", cty=" + cty + ", keyword=" + keyword + ", type=" + type + "]";
	}
		
	
	
	//검색 부분
	private String keyword;
	private String type;

	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	//타입이 두개이상인 경우 생성자 (여러가지의 타입을 같이 검색에 사용하기 위해서 배열 사용)
	public String[] getTypeToArray() {
		return this.type == null? new String[] {} : this.type.split("");
	
	}
	
	
}
