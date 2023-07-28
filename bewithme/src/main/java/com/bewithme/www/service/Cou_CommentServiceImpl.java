package com.bewithme.www.service;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.bewithme.www.domain.Cou_CommentVO;
import com.bewithme.www.repository.Cou_CommentDAO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class Cou_CommentServiceImpl implements Cou_CommentService {

	@Inject
	private Cou_CommentDAO ccdao;

	private static final Logger log = LoggerFactory.getLogger(Cou_CommentServiceImpl.class);
	
	@Override
	public int register(Cou_CommentVO ccvo) {
		log.info("cou댓글 insert서비스 진입!");
		return ccdao.register(ccvo);
	}

	@Override
	public List<Cou_CommentVO> getList(int cou_num) {
		log.info("cou댓글 뿌리는 서비스 진입!");
		return ccdao.getList(cou_num);
	}

	@Override
	public int edit(Cou_CommentVO ccvo) {
		log.info("cou댓글 수정 서비스 진입!");
		return ccdao.edit(ccvo);
	}

	@Override
	public int remove(int cou_com_num) {
		log.info("cou댓글 삭제 서비스 진입!");
		return ccdao.remove(cou_com_num);
	}
	


}
