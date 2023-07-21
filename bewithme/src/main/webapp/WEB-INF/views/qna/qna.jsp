<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/resources/css/qna.css">
    <link rel="stylesheet"
    href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@48,400,0,0" />
<title>community</title>
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

        <!-- 우측/ Community 부분 -->
	<div class="right">
      <div class="inbox_msg">
        <!-- 채팅 창 -->
        <div class="mesgs">
          <div id="msg_history" class="msg_history">
            <div class="incoming_msg">
              <div class="incoming_msg_img"> <img src="https://ptetutorials.com/images/user-profile.png" alt="sunil">
              </div>
              <div class="received_msg">
                <div class="received_withd_msg">
                  <p>안녕하세요. ${ses.nickname}님 무엇을 도와드릴까요?</p>
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
              <div class="incoming_msg_img"> <img src="https://ptetutorials.com/images/user-profile.png" alt="sunil">
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
              <div class="incoming_msg_img"> <img src="https://ptetutorials.com/images/user-profile.png" alt="sunil">
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
              <input type="text" id="write_msg" class="write_msg" placeholder="Type a message" onkeypress="enterkey(event)"/>
              <button id="msg_send_btn" class="msg_send_btn" type="button"><span class="material-symbols-outlined">
                send
                </span></button>
              <button id="img_send_btn" class="img_send_btn" type="button"><span class="material-symbols-outlined">
                add_a_photo
                </span></button>
            </div>
          </div>
        </div>
      </div>

      <div id="chatBotContainer" class="bottom">
     
      </div>

  </div>
  <script type="text/javascript" src="/resources/js/qna.js"></script>
	<script type="text/javascript">
		const userId = "${ses.id}";
		const nickname="${ses.nickname}";
		getMsgList(userId);
/* 		scrollBottom(); */
		printChatBotList();
	</script>
</body>
</html>