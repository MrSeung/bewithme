package com.bewithme.www.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bewithme.www.domain.CommunityVO;

public interface CommunityService {

	int insertCommunity(CommunityVO cvo);

	List<CommunityVO> selectComunnityList();

	List<CommunityVO> selectRecommendList();

}
