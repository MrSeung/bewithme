<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="/resources/css/comment.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
    
<title>com_comment</title>
</head>
<body>

  
    <div class="container">
        
        <!-- 좌측/ 전체 동일한 메뉴바 부분 -->
       <div class="left">
           <img src="/resources/img/logo.png" class="logo" alt="">
           <div class="menu_bar">
               <button><a href=""> 🏠<span> Home</span></a></button><br>
               <button><a href="">📝<span> Subject</span></a></button><br>
               <button><a href="">📖<span class="not"> Community</span></a></button><br>
               <button><a href="">📁<span> Q&A</span></a></button><br>
            </div>
            <div class="sebu">
                <button><a href="">⚙ Setting</a></button><br>
                <button><a href="">🗑 Log out</a></button><br>
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
                <div class="board">
                    <div class="board_header">
                        <p>개발</p>
                        <h1 class="title">spring에서 get과 post의 차이가 뭔디?</h1>
                        <div class="writer">잠이와요정은</div>
                        <div class="reaction">
                            <div class="reaction_left">
                                <span>23.06.29 |</span>
                                <span>
                                    <svg xmlns="http://www.w3.org/2000/svg" width="13" height="13" fill="currentColor" class="bi bi-chat" viewBox="0 0 16 16">
                                        <path d="M2.678 11.894a1 1 0 0 1 .287.801 10.97 10.97 0 0 1-.398 2c1.395-.323 2.247-.697 2.634-.893a1 1 0 0 1 .71-.074A8.06 8.06 0 0 0 8 14c3.996 0 7-2.807 7-6 0-3.192-3.004-6-7-6S1 4.808 1 8c0 1.468.617 2.83 1.678 3.894zm-.493 3.905a21.682 21.682 0 0 1-.713.129c-.2.032-.352-.176-.273-.362a9.68 9.68 0 0 0 .244-.637l.003-.01c.248-.72.45-1.548.524-2.319C.743 11.37 0 9.76 0 8c0-3.866 3.582-7 8-7s8 3.134 8 7-3.582 7-8 7a9.06 9.06 0 0 1-2.347-.306c-.52.263-1.639.742-3.468 1.105z"/>
                                    </svg> 2 |
                                </span>
                                <span>
                                    <svg xmlns="http://www.w3.org/2000/svg" width="13" height="12" fill="currentColor" class="bi bi-suit-heart-fill" viewBox="0 0 16 16">
                                        <path d="M4 1c2.21 0 4 1.755 4 3.92C8 2.755 9.79 1 12 1s4 1.755 4 3.92c0 3.263-3.234 4.414-7.608 9.608a.513.513 0 0 1-.784 0C3.234 9.334 0 8.183 0 4.92 0 2.755 1.79 1 4 1z"/>
                                    </svg> 1
                                </span>
                            </div>
                            <div class="reaction_right">
                                <svg xmlns="http://www.w3.org/2000/svg" width="18" height="13" fill="currentColor" class="bi bi-eye-fill" viewBox="0 0 16 16">
                                    <path d="M10.5 8a2.5 2.5 0 1 1-5 0 2.5 2.5 0 0 1 5 0z"/>
                                    <path d="M0 8s3-5.5 8-5.5S16 8 16 8s-3 5.5-8 5.5S0 8 0 8zm8 3.5a3.5 3.5 0 1 0 0-7 3.5 3.5 0 0 0 0 7z"/>
                                </svg>
                                  163
                            </div>
                        </div>
                    </div><!--class="board_header"-->

                    <div class="line"></div>

                    <div class="board_content">
                        spring공부를 하고 있는데 get과 post의 차이를 이해 못하겠어요. 도와주세요ㅜㅜ. 
                        그리고 그 뿐만이 아닙니다, 저는 잠이 옵니다. 자고싶고 놀고싶고 골드에 가고싶습니다. 
                        그리고 엄청난 천재가되어 자격증 시험도 한번에 붙고싶습니다 음하하 그리고 이건 연습으로 쓴 글이기 떄문에 
                        어디서 짤리려나 잘려랴절려~
                        <img src="/resources/img/it.jpg">
                    </div><!--class="board_content"-->

                    <div class="board_footer">
                        <!-- 이전글/ 다음글 -->
                        
                    </div>

                    <div class="line"></div>
                    
                </div><!--class="board"-->
                
                <!-- 해당 댓글 -->
                <div class="comment">

                    <div class="comment_count">
                        댓글 <span>2</span>
                    </div>

                    <!--작성부분-->
                    <div class="comment_write">
                        <textarea placeholder="내용을 입력해 주세요." maxlength="500" wrap="soft"></textarea>
                        <div class="cw_line"></div>
                        <div>
                            <span>댓글을달아요정은</span>
                            <button type="submit">작성하기</button>
                        </div>
                    </div>

                    <!--댓글리스트 출력부분-->
                    <div class="comment_list">

                        <div class="comment_content">
                            <div>먼저댓글정은</div>
                            <div>게시글 댓그르 첫번째 입니다.</div>
                            
                            <div>
                                <div>
                                    <span>23.07.03 •</span>
                                    <svg xmlns="http://www.w3.org/2000/svg" width="12" height="10" fill="currentColor" class="bi bi-suit-heart-fill" viewBox="0 0 16 16">
                                        <path d="M4 1c2.21 0 4 1.755 4 3.92C8 2.755 9.79 1 12 1s4 1.755 4 3.92c0 3.263-3.234 4.414-7.608 9.608a.513.513 0 0 1-.784 0C3.234 9.334 0 8.183 0 4.92 0 2.755 1.79 1 4 1z"/>
                                    </svg> 
                                    <span>1</span>
                                    <span> • 수정됨</span>
                                </div>
                                
                                <button class="like_button">
                                    <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-suit-heart" viewBox="0 0 16 16">
                                        <path d="m8 6.236-.894-1.789c-.222-.443-.607-1.08-1.152-1.595C5.418 2.345 4.776 2 4 2 2.324 2 1 3.326 1 4.92c0 1.211.554 2.066 1.868 3.37.337.334.721.695 1.146 1.093C5.122 10.423 6.5 11.717 8 13.447c1.5-1.73 2.878-3.024 3.986-4.064.425-.398.81-.76 1.146-1.093C14.446 6.986 15 6.131 15 4.92 15 3.326 13.676 2 12 2c-.777 0-1.418.345-1.954.852-.545.515-.93 1.152-1.152 1.595L8 6.236zm.392 8.292a.513.513 0 0 1-.784 0c-1.601-1.902-3.05-3.262-4.243-4.381C1.3 8.208 0 6.989 0 4.92 0 2.755 1.79 1 4 1c1.6 0 2.719 1.05 3.404 2.008.26.365.458.716.596.992a7.55 7.55 0 0 1 .596-.992C9.281 2.049 10.4 1 12 1c2.21 0 4 1.755 4 3.92 0 2.069-1.3 3.288-3.365 5.227-1.193 1.12-2.642 2.48-4.243 4.38z"/>
                                    </svg>
                                </button>
                            
                            </div>
                            <div class="comment_line"></div>
                        </div>

                        <div class="comment_content">
                            <div>먼저댓글정은</div>
                            <div>게시글 댓그르 두번째 입니다. 이 댓글은 긴글을 확인하기 위해 작성중이며
                                어느정도의 길이까지가 작성이 가능하고, 보여지는지 확인하기 위한 댓글입니다.
                                길이를 한 어느정도까지 보이도록 해놓아야하지? 보여줄길이와 작성 길이 추후에 맞추기!
                            </div>
                            
                            <div>
                                <div>
                                    <span>23.07.03 •</span>
                                    <svg xmlns="http://www.w3.org/2000/svg" width="12" height="10" fill="currentColor" class="bi bi-suit-heart-fill" viewBox="0 0 16 16">
                                        <path d="M4 1c2.21 0 4 1.755 4 3.92C8 2.755 9.79 1 12 1s4 1.755 4 3.92c0 3.263-3.234 4.414-7.608 9.608a.513.513 0 0 1-.784 0C3.234 9.334 0 8.183 0 4.92 0 2.755 1.79 1 4 1z"/>
                                    </svg> 
                                    <span>1</span>
                                    <span> • 수정됨</span>
                                </div>
                                
                                <button class="like_button">
                                    <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-suit-heart" viewBox="0 0 16 16">
                                        <path d="m8 6.236-.894-1.789c-.222-.443-.607-1.08-1.152-1.595C5.418 2.345 4.776 2 4 2 2.324 2 1 3.326 1 4.92c0 1.211.554 2.066 1.868 3.37.337.334.721.695 1.146 1.093C5.122 10.423 6.5 11.717 8 13.447c1.5-1.73 2.878-3.024 3.986-4.064.425-.398.81-.76 1.146-1.093C14.446 6.986 15 6.131 15 4.92 15 3.326 13.676 2 12 2c-.777 0-1.418.345-1.954.852-.545.515-.93 1.152-1.152 1.595L8 6.236zm.392 8.292a.513.513 0 0 1-.784 0c-1.601-1.902-3.05-3.262-4.243-4.381C1.3 8.208 0 6.989 0 4.92 0 2.755 1.79 1 4 1c1.6 0 2.719 1.05 3.404 2.008.26.365.458.716.596.992a7.55 7.55 0 0 1 .596-.992C9.281 2.049 10.4 1 12 1c2.21 0 4 1.755 4 3.92 0 2.069-1.3 3.288-3.365 5.227-1.193 1.12-2.642 2.48-4.243 4.38z"/>
                                    </svg>
                                </button>
                            
                            </div>
                            <div class="comment_line"></div>
                        </div>

                        <div class="comment_content">
                            <div>먼저댓글정은</div>
                            <div>게시글 댓그르 세번째 입니다.</div>
                            
                            <div>
                                <div>
                                    <span>23.07.03 •</span>
                                    <svg xmlns="http://www.w3.org/2000/svg" width="12" height="10" fill="currentColor" class="bi bi-suit-heart-fill" viewBox="0 0 16 16">
                                        <path d="M4 1c2.21 0 4 1.755 4 3.92C8 2.755 9.79 1 12 1s4 1.755 4 3.92c0 3.263-3.234 4.414-7.608 9.608a.513.513 0 0 1-.784 0C3.234 9.334 0 8.183 0 4.92 0 2.755 1.79 1 4 1z"/>
                                    </svg> 
                                    <span> 1</span>
                                    <span> • 수정됨</span>
                                </div>
                                
                                <button class="like_button">
                                    <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-suit-heart" viewBox="0 0 16 16">
                                        <path d="m8 6.236-.894-1.789c-.222-.443-.607-1.08-1.152-1.595C5.418 2.345 4.776 2 4 2 2.324 2 1 3.326 1 4.92c0 1.211.554 2.066 1.868 3.37.337.334.721.695 1.146 1.093C5.122 10.423 6.5 11.717 8 13.447c1.5-1.73 2.878-3.024 3.986-4.064.425-.398.81-.76 1.146-1.093C14.446 6.986 15 6.131 15 4.92 15 3.326 13.676 2 12 2c-.777 0-1.418.345-1.954.852-.545.515-.93 1.152-1.152 1.595L8 6.236zm.392 8.292a.513.513 0 0 1-.784 0c-1.601-1.902-3.05-3.262-4.243-4.381C1.3 8.208 0 6.989 0 4.92 0 2.755 1.79 1 4 1c1.6 0 2.719 1.05 3.404 2.008.26.365.458.716.596.992a7.55 7.55 0 0 1 .596-.992C9.281 2.049 10.4 1 12 1c2.21 0 4 1.755 4 3.92 0 2.069-1.3 3.288-3.365 5.227-1.193 1.12-2.642 2.48-4.243 4.38z"/>
                                    </svg>
                                </button>
                            
                            </div>
                            <div class="comment_line"></div>
                        </div>


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


<script src="resources/js/comment.js"></script>
</body>
</html>