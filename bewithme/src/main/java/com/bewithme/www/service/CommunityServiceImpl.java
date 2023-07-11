package com.bewithme.www.service;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.bewithme.www.domain.CommunityVO;
import com.bewithme.www.repository.CommunityDAO;

@Service
public class CommunityServiceImpl implements CommunityService{

	private static final Logger log = LoggerFactory.getLogger(CommunityServiceImpl.class);
	
	@Inject
	private CommunityDAO cdao;

	@Override
	public int insertCommunity(CommunityVO cvo) {
		log.info("community ServiceImpl register in!");
		return cdao.insert(cvo);
	}

	@Override
	public List<CommunityVO> selectComunnityList() {
		log.info("community ServiceImpl selectComunnityList in!");
		return cdao.selectList();
	}

	@Override
	public List<CommunityVO> selectRecommendList() {
		log.info("community ServiceImpl selectRecommendList in!");
		return cdao.selectReList();
	}
}
