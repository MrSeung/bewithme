package com.bewithme.www.repository;

import java.util.List;

import com.bewithme.www.domain.Community_LikeVO;

public interface Community_LikeDAO {

	int insert(Community_LikeVO clvo);

	int selectLikeCnt(int com_num);

	int isLike(Community_LikeVO clvo);

	int delete(Community_LikeVO clvo);

	List<Integer> getLikeCommentCnt(String id);

}
