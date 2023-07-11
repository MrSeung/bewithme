// --  전체, 기술, 커리어, MY 버튼 색상 변경
const nav_buttons = document.querySelectorAll('.nav button');

nav_buttons.forEach(button => {
  button.addEventListener('click', () => {
    nav_buttons.forEach(btn => {
      // 전체 버튼 적용
      btn.style.backgroundImage = 'linear-gradient(#21222D, #21222D), linear-gradient(to bottom right, #6C72CD, #CB68C3)';
      btn.style.fontWeight = ''; 
    });

    // 클릭된 버튼 적용
    button.style.backgroundImage = 'linear-gradient(to bottom right, #6C72CD, #CB68C3), linear-gradient(to bottom right, #6C72CD, #CB68C3)';
    button.style.fontWeight = '700';

  });
});

// -- 최신순, 인기순 버튼 색상 변경
const sort_buttons = document.querySelectorAll('.sort button');

sort_buttons.forEach(button => {
  button.addEventListener('click', () => {
    sort_buttons.forEach(btn => {
      // 전체 버튼 보라색 적용
      btn.style.color = '#6C72CD';
    });

    // 클릭 버튼 하얀색 적용
    button.style.color = 'white';
    button.style.fontWeight = '700';
  });

});



// -- 빈 하트를 누르면 진한 하트로 변경 (반대도 가능)
  // (가까운 하트 버튼이 반응하도록 설정했음)
let likeButtons = document.getElementsByClassName("like_button");

// 모든 버튼에 대해 반복하여 이벤트를 추가
for (let i = 0; i < likeButtons.length; i++) {
  let button = likeButtons[i];
  button.addEventListener("click", toggleLike);
}

// 버튼 클릭 시
function toggleLike(event) {
  let button = event.currentTarget; // 현재 클릭된 요소
  let isLiked = button.getAttribute("data-liked") === "true";
  
  if (isLiked) {
    button.innerHTML = '<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-suit-heart" viewBox="0 0 16 16"><path d="m8 6.236-.894-1.789c-.222-.443-.607-1.08-1.152-1.595C5.418 2.345 4.776 2 4 2 2.324 2 1 3.326 1 4.92c0 1.211.554 2.066 1.868 3.37.337.334.721.695 1.146 1.093C5.122 10.423 6.5 11.717 8 13.447c1.5-1.73 2.878-3.024 3.986-4.064.425-.398.81-.76 1.146-1.093C14.446 6.986 15 6.131 15 4.92 15 3.326 13.676 2 12 2c-.777 0-1.418.345-1.954.852-.545.515-.93 1.152-1.152 1.595L8 6.236zm.392 8.292a.513.513 0 0 1-.784 0c-1.601-1.902-3.05-3.262-4.243-4.381C1.3 8.208 0 6.989 0 4.92 0 2.755 1.79 1 4 1c1.6 0 2.719 1.05 3.404 2.008.26.365.458.716.596.992a7.55 7.55 0 0 1 .596-.992C9.281 2.049 10.4 1 12 1c2.21 0 4 1.755 4 3.92 0 2.069-1.3 3.288-3.365 5.227-1.193 1.12-2.642 2.48-4.243 4.38z"/></svg>';
    button.setAttribute("data-liked", "false");
  } else {
    button.innerHTML = '<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-suit-heart-fill" viewBox="0 0 16 16"><path d="M4 1c2.21 0 4 1.755 4 3.92C8 2.755 9.79 1 12 1s4 1.755 4 3.92c0 3.263-3.234 4.414-7.608 9.608a.513.513 0 0 1-.784 0C3.234 9.334 0 8.183 0 4.92 0 2.755 1.79 1 4 1z"/></svg>';
    button.setAttribute("data-liked", "true");
  }
}

// SVG 아이콘 클릭 시 버튼 클릭과 같은 효과를 주도록 하기
let svgElements = document.getElementsByTagName("svg");

for (let i = 0; i < svgElements.length; i++) {
  let svg = svgElements[i];
  let parentButton = svg.parentNode; // 부모확인

  // 부모class가 "button_left" or "button_right"이 아니면 효과 넣기
  if (!parentButton.classList.contains("button_left") && !parentButton.classList.contains("button_right")) {
      svg.addEventListener("click", function(event) {
        let button = event.currentTarget.parentNode; // SVG의 부모 요소인 버튼을 가져옵니다.
        toggleLike(event); // 버튼 클릭 동작을 수행합니다.
        event.stopPropagation(); 
      });
  }

}


// 추천질문 슬라이드 기능
const rightButton = document.querySelector('.button_right');
const leftButton = document.querySelector('.button_left');
const recommendDiv = document.querySelector('.recommend');
const slideDistance = recommendDiv.offsetWidth + 20; // 추천 질문 div의 너비 + 마진 양쪽 20

rightButton.addEventListener('click', () => {

  recommendDiv.scrollTo({
    left: recommendDiv.scrollLeft + slideDistance,
    behavior: 'smooth'
  });

  // 스크롤이 마지막 div를 넘어갈 경우, 첫 번째 div로 이동시킵니다.
  if (recommendDiv.scrollLeft + slideDistance >= recommendDiv.scrollWidth) { //recommendDiv.scrollWidth의 전체 너비
    recommendDiv.scrollTo({
      left: 0,
      behavior: 'smooth'
    });
  }
});

leftButton.addEventListener('click', () => {
 
  recommendDiv.scrollTo({
    left: recommendDiv.scrollLeft - slideDistance,
    behavior: 'smooth'
  });

  // 스크롤이 첫 번째 div를 넘어갈 경우, 마지막 div로 이동
  if (recommendDiv.scrollLeft === 0) {
    recommendDiv.scrollTo({
      left: recommendDiv.scrollWidth,
      behavior: 'smooth'
    });
  }
});


//--------------------------------------------------------------------------
//DB에서 정보 list로 가져오기
async function spreadCommunityFromServer(){
  try {
      const resp =  await fetch('/community/list');
      const result = await resp.json();
      return result;
  } catch (error) {
      console.log("community.js에서 전송 오류" + error)
  }
}


//가져온 정보list 화면에 뿌리기
function getCommunityList(){
  spreadCommunityFromServer().then(result => {

    console.log("Controller(DB) -> JS : " + (( result.communityList.length > 0 && result.recommendList.length > 0 )? "OK":"FAIL"));

    const content = document.getElementById("board");
    const reContent = document.getElementById("recommend")

    //전체 질문 
    if (result.communityList.length > 0) {
      content.innerHTML = "";
      for(let cvo of result.communityList){
        let div = `<div>`;
        div += `<div class="content_left">`;
        div += `<div class="title">${cvo.com_title}</div>`;
        div += `<div class="reaction">`;
        let date = new Date(cvo.com_reg_date);
        let year = date.getFullYear();
        let month = (date.getMonth() + 1).toString().padStart(2, '0');
        let day = date.getDate().toString().padStart(2, '0');
        div += `<div>${year}-${month}-${day}</div>`;
        div += `<div>
                  <svg xmlns="http://www.w3.org/2000/svg" width="12" height="12" fill="currentColor" class="bi bi-chat" viewBox="0 0 16 16">
                    <path d="M2.678 11.894a1 1 0 0 1 .287.801 10.97 10.97 0 0 1-.398 2c1.395-.323 2.247-.697 2.634-.893a1 1 0 0 1 .71-.074A8.06 8.06 0 0 0 8 14c3.996 0 7-2.807 7-6 0-3.192-3.004-6-7-6S1 4.808 1 8c0 1.468.617 2.83 1.678 3.894zm-.493 3.905a21.682 21.682 0 0 1-.713.129c-.2.032-.352-.176-.273-.362a9.68 9.68 0 0 0 .244-.637l.003-.01c.248-.72.45-1.548.524-2.319C.743 11.37 0 9.76 0 8c0-3.866 3.582-7 8-7s8 3.134 8 7-3.582 7-8 7a9.06 9.06 0 0 1-2.347-.306c-.52.263-1.639.742-3.468 1.105z"/>
                  </svg> 2 |
                </div>`;
        div += `<div>
                  <svg xmlns="http://www.w3.org/2000/svg" width="12" height="10" fill="currentColor" class="bi bi-suit-heart-fill" viewBox="0 0 16 16">
                      <path d="M4 1c2.21 0 4 1.755 4 3.92C8 2.755 9.79 1 12 1s4 1.755 4 3.92c0 3.263-3.234 4.414-7.608 9.608a.513.513 0 0 1-.784 0C3.234 9.334 0 8.183 0 4.92 0 2.755 1.79 1 4 1z"/>
                  </svg> 1
                </div>`;
        div += `</div>`;
        div += `<div class="content">${cvo.com_content}</div>`;
        div += `</div>`;
        div += `<div class="content_right">
                  <img src="/resources/img/it.jpg" alt="it사진">
                </div>`;
        div += `<div class="content_bottom">`;
        div += `<span>정은</span>`;
        div += `<button class="like_button">`;
        div += `<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-suit-heart" viewBox="0 0 16 16">
                <path d="m8 6.236-.894-1.789c-.222-.443-.607-1.08-1.152-1.595C5.418 2.345 4.776 2 4 2 2.324 2 1 3.326 1 4.92c0 1.211.554 2.066 1.868 3.37.337.334.721.695 1.146 1.093C5.122 10.423 6.5 11.717 8 13.447c1.5-1.73 2.878-3.024 3.986-4.064.425-.398.81-.76 1.146-1.093C14.446 6.986 15 6.131 15 4.92 15 3.326 13.676 2 12 2c-.777 0-1.418.345-1.954.852-.545.515-.93 1.152-1.152 1.595L8 6.236zm.392 8.292a.513.513 0 0 1-.784 0c-1.601-1.902-3.05-3.262-4.243-4.381C1.3 8.208 0 6.989 0 4.92 0 2.755 1.79 1 4 1c1.6 0 2.719 1.05 3.404 2.008.26.365.458.716.596.992a7.55 7.55 0 0 1 .596-.992C9.281 2.049 10.4 1 12 1c2.21 0 4 1.755 4 3.92 0 2.069-1.3 3.288-3.365 5.227-1.193 1.12-2.642 2.48-4.243 4.38z"/>
                </svg>`;
        div += `</button></div>`;
        div += `<div class="main_line"></div></div>`;
        content.innerHTML += div;
      }
    
    }else{
      let div = `<div>Content Empty</div>`;
      content.innerHTML += div;
  
      console.log("게시글 데이터가 없습니다.");
    }

    //추천 질문 리스트
    if(result.recommendList.length > 0){
      reContent.innerHTML = "";
      for(let cvo of result.recommendList){
        let div = `<div class="recommend_post">`;
        div += `<div>${cvo.com_category}</div>`;
        div += `<p><a href="/community/com_community">${cvo.com_title}</a></p>`;
        div += `<div><div>`;
        div += `<span>
                    <svg xmlns="http://www.w3.org/2000/svg" width="12" height="12" fill="currentColor" class="bi bi-chat" viewBox="0 0 16 16">
                    <path d="M2.678 11.894a1 1 0 0 1 .287.801 10.97 10.97 0 0 1-.398 2c1.395-.323 2.247-.697 2.634-.893a1 1 0 0 1 .71-.074A8.06 8.06 0 0 0 8 14c3.996 0 7-2.807 7-6 0-3.192-3.004-6-7-6S1 4.808 1 8c0 1.468.617 2.83 1.678 3.894zm-.493 3.905a21.682 21.682 0 0 1-.713.129c-.2.032-.352-.176-.273-.362a9.68 9.68 0 0 0 .244-.637l.003-.01c.248-.72.45-1.548.524-2.319C.743 11.37 0 9.76 0 8c0-3.866 3.582-7 8-7s8 3.134 8 7-3.582 7-8 7a9.06 9.06 0 0 1-2.347-.306c-.52.263-1.639.742-3.468 1.105z"/>
                    </svg>
                    2 |
                </span>`;
        div += `<span>
                    <svg xmlns="http://www.w3.org/2000/svg" width="12" height="10" fill="currentColor" class="bi bi-suit-heart-fill" viewBox="0 0 16 16">
                        <path d="M4 1c2.21 0 4 1.755 4 3.92C8 2.755 9.79 1 12 1s4 1.755 4 3.92c0 3.263-3.234 4.414-7.608 9.608a.513.513 0 0 1-.784 0C3.234 9.334 0 8.183 0 4.92 0 2.755 1.79 1 4 1z"/>
                    </svg> 1
                </span></div>`;
        div += `<div>
                  <span>조회</span> 
                  <span>${cvo.com_cnt}</span>
                </div>`;
        div += `</div></div>`;
        reContent.innerHTML += div;
      }

    }else{
      let div = `<div>Content Empty</div>`;
      reContent.innerHTML += div;

      console.log("추천 질문 데이터가 없습니다.");
    }



  });
}