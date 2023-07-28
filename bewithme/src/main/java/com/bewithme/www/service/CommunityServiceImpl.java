package com.bewithme.www.service;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.bewithme.www.domain.CommunityVO;
import com.bewithme.www.domain.Community_LikeVO;
import com.bewithme.www.repository.Com_CommentDAO;
import com.bewithme.www.repository.CommunityDAO;
import com.bewithme.www.repository.Community_LikeDAO;

@Service
public class CommunityServiceImpl implements CommunityService{

	private static final Logger log = LoggerFactory.getLogger(CommunityServiceImpl.class);
	
	@Inject
	private CommunityDAO cdao;
	@Inject
	private Community_LikeDAO cldao;
	@Inject
	private Com_CommentDAO ccdao;
	
	@Override
	public int insertCommunity(CommunityVO cvo) {
		//게시글 저장
		log.info("community ServiceImpl register in!");
		return cdao.insert(cvo);
	}


	@Override
	public List<CommunityVO> selectComunnityListByLatest() {
		//게시글 최신순 리스트 출력
		log.info("community ServiceImpl selectComunnityListByLatest in!");
		return cdao.selectListByLatest();
	}
	
	@Override
	public List<Integer> getLikeCommentCnt(String id) {
		// 해당 id에 맞는 좋아요한 게시글 번호 리턴
		log.info("community ServiceImpl getLikeCommentCnt in!");
		return cldao.getLikeCommentCnt(id);
	}
	
	@Override
	public List<CommunityVO> selectComunnityListByPopularity() {
		//게시글 인기순(좋아요순) 리스트 출력 
		log.info("community ServiceImpl selectComunnityListByPopularity in!");
		return cdao.selectListByPopularity();
	}

	@Override
	public List<CommunityVO> selectRecommendList() {
		//오늘의 추천 게시글 리스트 출력(조회수순)
		log.info("community ServiceImpl selectRecommendList in!");
		return cdao.selectRecommendList();
	}

	@Override
	public CommunityVO detailCommunity(int com_num) {
		//게시글 디테일 출력
		log.info("community ServiceImpl detailCommunity in!");
		return cdao.selectOne(com_num);
	}

	@Override
	public int updateCommunityCount(int com_num) {
		//게시글 조회수 증가
		log.info("community ServiceImpl updateCommunityCount in!");
		return cdao.updateCom_cnt(com_num);
	}


	@Override
	public int updateCommunityLike(Community_LikeVO clvo) {
		//좋아요 업데이트(community_like에 추가/삭제 -> community like_cnt 자동 업데이트 설정)
		log.info("community ServiceImpl updateCommunityLike in!");
		
		//community_like에 있는지 확인
		int isLike = cldao.isLike(clvo);
		if(isLike > 0) { //좋아요 취소
			int isOk = cldao.delete(clvo); //community_like테이블에서 삭제
			
			int com_num = clvo.getCom_num(); //clvo로 가져온 게시글 번호
			int com_like_cnt = cldao.selectLikeCnt(com_num); //게시글당 총 좋아요 수 가져오기
			return cdao.updateLike(com_num, com_like_cnt); //게시글당 총 좋아요수 변경
			
		}else { //좋아요 
			int isOk = cldao.insert(clvo);
			
			int com_num = clvo.getCom_num(); 
			int com_like_cnt = cldao.selectLikeCnt(clvo.getCom_num());
			return cdao.updateLike(com_num, com_like_cnt);
		}
	}
	
	@Override
	public int selectCommentCnt(int com_num) {
		//게시판 당 댓글 수 
		log.info("community ServiceImpl selectCommentCnt in!");
		return ccdao.selectCommentCnt(com_num);
	}


	@Override
	public List<CommunityVO> selectComunnitySearchList(String searchKeyword) {
		// 검색된 게시글 리스트 출력
		log.info("community ServiceImpl selectComunnitySearchList in!");
		return cdao.selectSearchList(searchKeyword);
	}


	
	
	
	
}

