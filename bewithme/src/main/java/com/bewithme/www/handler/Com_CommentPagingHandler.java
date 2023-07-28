package com.bewithme.www.handler;

import com.bewithme.www.domain.Com_CommentPagingVO;

public class Com_CommentPagingHandler {

	private int startPage;
	private int endPage;
	private boolean prev, next;
	private int totalCount; 
	private Com_CommentPagingVO pgvo;
		
	public Com_CommentPagingHandler(Com_CommentPagingVO pgvo, int totalCount) {
		this.pgvo = pgvo;
		this.totalCount = totalCount;
			
		this.endPage =(int)(Math.ceil(pgvo.getCommentNo() / (pgvo.getCty()*1.0)) * pgvo.getCty());
		this.startPage = this.endPage - (pgvo.getCty() -1);
		
		int lastPage = (int)(Math.ceil((totalCount*1.0) / pgvo.getCty()));
			
		if(lastPage < this.endPage) { 
			this.endPage = lastPage;
		}
		
		//다음버튼과 이전버튼
		this.prev = this.startPage > 1; 
		this.next = this.endPage < lastPage;
		}

		public int getStartPage() {
			return startPage;
		}

		public void setStartPage(int startPage) {
			this.startPage = startPage;
		}

		public int getEndPage() {
			return endPage;
		}

		public void setEndPage(int endPage) {
			this.endPage = endPage;
		}

		public boolean isPrev() {
			return prev;
		}

		public void setPrev(boolean prev) {
			this.prev = prev;
		}

		public boolean isNext() {
			return next;
		}

		public void setNext(boolean next) {
			this.next = next;
		}

		public int getTotalCount() {
			return totalCount;
		}

		public void setTotalCount(int totalCount) {
			this.totalCount = totalCount;
		}

		public Com_CommentPagingVO getPgvo() {
			return pgvo;
		}

		public void setPgvo(Com_CommentPagingVO pgvo) {
			this.pgvo = pgvo;
		}
		
		
	
}
