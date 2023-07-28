package com.bewithme.www.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.bewithme.www.Handler.FileHandler;
import com.bewithme.www.domain.Com_FileVO;
import com.bewithme.www.domain.CommunityVO;
import com.bewithme.www.domain.Community_LikeVO;
import com.bewithme.www.service.CommunityService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/community/*")
public class CommunityController {

	private static final Logger log = LoggerFactory.getLogger(CommunityController.class);
	
	@Inject
	private CommunityService csv;
	@Inject
	private FileHandler fhd;
	
	//community_reg page로 이동
	@GetMapping("/insert")
	public String insertComunnityGet(){
		return "/community/community_reg";
	}
	
	//community insert
	@PostMapping(value="/insert", consumes="application/json", produces = {MediaType.TEXT_PLAIN_VALUE})
	public ResponseEntity<String> insertComunnityPost(@RequestBody CommunityVO cvo, 
			@RequestParam(name="files", required = false)MultipartFile[] files) {
		log.info(">>> cvo : " + cvo.toString());
		
		List<Com_FileVO> fList = null;
		//file 처리 handler로 처리
		if(files[0].getSize()>0) { //데이터가 있다 라는 것을 의미
			//파일 배열을 경로설정, fvo set 다 해서 리스트로 리턴
			fList = fhd.uploadFiles(files); 
		}else {
			log.info("file null");
		}
		
		int isOk = csv.insertCommunity(cvo);
		
		return isOk > 0? new ResponseEntity<String>("1",HttpStatus.OK)
				: new ResponseEntity<String>("0",HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	//썸머노트 이미지 코드 수정
	  @RequestMapping(value="/SummerNoteImageFile" , method = RequestMethod.POST)
		public @ResponseBody String SummerNoteImageFile(@RequestParam("file") MultipartFile file) {
		  log.info("file : "+ file);
			String url = csv.SummerNoteImageFile(file);
			 System.out.println(url);
			return url;
		}
	
	//community page로 이동
	@GetMapping({"/community", "/communitypage"})
	public String CommunityPage(){
		return "/community/community";
	}
	
	//community page의 recommedList 출력
	@GetMapping(value="/recommendList", produces = {MediaType.APPLICATION_JSON_VALUE} )
	public ResponseEntity<List<CommunityVO>> selectReCommunityList(){
		
		List<CommunityVO> recommendList = csv.selectRecommendList();
	    return new ResponseEntity<>(recommendList, HttpStatus.OK);
	    
	}
	
	//community page의 communityList 출력
	@GetMapping(value="/communityList/{sort_type}", produces = {MediaType.APPLICATION_JSON_VALUE} )
	public ResponseEntity<Map<String, Object>> selectCommunityList(@PathVariable("sort_type") String sortType,  HttpServletRequest request){
		
		HttpSession ses = request.getSession();
		Map<String, Object> listMap = new HashMap<>(); 
		
		//해당id가 좋아요한 게시글 번호리스트
		String id = "2222";
		List<Integer> likeList = csv.getLikeCommentCnt(id); 
		listMap.put("likeList", likeList);
		log.info(">>> likeList :"+likeList);
		//최신순, 인기순 별 게시글 전체 리스트
		if (sortType.equals("0")) {
		        // 최신순
				List<CommunityVO> communityList = csv.selectComunnityListByLatest();
		        listMap.put("communityList", communityList);
		    } else if (sortType.equals("1")) {
		        // 인기순
		    	List<CommunityVO> communityList = csv.selectComunnityListByPopularity();
		        listMap.put("communityList", communityList);
		    } else {
		        // 잘못된 sort_type 값
		        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		    }
		    return new ResponseEntity<>(listMap, HttpStatus.OK);
	}
	
	
	//detail을 가져오는 
	@GetMapping({"/detail","/modify"})
	public String detailCommunity(@RequestParam("com_num")int com_num,  HttpServletRequest request, Model m){
		
		log.info(">>> com_num : " + com_num);
		log.info(">>> mapping : " + request.getRequestURI());
		
		CommunityVO cvo = csv.detailCommunity(com_num);
		log.info(">>> com_num의 cvo : " + cvo.toString());
		
		String path = request.getRequestURI().substring(request.getRequestURI().lastIndexOf("/")+1);
		log.info(">>> path : " + path);
		if(path.equals("detail")) {
			int isOk = csv.updateCommunityCount(com_num);
			log.info("com_cnt +1 : OK!");
		}
		
		int commentCnt = csv.selectCommentCnt(com_num);
		m.addAttribute("comment_cnt", commentCnt);
		m.addAttribute("cvo", cvo);
		return "/community/com_comment";
	} 
	
	//좋아요 업데이트(community_like에 추가/삭제 -> community like_cnt 자동 업데이트)
	@GetMapping(value="/updateLike/{btnVal}", produces = {MediaType.TEXT_PLAIN_VALUE})
	public ResponseEntity<String> updateCommunityLike(@PathVariable("btnVal") int com_num, HttpServletRequest request){
		
		log.info(">>> com_num : " + com_num);
		HttpSession ses = request.getSession();
		Community_LikeVO clvo = new Community_LikeVO("2222", com_num);
		
		int isOk = csv.updateCommunityLike(clvo);
		log.info(">>> isOk : " + isOk);
		
		return isOk > 0? new ResponseEntity<String>("1",HttpStatus.OK)
				: new ResponseEntity<String>("0",HttpStatus.INTERNAL_SERVER_ERROR);
	}	
	
	
	
}

