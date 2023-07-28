package com.bewithme.www.service;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.bewithme.www.domain.Com_CommentPagingVO;
import com.bewithme.www.domain.Com_CommentVO;
import com.bewithme.www.domain.Com_Comment_LikeVO;
import com.bewithme.www.domain.Community_LikeVO;
import com.bewithme.www.repository.Com_CommentDAO;
import com.bewithme.www.repository.Com_Comment_LikeDAO;
import com.bewithme.www.repository.CommunityDAO;

@Service
public class Com_CommentServiceImpl implements Com_CommentService{

	private static final Logger log = LoggerFactory.getLogger(Com_CommentServiceImpl.class);
	
	@Inject
	private Com_CommentDAO ccdao;
	@Inject
	private CommunityDAO cdao;
	@Inject
	private Com_Comment_LikeDAO ccldao;
	
	@Override
	public int insertCom_Comment(Com_CommentVO ccvo) {
		//댓글 저장
		log.info("com_comment ServiceImpl insert in!");
		int com_num = ccvo.getCom_num();
		int isOk = ccdao.insert(ccvo);
		if(isOk>0) {
			log.info(">>> com_comment insert 성공");
			isOk *= cdao.updateCom_comment_cntUp(com_num);
		}
		return isOk;
	}

	@Override
	public List<Com_CommentVO> selectCom_commentList(int com_num) {
		//댓글 리스트 출력
		log.info("com_comment ServiceImpl list in!");
		log.info(">>> serviceImpl com_num : "+com_num);
		return ccdao.selectList(com_num);
	}

	@Override
	public List<Integer> getLikeCom_CommentCnt(String id) {
		// 해당 id에 맞는 좋아요 한 댓글 번호 리턴
		log.info("com_comment ServiceImpl getLikeCommentCnt in!");
		return ccldao.getLikeCom_CommentCnt(id);
	}
	
	@Override
	public int modifyCom_Comment(Com_CommentVO ccvo) {
		//댓글 수정
		log.info("com_comment ServiceImpl modify in!");
		return ccdao.update(ccvo);
	}
	
	@Override
	public int deleteCom_Comment(int com_com_num) {
		//댓글 삭제
		log.info("com_comment ServiceImpl delete in!");
		int com_num = ccdao.getCom_num(com_com_num); //해당 댓글이 위치한 게시글 번호
		log.info("-----------------------" + com_num);
		int isOk = ccdao.delete(com_com_num); //댓글 삭제
		if(isOk>0) {
			log.info(">>> com_comment delete 성공");
			//해당 댓글을 좋아요한 데이터 전체 삭제 (좋아요테이블에서 id 관련없이 해당 댓글의 좋아요 삭제)
			int isLikeOk = ccldao.deleteAllCommentLike(com_com_num);
			log.info(">>> isLikeOK (삭제된 좋아요 데이터) " + isLikeOk);
			//해당 게시글의 댓글 갯수 -1
			isOk *= cdao.updateCom_comment_cntDown(com_num);
		}
		return isOk;
	}

	@Override
	public int updateCom_CommentLike(Com_Comment_LikeVO cclvo) {
		//좋아요 업데이트(community_like에 추가/삭제 -> community like_cnt 자동 업데이트 설정)
		log.info("com_comment ServiceImpl updateCommunityLike in!");
		
		//com_comment_like에 있는지 확인
		int isLike = ccldao.isLike(cclvo);
		if(isLike > 0) { //좋아요 취소
			int isOk = ccldao.delete(cclvo); //com_comment_like테이블에서 삭제
			
			int com_com_num = cclvo.getCom_com_num(); //cclvo로 가져온 댓글 번호
			int com_like_cnt = ccldao.selectLikeCnt(com_com_num); //댓글당 총 좋아요 수 가져오기
			return ccdao.updateLike(com_com_num, com_like_cnt); //댓글당 총 좋아요수 변경
			
		}else { //좋아요 
			int isOk = ccldao.insert(cclvo);
			
			int com_com_num = cclvo.getCom_com_num(); 
			int com_com_like_cnt = ccldao.selectLikeCnt(com_com_num);
			return ccdao.updateLike(com_com_num, com_com_like_cnt);
		}
	}

	@Override
	public int getTotalCmtCnt(Com_CommentPagingVO pgvo) {
		// 해당 게시글의 댓글 총 개수 구하기
		log.info("com_comment ServiceImpl getTotalCmtCnt in!");
		return ccdao.selectCommentCnt(pgvo.getCommentNo());
	}

	
}
