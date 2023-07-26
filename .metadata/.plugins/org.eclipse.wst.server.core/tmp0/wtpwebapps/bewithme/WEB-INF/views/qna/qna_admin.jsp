<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="/resources/css/qna_admin.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
    
<title>com_comment</title>
</head>
<body>

  
    <div class="container">
        
        <!-- 좌측/ 전체 동일한 메뉴바 부분 -->
       <div class="left">
           <img src="/resources/img/logo.png" class="logo" alt="">
            <div class="menu_bar">
                <button><a href="/menu/home"> 🏠<span> Home</span></a></button><br>
                <button><a href="/menu/subject">📝<span> Subject</span></a></button><br>
                <button><a href="/menu/community">📖<span> Community</span></a></button><br>
                <button><a href="/menu/qna">📁<span class="not"> Q&A</span></a></button><br>
            </div>
            <div class="sebu">
                <button><a href="">⚙ Setting</a></button><br>
                <button><a href="/member/logout">🗑 Log out</a></button><br>
            </div>
        </div>
        <!-- 우측/ Comment 부분 -->
<div class="right">
      <div class="inbox_msg">
        <!-- 채팅 리스트 -->
        <div class="inbox_people">
          <div class="headind_srch">
            <div class="recent_heading">
              <h4>Recent</h4>
            </div>

          </div>
          <div class="inbox_chat" id="inbox_chat">
            <div class="chat_list active_chat">
              <div class="chat_people">
                <div class="chat_img"> <img src="https://cdn-icons-png.flaticon.com/256/8955/8955051.png" alt="sunil"> </div>
                <div class="chat_ib">
                  <h5>Sunil Rajput <span class="chat_date">Dec 25</span></h5>
                  <p>Test, which is a new approach to have all solutions
                    astrology under one roof.</p>
                </div>
              </div>
            </div>
            <div class="chat_list">
              <div class="chat_people">
                <div class="chat_img"> <img src="https://cdn-icons-png.flaticon.com/256/8955/8955051.png" alt="sunil"> </div>
                <div class="chat_ib">
                  <h5>Sunil Rajput <span class="chat_date">Dec 25</span></h5>
                  <p>Test, which is a new approach to have all solutions
                    astrology under one roof.</p>
                </div>
              </div>
            </div>
            <div class="chat_list">
              <div class="chat_people">
                <div class="chat_img"> <img src="https://cdn-icons-png.flaticon.com/256/8955/8955051.png" alt="sunil"> </div>
                <div class="chat_ib">
                  <h5>Sunil Rajput <span class="chat_date">Dec 25</span></h5>
                  <p>Test, which is a new approach to have all solutions
                    astrology under one roof.</p>
                </div>
              </div>
            </div>
            <div class="chat_list">
              <div class="chat_people">
                <div class="chat_img"> <img src="https://cdn-icons-png.flaticon.com/256/8955/8955051.png" alt="sunil"> </div>
                <div class="chat_ib">
                  <h5>Sunil Rajput <span class="chat_date">Dec 25</span></h5>
                  <p>Test, which is a new approach to have all solutions
                    astrology under one roof.</p>
                </div>
              </div>
            </div>
            <div class="chat_list">
              <div class="chat_people">
                <div class="chat_img"> <img src="https://cdn-icons-png.flaticon.com/256/8955/8955051.png" alt="sunil"> </div>
                <div class="chat_ib">
                  <h5>Sunil Rajput <span class="chat_date">Dec 25</span></h5>
                  <p>Test, which is a new approach to have all solutions
                    astrology under one roof.</p>
                </div>
              </div>
            </div>
            <div class="chat_list">
              <div class="chat_people">
                <div class="chat_img"> <img src="https://cdn-icons-png.flaticon.com/256/8955/8955051.png" alt="sunil"> </div>
                <div class="chat_ib">
                  <h5>Sunil Rajput <span class="chat_date">Dec 25</span></h5>
                  <p>Test, which is a new approach to have all solutions
                    astrology under one roof.</p>
                </div>
              </div>
            </div>
            <div class="chat_list">
              <div class="chat_people">
                <div class="chat_img"> <img src="https://cdn-icons-png.flaticon.com/256/8955/8955051.png" alt="sunil"> </div>
                <div class="chat_ib">
                  <h5>Sunil Rajput <span class="chat_date">Dec 25</span></h5>
                  <p>Test, which is a new approach to have all solutions
                    astrology under one roof.</p>
                </div>
              </div>
            </div>
          </div>
        </div>
        <!-- 채팅 창 -->
        <div class="mesgs">
          <div id="msg_history" class="msg_history">
            <div class="incoming_msg">
              <div class="incoming_msg_img"> <img src="https://cdn-icons-png.flaticon.com/256/8955/8955051.png" alt="sunil">
              </div>
              <div class="received_msg">
                <div class="received_withd_msg">
                  <p>Test which is a new approach to have all
                    solutions</p>
                  <span class="time_date"> 11:01 AM | June 9</span>
                </div>
              </div>
            </div>
            <div class="outgoing_msg">
              <div class="sent_msg">
                <p>Test which is a new approach to have all
                  solutions</p>
                <span class="time_date"> 11:01 AM | June 9</span>
              </div>
            </div>
            <div class="incoming_msg">
              <div class="incoming_msg_img"> <img src="https://cdn-icons-png.flaticon.com/256/8955/8955051.png" alt="sunil">
              </div>
              <div class="received_msg">
                <div class="received_withd_msg">
                  <p>Test, which is a new approach to have</p>
                  <span class="time_date"> 11:01 AM | Yesterday</span>
                </div>
              </div>
            </div>
            <div class="outgoing_msg">
              <div class="sent_msg">
                <p>Apollo University, Delhi, India Test</p>
                <span class="time_date"> 11:01 AM | Today</span>
              </div>
            </div>
            <div class="incoming_msg">
              <div class="incoming_msg_img"> <img src="https://cdn-icons-png.flaticon.com/256/8955/8955051.png" alt="sunil">
              </div>
              <div class="received_msg">
                <div class="received_withd_msg">
                  <p>We work directly with our designers and suppliers,
                    and sell direct to you, which means quality, exclusive
                    products, at a price anyone can afford.</p>
                  <span class="time_date"> 11:01 AM | Today</span>
                </div>
              </div>
            </div>
          </div>
          <div class="type_msg">
            <div class="input_msg_write">
              <input id="write_msg" type="text" class="write_msg" placeholder="Type a message" onkeypress="enterkey(event)"/>
              <button id="msg_send_btn" class="msg_send_btn" type="button"><span class="material-symbols-outlined">
                send
                </span></button>
            </div>
          </div>
        </div>
      </div>
      
      <div id="chatBotContainer" class="bottom">
        <!-- 챗봇 박스들 출력되는 부분 -->
      </div>
      
           <div class="modal-overlay">
        <div class="modal">
            <h2 class="modal-heading">채봇 추가</h2> <!-- 일정 추가 텍스트 -->
            <form>
                <div class="input-group">
                    <label for="title">제목 : </label>
                    <input type="text" id="chat_title">
                </div>
                <hr>
                <div class="input-group">
                    <label for="chat_btn">버튼 : </label>
                    <input type="text" id="chat_btn">
                </div>
                <hr>          
                <textarea id="chat_content" rows="4" placeholder="내용을 입력하세요"></textarea> <!-- 내용 입력란 Placeholder 추가 -->
                <!-- 일정 추가 버튼 -->
                <div class="button-group">
                    <button id="chatBotRegisterBtn" type="button">챗봇 추가</button>
                </div>
            </form>
        </div>
    </div>

</div>


<script src="/resources/js/qna_admin.js"></script>
<script type="text/javascript">
	const userId="${ses.id}";
	printChatUserList();
	printChatBotList();
</script>
</body>
</html>