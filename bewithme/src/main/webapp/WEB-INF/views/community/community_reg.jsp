<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta  http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- include libraries(jQuery, bootstrap) -->
<link href="http://netdna.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.css" rel="stylesheet">
<script src="http://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.js"></script> 
<script src="http://netdna.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.js"></script> 
<!-- include summernote css/js-->
<link href="https://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.11/summernote-bs4.css" rel="stylesheet">
<script src="https://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.11/summernote-bs4.js"></script>
<!-- include summernote-ko-KR -->
<script src="/resources/js/summernote-ko-KR.js"></script>
<link href="/resources/css/register.css" rel="stylesheet">
<script>
$(document).ready(function() {
	
	var setting = {
			placeholder: 'content',
	        height: 450,  
	        minHeight: 370,
	        maxHeight: 500,
	        focus: true, 
	        lang : 'ko-KR'
	};
	
    $('#summernote').summernote(setting);
     
   });
</script>
<title>register</title>
</head>
<body>
   
   <div class="container">
        
        <!-- 좌측/ 전체 동일한 메뉴바 부분 -->
       <div class="left">
           <img src="/resources/img/logo.png" class="logo" alt="">
           <div class="menu_bar">
               <button><a href=""> 🏠<span> Home</span></a></button><br>
               <button><a href="">📝<span> Subject</span></a></button><br>
               <button><a href="/community/communitypage">📖<span class="not"> Community</span></a></button><br>
               <button><a href="">📁<span> Q&A</span></a></button><br>
            </div>
            <div class="sebu">
                <button><a href="">⚙ Setting</a></button><br>
                <button><a href="">🗑 Log out</a></button><br>
            </div>
        </div>
     
        <!-- 우측/ Comment 부분 -->
        <div class="right">
        
        
           <div class="wcontent">
                 
            <div class="wleft">
               
               <div class="head">
                  <a href="/community/communitypage">
                     <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" color="white" fill="currentColor" class="bi bi-chevron-left" viewBox="0 0 16 16">
                        <path fill-rule="evenodd" d="M11.354 1.646a.5.5 0 0 1 0 .708L5.707 8l5.647 5.646a.5.5 0 0 1-.708.708l-6-6a.5.5 0 0 1 0-.708l6-6a.5.5 0 0 1 .708 0z"/>
                     </svg>
                  </a>
                  <h4>게시글 작성</h4>
               </div>  
                 
               <div class="title">
                  <p>제목</p>
                  <input type="text"  id="com_title" placeholder="제목을 입력해주세요">
               </div>
               
               <div>
                  <p>닉네임</p>
                  <input type="text" id="nickname" value="임의 닉네임" >
                  <input type="hidden" id="id" value="1111">
               </div>
               
               <div>
                  <p>작성일자</p>
                  <input type="text" name="com_reg_date" id="com_reg_date" readonly="readonly">
               </div>
               
               <div>
               	   <p>카테고리</p>
	               <div class="category">
	             		<input type="radio" id="category1" name="com_category" checked="checked" value="개발"><label for="category1">개발</label>
	     				<input type="radio" id="category2" name="com_category" value="상담"><label for="category2">상담</label>
	               </div>  
               </div>
               
               <div class="file_list">
                        <hr>
                        <p>파일</p>
                  <button type="submit">파일 첨부 + </button>
               	  <div class="files">
               	  	<!-- 파일이 출력되는 자리 -->
               	  </div>
               </div>
               
               <div class="line"></div>
            
            </div>
            <div class="wright">
	            <div class="wtitle">
	                <h4>✍ 상세 설명</h4>
	                <input id="subBtn" type="button" value="저장" class="wbutton"
	                     onclick="goWrite(this.form)"/>
	            </div>
	               <!-- 썸머노트 들어갈 곳 -->
	            <div style=" margin: auto;" class="summer">
	                     <textarea id="summernote"></textarea>
	            </div>
           	</div>
      	</div>
       
      </div>
      	
     <script type="text/javascript" src="/resources/js/community_reg.js"></script>
     <script type="text/javascript">
	     let today = new Date();
	     let year = today.getFullYear();
	     let month = ('0' + (today.getMonth() + 1)).slice(-2);
	     let day = ('0' + today.getDate()).slice(-2);
	
	     let com_reg_date = year + '-' + month  + '-' + day;
	     
	     document.getElementById("com_reg_date").value = com_reg_date;
     </script>
     
</body>
</html>