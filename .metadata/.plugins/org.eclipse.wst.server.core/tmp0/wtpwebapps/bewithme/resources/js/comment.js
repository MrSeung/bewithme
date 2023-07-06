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
  
    svg.addEventListener("click", function(event) {
    var button = event.currentTarget.parentNode; // SVG의 부모 요소 버튼
    toggleLike(event); // 버튼 클릭 동작을 수행
    event.stopPropagation(); 
  });
    
  
  }