<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/resources/css/community.css">
    <link rel="stylesheet" href="https://unpkg.com/swiper@6.4.5/swiper.scss">
<title>community</title>
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

        <!-- 우측/ Community 부분 -->
        <div class="right">

            <!-- 고정/ 메뉴 선택 -->
            <div class="nav_bar">
                <div class="nav">
                    <button> 전체 </button>
                    <button> 개발 </button>
                    <button> 상담 </button>
                    <button> MY </button>
                </div>
	            <a href="/community/insert" class="question">
	               <button>💡 질문하기</button>
	            </a>
           </div>
            <div class="nav_line"></div>
            
            <!-- 스크롤/ 게시판 리스트 -->
            <div class="main">

                <div class="recommend_coment">

                    <span>오늘의 추천 질문</span>

                    <div class="button_list">
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
                        <input type="text" placeholder="키워드로 검색">
                    </div>
                </div>
                <div class="main_line"></div>

                <div class="board" id="board">
                    <!-- 게시판 출력 부분 -->
        		</div>
	</div>
</div>
<script src="/resources/js/community.js"></script>
<script type="text/javascript">
	getCommunityList();
</script>
</body>
</html>