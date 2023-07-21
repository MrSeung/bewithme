<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="/resources/css/com_comment.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
    
<title>com_comment</title>
</head>
<body>

  
    <div class="container">
        
        <!-- 좌측/ 전체 동일한 메뉴바 부분 -->
       <div class="left">
           <img src="/resources/img/logo.png" class="logo" alt="">
<<<<<<< HEAD
            <div class="menu_bar">
                <button><a href="/menu/home"> 🏠<span> Home</span></a></button><br>
                <button><a href="/menu/subject">📝<span> Subject</span></a></button><br>
                <button><a href="/menu/community">📖<span class="not"> Community</span></a></button><br>
                <button><a href="/menu/qna">📁<span> Q&A</span></a></button><br>
=======
           <div class="menu_bar">
               <button><a href=""> 🏠<span> Home</span></a></button><br>
               <button><a href="">📝<span> Subject</span></a></button><br>
               <button><a href="/community/communitypage">📖<span class="not"> Community</span></a></button><br>
               <button><a href="">📁<span> Q&A</span></a></button><br>
>>>>>>> 2584c0c985f792a78db57c7e936ac034698a1193
            </div>
            <div class="sebu">
                <button><a href="">⚙ Setting</a></button><br>
                <button><a href="/member/logout">🗑 Log out</a></button><br>
            </div>
        </div>
        <!-- 우측/ Comment 부분 -->
        <div class="right">
            
            <!-- 고정/ 메뉴 선택 -->
            <div class="nav_bar">
                <div class="nav">
                    <button> 전체 </button>
                    <button> 개발 </button>
                    <button> 상담 </button>
                    <button> MY </button>
                </div>
                <a href="#" class="question">
                    <button>💡 질문하기</button>
                </a>
            </div>
            <div class="nav_line"></div>
            
            
            <!-- 스크롤/ 게시글, 댓글 출력 -->
            <div class="main">  
                
                <a href="#end" id="top"></a>
                
                <!-- 게시글 -->
                <c:set var="cvo" value="${cvo}"></c:set>
                <div class="board">
                    <div class="board_header">
                        <p>${cvo.com_category}</p>
                        <h1 class="title">${cvo.com_title}</h1>
                        <div class="writer">${cvo.nickname}</div>
                        <div class="reaction">
                            <div class="reaction_left">
                                <span>${cvo.com_reg_date} |</span>
                                <span>
                                    <svg xmlns="http://www.w3.org/2000/svg" width="13" height="13" fill="currentColor" class="bi bi-chat" viewBox="0 0 16 16">
                                        <path d="M2.678 11.894a1 1 0 0 1 .287.801 10.97 10.97 0 0 1-.398 2c1.395-.323 2.247-.697 2.634-.893a1 1 0 0 1 .71-.074A8.06 8.06 0 0 0 8 14c3.996 0 7-2.807 7-6 0-3.192-3.004-6-7-6S1 4.808 1 8c0 1.468.617 2.83 1.678 3.894zm-.493 3.905a21.682 21.682 0 0 1-.713.129c-.2.032-.352-.176-.273-.362a9.68 9.68 0 0 0 .244-.637l.003-.01c.248-.72.45-1.548.524-2.319C.743 11.37 0 9.76 0 8c0-3.866 3.582-7 8-7s8 3.134 8 7-3.582 7-8 7a9.06 9.06 0 0 1-2.347-.306c-.52.263-1.639.742-3.468 1.105z"/>
                                    </svg> ${comment_cnt} |
                                </span>
                                <span>
                                    <svg xmlns="http://www.w3.org/2000/svg" width="13" height="12" fill="currentColor" class="bi bi-suit-heart-fill" viewBox="0 0 16 16">
                                        <path d="M4 1c2.21 0 4 1.755 4 3.92C8 2.755 9.79 1 12 1s4 1.755 4 3.92c0 3.263-3.234 4.414-7.608 9.608a.513.513 0 0 1-.784 0C3.234 9.334 0 8.183 0 4.92 0 2.755 1.79 1 4 1z"/>
                                    </svg> ${cvo.com_like_cnt}
                                </span>
                            </div>
                            <div class="reaction_right">
                                <svg xmlns="http://www.w3.org/2000/svg" width="18" height="13" fill="currentColor" class="bi bi-eye-fill" viewBox="0 0 16 16">
                                    <path d="M10.5 8a2.5 2.5 0 1 1-5 0 2.5 2.5 0 0 1 5 0z"/>
                                    <path d="M0 8s3-5.5 8-5.5S16 8 16 8s-3 5.5-8 5.5S0 8 0 8zm8 3.5a3.5 3.5 0 1 0 0-7 3.5 3.5 0 0 0 0 7z"/>
                                </svg>
                                  ${cvo.com_cnt}
                            </div>
                        </div>
                    </div><!--class="board_header"-->

                    <div class="line"></div>

                    <div class="board_content">
                        ${cvo.com_content}
                    </div><!--class="board_content"-->

                    <div class="board_footer">
                        <!-- 이전글/ 다음글 -->
                        
                    </div>

                    <div class="line"></div>
                    
                </div><!--class="board"-->
                
                <!-- 해당 댓글 -->
                <div class="comment">

                    <div class="comment_count">
                        댓글 <span>${comment_cnt}</span>
                    </div>

                    <!--작성부분-->
                    <div class="comment_write">
                        <textarea placeholder="내용을 입력해 주세요." maxlength="500" wrap="soft" id="com_com_content"></textarea>
                        <div class="cw_line"></div>
                        <div>
                            <span>{ses.nickname}</span>
                            <button type="submit" id="subBtn">작성하기</button>
                        </div>
                    </div>

                    <div class="comment_list" id="comment_list">
                    <!--댓글리스트 출력부분-->
                    </div>

                </div><!--class="comment"-->
                
            </div><!--class="main"-->
            
            <div class="up">
                <a href="#top" id="end"> 
                    <span class="material-symbols-outlined">
                            arrow_upward
                    </span>
                </a>
            </div>

        </div><!--class="right"-->

</div>


<<<<<<< HEAD
<script src="/resources/js/comment.js"></script>
=======
<script type="text/javascript" src="/resources/js/com_comment.js"></script>
<script type="text/javascript">
	const com_num = '<c:out value="${cvo.com_num}" />';
	getCommentList(com_num)
</script>

>>>>>>> 2584c0c985f792a78db57c7e936ac034698a1193
</body>
</html>