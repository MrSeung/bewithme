async function postCourseToServer(couData){
    try {
        const url = '/cou_comment/post';
        const config = {
            method:"post",
            headers: {
                'content-type':'application/json; charset=utf-8'
            },
            body:JSON.stringify(couData)
        };
        const resp = await fetch(url, config);
        const result = await resp.text(); 
        return result;
    } catch (err) {
        console.log(err);
    }
}

document.getElementById('couPostBtn').addEventListener('click',()=>{
    const couText = document.getElementById('couText').value;
    console.log(couText);
    if(couText == "" || couText == null){
        alert('댓글을 입력해주세요.');
        document.getElementById('couText').focus();
        return false;
    }else{
        let couData = {
            cou_num : cnoVal,
            //writer : document.getElementById('').innerText,
            cou_com_content : couText
        };
        console.log(couData);
        postCourseToServer(couData).then(result=>{
            //isOk 확인 데이터
            if(result > 0){
                alert("댓글 등록 성공~!!");
                couCommentList(couData.cou_num);
            }
        })
    }
})

async function spreadCou_CommentFromServer(cou_num){
    console.log(cou_num);
    try {
        const resp = await fetch('/cou_comment/'+cou_num);
        const result = await resp.json();
        return result;
    } catch (err) {
        console.log(err);
    }
}

function couCommentList(cou_num){
    spreadCou_CommentFromServer(cou_num).then(result =>{
        console.log(result);
        const div = document.getElementById('cou_commnetlist');
        if(result.length > 0){
            div.innerHTML = "";
            for(let ccvo of result){
                let d = `<div class="comment_content">`;
                d += `<div><h4 class="nickname">${ccvo.id}</h4></div>`;
                d += `<div data-cou_com_num="${ccvo.cou_com_num}" data-cou_com_content="${ccvo.cou_com_content}">`;
                d += `<input type="text" id="cou_comment" value="${ccvo.cou_com_content}">`;
                d += `      <div>
                                <span>${ccvo.cou_com_reg_date} •</span>
                                <span>수정됨</span>
                             </div> 
                        <button type="button" class="modBtn">✔수정&nbsp;&nbsp;</button>
                        <button type="button" class="delBtn">✂삭제</button> 
                    </div>`;
                d += `</div>`;
                d += ` <div class="comment_line"></div>`;
                div.innerHTML += d;
            }
        }
    })
    
}

async function editCou_CommentToServer(couDataMod){
    try {
        const url = '/cou_comment/edit';
        const config={
            method:'put',
            headers:{
                'content-type':'application/json; charset=utf-8'
            },
            body:JSON.stringify(couDataMod)
        };
        const resp = await fetch(url, config);
        const result = await resp.text();
        return result;
    } catch (err) {
        console.log(err);
    }
}

async function removeCou_CommentToServer(cou_com_num){
    try {
        const url = '/cou_comment/'+cou_com_num;
        const config={
            method:'delete',
        };
        const resp = await fetch(url, config);
        const result = await resp.text();
        return result;
    } catch (err) {
        console.log(err);
    }
}

document.addEventListener('click',(e)=>{
    console.log(e.target);
    if(e.target.classList.contains('modBtn')){
        console.log("수정버튼 클릭시");
        //내가 클릭한 버튼의 댓글 뭉치
        let div = e.target.closest('div');
        let ccnoVal = div.dataset.cou_com_num;
        console.log(ccnoVal);
        // let input = e.target.closest('input');
        // console.log(input);
        let textContent = div.querySelector('#cou_comment').value;
        
        //let textContent = "제발";
        console.log(textContent);

        let couDataMod={
            cou_com_num : ccnoVal,
            cou_com_content : textContent
        };
        console.log(couDataMod);
        //서버 연결
        editCou_CommentToServer(couDataMod).then(result=>{
            if(result > 0){
                alert('댓글 수정 성공');
            }
            couCommentList(cnoVal);
        })
    }else if(e.target.classList.contains('delBtn')){
        console.log("삭제버튼 클릭시");
        let div = e.target.closest('div');
        let ccnoVal = div.dataset.cou_com_num;
        console.log(ccnoVal);
        removeCou_CommentToServer(ccnoVal).then(result=>{
            if(result > 0){
                alert('댓글 삭제 완료!');
            }
            couCommentList(cnoVal);
        })
    }

})