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


// -- 댓글 좋아요 버튼 -- 

async function updateLikeFromServer(btnVal){
	try {
    const resp =  await fetch("/com_comment/updateLike/" + btnVal);
    const result = await resp.text();
    return  result;

	} catch (error) {
		console.log(error);
	}
}

document.addEventListener('click', (e) => {

  if(e.target.classList.contains('like_button')){
    
    //내가 클릭한 버튼
    let btn = e.target.closest('button');
    let btnVal = btn.value;
    console.log(">>> 클릭한 버튼 value (com_com_num) : " + btnVal);

    updateLikeFromServer(btnVal).then(result => {
      if(result > 0){

        console.log("Controller(DB) -> JS : " + (( result > 0 )? "OK":"FAIL"));
        
        if(btn.getAttribute("id") === "false"){
          alert("좋아요 추가 클릭");
          btn.innerHTML =  `<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-suit-heart-fill" viewBox="0 0 16 16"><path d="M4 1c2.21 0 4 1.755 4 3.92C8 2.755 9.79 1 12 1s4 1.755 4 3.92c0 3.263-3.234 4.414-7.608 9.608a.513.513 0 0 1-.784 0C3.234 9.334 0 8.183 0 4.92 0 2.755 1.79 1 4 1z"/></svg>`;
          btn.setAttribute("id", "true");
          

        }else if(btn.getAttribute("id") === "true"){
          alert("좋아요 취소 클릭");
          btn.innerHTML = `<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-suit-heart" viewBox="0 0 16 16"><path d="m8 6.236-.894-1.789c-.222-.443-.607-1.08-1.152-1.595C5.418 2.345 4.776 2 4 2 2.324 2 1 3.326 1 4.92c0 1.211.554 2.066 1.868 3.37.337.334.721.695 1.146 1.093C5.122 10.423 6.5 11.717 8 13.447c1.5-1.73 2.878-3.024 3.986-4.064.425-.398.81-.76 1.146-1.093C14.446 6.986 15 6.131 15 4.92 15 3.326 13.676 2 12 2c-.777 0-1.418.345-1.954.852-.545.515-.93 1.152-1.152 1.595L8 6.236zm.392 8.292a.513.513 0 0 1-.784 0c-1.601-1.902-3.05-3.262-4.243-4.381C1.3 8.208 0 6.989 0 4.92 0 2.755 1.79 1 4 1c1.6 0 2.719 1.05 3.404 2.008.26.365.458.716.596.992a7.55 7.55 0 0 1 .596-.992C9.281 2.049 10.4 1 12 1c2.21 0 4 1.755 4 3.92 0 2.069-1.3 3.288-3.365 5.227-1.193 1.12-2.642 2.48-4.243 4.38z"/></svg>`;
          btn.setAttribute("id", "false");
          
        }

      }

    })
    
   
  }else if (e.target.tagName === "svg") {
    console.log("좋아요 버튼 안의 SVG 태그 클릭했음");

    // 부모 button 클릭 설정
    let btn = e.target.closest('button');
    if (btn) {
      btn.click();
    }
  }else if(e.target.tagName === "path"){
    console.log("좋아요 버튼 안의 SVG 태그-path 클릭했음");

    let btn = e.target.closest('button');
    if (btn) {
      btn.click();
    }
  }
})



 // -- 댓글 저장 --
async function insertCommentToServer(cmtData){
    try{
        const url = "/com_comment/insert";
		const config = {
			method: 'post',
			headers:{
				'content-Type': 'application/json; charset=utf-8'
			},
			body:JSON.stringify(cmtData)
		};
		const resp = await fetch(url, config); 
		const result = await resp.text(); 
		return result;
		
	}catch(error){
		console.log(error);
	}
}
  
document.getElementById('subBtn').addEventListener('click',()=>{
	const com_com_content = document.getElementById('com_com_content').value;
	
	if(com_com_content == null || com_com_content == ""){ 
		alert("댓글을 입력해주세요");
    document.getElementById('com_com_content').focus(); 
		return false;

	} else {
		let cmtData = { 
		com_com_content : com_com_content,
		com_num : com_num
	};
    console.log(">>> cmtData(댓글) : " + cmtData);
        
		insertCommentToServer(cmtData).then(result=>{
			if(result > 0){
				alert('댓글 작성 완료');
        		getCommentList(cmtData.com_num);
			}
		});
		
	}

})


// -- 댓글 출력 --
async function spreadCommentFromServer(com_num){
	console.log(">>> com_num : " + com_num);
	try {
		const resp = await fetch('/com_comment/commentList/'+com_num);
		const result = await resp.json();
		return result;
	} catch (error) {
		console.log(error);
	}
}

function getCommentList(com_num){
	spreadCommentFromServer(com_num).then(result => {
    
    console.log("Controller(DB) -> JS / likeList : " + (( result.likeList.length > 0 )? "OK":"FAIL"));
    console.log("Controller(DB) -> JS / commentList : " + (( result.commentList.length > 0 )? "OK":"FAIL"));
	const content = document.getElementById("comment_list");
	content.innerHTML = ''; //기존의 값을 비우고
	console.log("-------------------"+result.commentList.length);
		if(result.commentList.length > 0 ){
			for(let ccvo of result.commentList){
				let div = `<div class="comment_content">`;
				div += `<div><span class="nickname">${ccvo.nickname}</span>`;
				if(`${ccvo.id}` === '1111'){
					div += `<button type="button" class="modBtn">✂ 수정</button>`;
					div += `<button type="button" class="delBtn">✕ 삭제</button></div>`;
					div += `<input type="text" id="cmtTextMod" value="${ccvo.com_com_content}">`;
				}else{
					div += `</div>`;
					div += `<input type="text" id="cmtTextMod" value="${ccvo.com_com_content}" readonly=readonly>`;
				}
				div += `<div><div><span>${ccvo.com_com_mod_date} •</span>`;
				div += `<svg xmlns="http://www.w3.org/2000/svg" width="12" height="10" fill="currentColor" class="bi bi-suit-heart-fill" viewBox="0 0 16 16">
							<path d="M4 1c2.21 0 4 1.755 4 3.92C8 2.755 9.79 1 12 1s4 1.755 4 3.92c0 3.263-3.234 4.414-7.608 9.608a.513.513 0 0 1-.784 0C3.234 9.334 0 8.183 0 4.92 0 2.755 1.79 1 4 1z"/>
						</svg>`;
				div += `<span> ${ccvo.com_com_like_cnt}</span>`;
				if(`${ccvo.com_com_isMod}` === 'Y'){
					div += `<span>• 수정됨</span>`;
				}
				div += `</div>`;

				let isCom_com_num = true;
				for(let i of result.likeList){
					if(ccvo.com_com_num === i){
						console.log(">>> i : " + i);
						console.log(">>> cvo.com_com_num : " + ccvo.com_com_num);
						//색칠된 하트
						div += `<button class="like_button" value="${ccvo.com_com_num}" id="true">`;
						div += `<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-suit-heart-fill" viewBox="0 0 16 16">
								<path d="M4 1c2.21 0 4 1.755 4 3.92C8 2.755 9.79 1 12 1s4 1.755 4 3.92c0 3.263-3.234 4.414-7.608 9.608a.513.513 0 0 1-.784 0C3.234 9.334 0 8.183 0 4.92 0 2.755 1.79 1 4 1z"/>
								</svg>`;
						div += `</button></div>`; 
						isCom_com_num = false;
						break;
					} 
				}
				if(isCom_com_num){
				//빈 하트
				div += `<button class="like_button" value="${ccvo.com_com_num}" id="false">`;
				div += `<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-suit-heart" viewBox="0 0 16 16">
							<path d="m8 6.236-.894-1.789c-.222-.443-.607-1.08-1.152-1.595C5.418 2.345 4.776 2 4 2 2.324 2 1 3.326 1 4.92c0 1.211.554 2.066 1.868 3.37.337.334.721.695 1.146 1.093C5.122 10.423 6.5 11.717 8 13.447c1.5-1.73 2.878-3.024 3.986-4.064.425-.398.81-.76 1.146-1.093C14.446 6.986 15 6.131 15 4.92 15 3.326 13.676 2 12 2c-.777 0-1.418.345-1.954.852-.545.515-.93 1.152-1.152 1.595L8 6.236zm.392 8.292a.513.513 0 0 1-.784 0c-1.601-1.902-3.05-3.262-4.243-4.381C1.3 8.208 0 6.989 0 4.92 0 2.755 1.79 1 4 1c1.6 0 2.719 1.05 3.404 2.008.26.365.458.716.596.992a7.55 7.55 0 0 1 .596-.992C9.281 2.049 10.4 1 12 1c2.21 0 4 1.755 4 3.92 0 2.069-1.3 3.288-3.365 5.227-1.193 1.12-2.642 2.48-4.243 4.38z"/>
						</svg>`;
				div += `</button></div>`;
				}

				div += `<div class="comment_line"></div>`;
				div += `<div style="display: none;" data-num="${ccvo.com_com_num}"></div></div>`;
				content.innerHTML += div;
			}
		}else{ // 댓글 없는 경우
			content.innerHTML = `<div>댓글이 없어요. 첫 번째 댓글을 달아주세요!</div>`;
		}
	})
}

// -- 댓글 수정, 삭제 --
// 댓글 수정
async function updateCommentFromServer(cmtDataMod){
	try{
		const url = "/com_comment/"+ cmtDataMod.com_com_num;
		const config={
			method: "put",
			headers: {
				'Content-Type' : 'application/json; charset=utf-8'
			},
			body: JSON.stringify(cmtDataMod)
		}
		const resp = await fetch(url, config);
		const result = await resp.text();  
		return result;
		
	}catch(error){
		console.log(error);
	}
}

//댓글 삭제
async function deleteCommentFromServer(com_com_num){
	try {
		const url = "/com_comment/"+ com_com_num;
		const config={
			method: "delete",
			headers: {
				'Content-Type' : 'application/json; charset=utf-8'
			}
		}
		const resp = await fetch(url, config);
		const result = await resp.text();  
		return result;
	} catch (error) {
		console.log(error);
	}
}

//수정, 삭제 버튼 이벤트
document.addEventListener('click', (e)=>{ 
	if(e.target.classList.contains('modBtn')){
	//수정작업
		console.log("수정버튼 클릭");

		let div = e.target.closest('.comment_content');  
		let com_com_num = div.querySelector('[data-num]').dataset.num;
		let cmtText = div.querySelector('#cmtTextMod').value;
		console.log("com_com_num =" + com_com_num);
		console.log("cmtText =" + cmtText);

		let cmtDataMod = {
			com_com_num : com_com_num,
			com_com_content : cmtText
		};

		updateCommentFromServer(cmtDataMod).then(result=>{
			if(result > 0){
				alert("댓글 수정되었습니다");
				getCommentList(com_num);
			}
		})
	
	}else if(e.target.classList.contains("delBtn")){
		console.log("삭제버튼 클릭");

		let div = e.target.closest('.comment_content');  
		let com_com_num = div.querySelector('[data-num]').dataset.num;
		console.log("com_com_num =" + com_com_num);

		deleteCommentFromServer(com_com_num).then(result=>{
			if(result > 0){
				alert("댓글 삭제되었습니다");
				getCommentList(com_num);
			}
		})

	}
})
