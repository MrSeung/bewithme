<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Subject</title>

    <link rel="stylesheet" href="/resources/css/menu.css?after">
    <link rel="stylesheet" href="/resources/css/subject.css?after">

</head>
<body>
    <div class="container">
        <div class="left">
            <img src="/resources/img/logo.png" class="logo" alt="">
            <div class="menu_bar">

              

                <button><a href="/menu/home"> 🏠<span> Home</span></a></button><br>
                <button><a href="/sj/subject">📝<span class="not"> Subject</span></a></button><br>
                <!-- <button><a href="/menu/subject">📝<span class="not"> Subject</span></a></button><br> -->
                <button><a href="/menu/community">📖<span> Community</span></a></button><br>
                <button><a href="/menu/qna">📁<span> Q&A</span></a></button><br>

            </div>
            <div class="sebu">
                <button><a href="">⚙ Setting</a></button><br>
                <button><a href="/member/logout">🗑 Log out</a></button><br>
            </div>
        
        </div>
        <form action="/sj/title?sub_num=${svo.sub_num} }" method="get">
        <div class="right">
            <div class="tt">
                <button class="sj_t">배우기</button>
                <%-- <p class="sj_t">${courseTitle}</p> --%>
            
               		<p class="sj_t">${svo.sub_title }</p>
              
            </div>
            <!-- <div class="sj_list"></div> -->
            <div class="subtt">
                <p class="a"><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-hourglass-split" viewBox="0 0 16 16">
                    <path d="M2.5 15a.5.5 0 1 1 0-1h1v-1a4.5 4.5 0 0 1 2.557-4.06c.29-.139.443-.377.443-.59v-.7c0-.213-.154-.451-.443-.59A4.5 4.5 0 0 1 3.5 3V2h-1a.5.5 0 0 1 0-1h11a.5.5 0 0 1 0 1h-1v1a4.5 4.5 0 0 1-2.557 4.06c-.29.139-.443.377-.443.59v.7c0 .213.154.451.443.59A4.5 4.5 0 0 1 12.5 13v1h1a.5.5 0 0 1 0 1h-11zm2-13v1c0 .537.12 1.045.337 1.5h6.326c.216-.455.337-.963.337-1.5V2h-7zm3 6.35c0 .701-.478 1.236-1.011 1.492A3.5 3.5 0 0 0 4.5 13s.866-1.299 3-1.48V8.35zm1 0v3.17c2.134.181 3 1.48 3 1.48a3.5 3.5 0 0 0-1.989-3.158C8.978 9.586 8.5 9.052 8.5 8.351z"/>
                  </svg>&nbsp;&nbsp;강의수 : ${count }강</p><p class="a"><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-calendar-check" viewBox="0 0 16 16">
                    <path d="M10.854 7.146a.5.5 0 0 1 0 .708l-3 3a.5.5 0 0 1-.708 0l-1.5-1.5a.5.5 0 1 1 .708-.708L7.5 9.793l2.646-2.647a.5.5 0 0 1 .708 0z"/>
                    <path d="M3.5 0a.5.5 0 0 1 .5.5V1h8V.5a.5.5 0 0 1 1 0V1h1a2 2 0 0 1 2 2v11a2 2 0 0 1-2 2H2a2 2 0 0 1-2-2V3a2 2 0 0 1 2-2h1V.5a.5.5 0 0 1 .5-.5zM1 4v10a1 1 0 0 0 1 1h12a1 1 0 0 0 1-1V4H1z"/>
                  <!-- </svg>&nbsp;&nbsp;업로드 날짜</p> -->
                  </svg>&nbsp;&nbsp;${svo.sub_reg_date }</p>
                  <!-- 관리자로 로그인 될때만 뜨도록 -->
                  <button class="sj_reg"><a href="/co/write" class="sj_a">등록하기</a></button>
            </div>
            </form>
            <hr>
            <div class="kang">
                <p>강의 목록</p>
                <!-- <button>목록닫기</button> -->
            </div>
            <!-- <ul>
                <li>1-1<a href=""></a></li>
                <li>1-2<a href=""></a></li>
                <li>1-3<a href=""></a></li>
                <li>1-4<a href=""></a></li>
                <li>1-5<a href=""></a></li>
            </ul> -->
            <form action="#" method="get" class="ganggo">
            <table id="courseListArea">

                <tr >
<!--                     <th>1-1</th>
                    <td><a href="">Visual Studio Code 설치 및 사용법(한국어팩, Live Server, 파이썬 설치, 단축키 설정)</a></td>
                    <td><a href="/co/link"></a></td>
                    <td class="ck">
                        <svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="currentColor" class="bi bi-check-circle-fill" viewBox="0 0 16 16">
                        <path d="M16 8A8 8 0 1 1 0 8a8 8 0 0 1 16 0zm-3.97-3.03a.75.75 0 0 0-1.08.022L7.477 9.417 5.384 7.323a.75.75 0 0 0-1.06 1.06L6.97 11.03a.75.75 0 0 0 1.079-.02l3.992-4.99a.75.75 0 0 0-.01-1.05z"/>
                      </svg></td> -->
                </tr>

<!--                 <tr>
                    <th>1-2</th>
                    <td><a href="">[HTML]&nbsp;&nbsp;input tag 타입</a></td>
                    <td></td>
                </tr> -->
                
            </table>
            
           </form>

            
        </div>

    </div>
    <script type="text/javascript" src="/resources/js/courselist.js">
    
    </script> 
    
  <script type="text/javascript">
  /*     const tr = document.getElementById('courseListArea');
    const coVal = tr.dataset.couNum;
    console.log("cou_num: " + coVal); */
    
/*     const sub_num = "${svo.sub_num}";
    console.log("sub_num : "+sub_num); */
    
    const coVal = '<c:out value="${svo.sub_num}" />';
    console.log("sub_num : " + coVal);
    getCourseList(coVal);
    </script>
    

   
    
</body>
</html>
