package com.bewithme.www.repository;

import java.util.List;

import com.bewithme.www.domain.CommunityVO;

public interface CommunityDAO {

	int insert(CommunityVO cvo);

	List<CommunityVO> selectList();

	List<CommunityVO> selectReList();

}
