<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/resources/css/community.css">
<<<<<<< HEAD
    <link rel="stylesheet" href="https://unpkg.com/swiper@6.4.5/swiper.scss">
=======
>>>>>>> 2584c0c985f792a78db57c7e936ac034698a1193
<title>community</title>
</head>
<body>
	<div class="container">

        <!-- 좌측/ 전체 동일한 메뉴바 부분 -->
        <div class="left">
            <img src="/resources/img/logo.png" class="logo" alt="">
            <div class="menu_bar">
<<<<<<< HEAD
                <button><a href="/menu/home"> 🏠<span> Home</span></a></button><br>
                <button><a href="/menu/subject">📝<span> Subject</span></a></button><br>
                <button><a href="/menu/community">📖<span class="not"> Community</span></a></button><br>
                <button><a href="/menu/qna">📁<span> Q&A</span></a></button><br>
=======
                <button da><a href=""> 🏠<span> Home</span></a></button><br>
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

        <!-- 우측/ Community 부분 -->
        <div class="right">

            <!-- 고정/ 메뉴 선택 -->
            <div class="nav_bar">
                <div class="navBtns">
                    <button value="전체"  onclick="kindVal('전체');"> 전체 </button>
                    <button value="개발"  onclick="kindVal('개발');"> 개발 </button>
                    <button value="상담" onclick="kindVal('상담');"> 상담 </button>
                    <button value="MY" onclick="kindVal('MY');"> MY </button>
                </div>
	            <a href="/community/insert" class="question">
	               <button>💡 질문하기</button>
	            </a>
           </div>
            <div class="nav_line"></div>
   
            <!-- 스크롤/ 게시판 리스트 -->
            <div class="main">

                <div class="recommend_coment" id="recommend_coment">

                    <span>오늘의 추천 질문</span>

                    <div class="button_list">
                   		<!-- 추천질문 좌/우 이동 -->
                        <button class="button_left">
                            <svg xmlns="http://www.w3.org/2000/svg" width="23" height="23" fill="currentColor" class="bi bi-arrow-left" viewBox="0 0 16 16">
                                <path fill-rule="evenodd" d="M15 8a.5.5 0 0 0-.5-.5H2.707l3.147-3.146a.5.5 0 1 0-.708-.708l-4 4a.5.5 0 0 0 0 .708l4 4a.5.5 0 0 0 .708-.708L2.707 8.5H14.5A.5.5 0 0 0 15 8z"/>
                            </svg>
                        </button>
                        <button class="button_right">
                            <svg xmlns="http://www.w3.org/2000/svg" width="23" height="23" fill="currentColor" class="bi bi-arrow-right" viewBox="0 0 16 16">
                                <path fill-rule="evenodd" d="M1 8a.5.5 0 0 1 .5-.5h11.793l-3.147-3.146a.5.5 0 0 1 .708-.708l4 4a.5.5 0 0 1 0 .708l-4 4a.5.5 0 0 1-.708-.708L13.293 8.5H1.5A.5.5 0 0 1 1 8z"/>
                            </svg>
                        </button>
                    </div>


                </div>

                <div class="recommend" id="recommend">
                    <!-- 추천 게시판 출력 부분 -->
                </div>
            

                <div class="sort_bar">
                    <div class="sort">
                        <button> 최신순 </button>
                        <button> 인기순 </button> 
                    </div>

                    <div class="search">
                        <img src="/resources/img/q.png">
                        <input type="text" name="keyword"  placeholder="키워드로 검색" value="${ph.sh.keyword}">
                    </div>
                </div>
                <div class="main_line"></div>

                <div class="board" id="board">
                    <!-- 게시판 출력 부분 -->
        		</div>
	</div>
	</div>
</div>

<script type="text/javascript" src="../resources/js/community.js"></script>
<script type="text/javascript">
	const id = '<c:out value="1111" />'
	getRecommendList("전체");
	getCommunityList(0,"전체");
</script>

</body>
</html>