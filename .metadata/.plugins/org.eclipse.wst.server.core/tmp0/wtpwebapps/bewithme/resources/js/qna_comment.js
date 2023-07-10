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
var likeButtons = document.getElementsByClassName("like_button");

// 모든 버튼에 대해 반복하여 이벤트를 추가
for (var i = 0; i < likeButtons.length; i++) {
  var button = likeButtons[i];
  button.addEventListener("click", toggleLike);
}

// 버튼 클릭 시
function toggleLike(event) {
  var button = event.currentTarget; // 현재 클릭된 요소
  var isLiked = button.getAttribute("data-liked") === "true";
  
  if (isLiked) {
    button.innerHTML = '<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-suit-heart" viewBox="0 0 16 16"><path d="m8 6.236-.894-1.789c-.222-.443-.607-1.08-1.152-1.595C5.418 2.345 4.776 2 4 2 2.324 2 1 3.326 1 4.92c0 1.211.554 2.066 1.868 3.37.337.334.721.695 1.146 1.093C5.122 10.423 6.5 11.717 8 13.447c1.5-1.73 2.878-3.024 3.986-4.064.425-.398.81-.76 1.146-1.093C14.446 6.986 15 6.131 15 4.92 15 3.326 13.676 2 12 2c-.777 0-1.418.345-1.954.852-.545.515-.93 1.152-1.152 1.595L8 6.236zm.392 8.292a.513.513 0 0 1-.784 0c-1.601-1.902-3.05-3.262-4.243-4.381C1.3 8.208 0 6.989 0 4.92 0 2.755 1.79 1 4 1c1.6 0 2.719 1.05 3.404 2.008.26.365.458.716.596.992a7.55 7.55 0 0 1 .596-.992C9.281 2.049 10.4 1 12 1c2.21 0 4 1.755 4 3.92 0 2.069-1.3 3.288-3.365 5.227-1.193 1.12-2.642 2.48-4.243 4.38z"/></svg>';
    button.setAttribute("data-liked", "false");
  } else {
    button.innerHTML = '<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-suit-heart-fill" viewBox="0 0 16 16"><path d="M4 1c2.21 0 4 1.755 4 3.92C8 2.755 9.79 1 12 1s4 1.755 4 3.92c0 3.263-3.234 4.414-7.608 9.608a.513.513 0 0 1-.784 0C3.234 9.334 0 8.183 0 4.92 0 2.755 1.79 1 4 1z"/></svg>';
    button.setAttribute("data-liked", "true");
  }
}

// SVG 아이콘 클릭 시 버튼 클릭과 같은 효과를 주도록 하기
var svgElements = document.getElementsByTagName("svg");

for (var i = 0; i < svgElements.length; i++) {
  var svg = svgElements[i];
  var parentButton = svg.parentNode; // 부모확인

  // 부모class가 "button_left" or "button_right"이 아니면 효과 넣기
  if (!parentButton.classList.contains("button_left") && !parentButton.classList.contains("button_right")) {
      svg.addEventListener("click", function(event) {
        var button = event.currentTarget.parentNode; // SVG의 부모 요소인 버튼을 가져옵니다.
        toggleLike(event); // 버튼 클릭 동작을 수행합니다.
        event.stopPropagation(); 
      });
  }

}

//슬라이드 기능
// const rightButton = document.querySelector('.button_right');

// rightButton.addEventListener('click', () => {
//   // 전체 추천질문 너비
//   const recommendDiv = document.querySelector('.recommend');

//   // 이동할 거리
//   const mainWidth = document.querySelector('.main').offsetWidth;
//   const slideDistance = mainWidth+20; //main으로 잡아놓은 너비 + 마진 양쪽 20

//   // 전체 div 요소의 현재 스크롤 값
//   const scrollPosition = recommendDiv.scrollLeft;

//   // 목표로 할 스크롤 위치
//   let targetScrollPosition = scrollPosition + slideDistance;

//   // 슬라이드 애니메이션을 실행합니다.
//   recommendDiv.scrollTo({
//     left: targetScrollPosition,
//     behavior: 'smooth' // 자연스러운 스크롤 애니메이션 smooth사용함
//   });

//    // 스크롤이 마지막 div를 넘어갈 경우, 첫 번째 div로 이동시킵니다.
//    if (recommendDiv.scrollLeft + recommendDiv.offsetWidth >= recommendDiv.scrollWidth) {
//     recommendDiv.scrollTo({
//       left: 0,
//       behavior: 'smooth'
//     });
//   }

// });

// 슬라이드 기능
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

