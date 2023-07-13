window.onload = function () { buildCalendar(); }    // 웹 페이지가 로드되면 buildCalendar 실행

let nowMonth = new Date();  // 현재 달을 페이지를 로드한 날의 달로 초기화
let today = new Date();     // 페이지를 로드한 날짜를 저장
today.setHours(0, 0, 0, 0);    // 비교 편의를 위해 today의 시간을 초기화

// 달력 생성 : 해당 달에 맞춰 테이블을 만들고, 날짜를 채워 넣는다.
function buildCalendar() {

    let firstDate = new Date(nowMonth.getFullYear(), nowMonth.getMonth(), 1);     // 이번달 1일
    let lastDate = new Date(nowMonth.getFullYear(), nowMonth.getMonth() + 1, 0);  // 이번달 마지막날

    let tbody_Calendar = document.querySelector(".Calendar > tbody");
    document.getElementById("calYear").innerText = nowMonth.getFullYear();             // 연도 숫자 갱신
    document.getElementById("calMonth").innerText = leftPad(nowMonth.getMonth() + 1);  // 월 숫자 갱신

    while (tbody_Calendar.rows.length > 0) {                        // 이전 출력결과가 남아있는 경우 초기화
        tbody_Calendar.deleteRow(tbody_Calendar.rows.length - 1);
    }

    let nowRow = tbody_Calendar.insertRow();        // 첫번째 행 추가           

    for (let j = 0; j < firstDate.getDay(); j++) {  // 이번달 1일의 요일만큼
        let nowColumn = nowRow.insertCell();        // 열 추가
    }

    for (let nowDay = firstDate; nowDay <= lastDate; nowDay.setDate(nowDay.getDate() + 1)) {   // day는 날짜를 저장하는 변수, 이번달 마지막날까지 증가시키며 반복  

        let nowColumn = nowRow.insertCell();        // 새 열을 추가하고


        let newDIV = document.createElement("p");
        newDIV.innerHTML = leftPad(nowDay.getDate());        // 추가한 열에 날짜 입력
        nowColumn.appendChild(newDIV);

        if (nowDay.getDay() == 6) {                 // 토요일인 경우
            nowRow = tbody_Calendar.insertRow();    // 새로운 행 추가
        }

        if (nowDay < today) {                       // 지난날인 경우
            newDIV.className = "pastDay";
        }
        else if (nowDay.getFullYear() == today.getFullYear() && nowDay.getMonth() == today.getMonth() && nowDay.getDate() == today.getDate()) { // 오늘인 경우           
            newDIV.className = "today";
            newDIV.onclick = function () { choiceDate(this); }
            console.log(nowDay.getFullYear());
            console.log(nowDay.getMonth());
            console.log(nowDay.getDate());
        }
        else {                                      // 미래인 경우
            newDIV.className = "futureDay";
            newDIV.onclick = function () { choiceDate(this); }
        }
    }
}

// 날짜 선택
function choiceDate(newDIV) {
    if (document.getElementsByClassName("choiceDay")[0]) {                              // 기존에 선택한 날짜가 있으면
        document.getElementsByClassName("choiceDay")[0].classList.remove("choiceDay");  // 해당 날짜의 "choiceDay" class 제거
    }
    newDIV.classList.add("choiceDay");           // 선택된 날짜에 "choiceDay" class 추가
    console.log(newDIV);
}

// 이전달 버튼 클릭
function prevCalendar() {
    nowMonth = new Date(nowMonth.getFullYear(), nowMonth.getMonth() - 1, nowMonth.getDate());   // 현재 달을 1 감소
    buildCalendar();    // 달력 다시 생성
    schedulePrint();
}
// 다음달 버튼 클릭
function nextCalendar() {
    nowMonth = new Date(nowMonth.getFullYear(), nowMonth.getMonth() + 1, nowMonth.getDate());   // 현재 달을 1 증가
    buildCalendar();    // 달력 다시 생성
    schedulePrint();
}

// input값이 한자리 숫자인 경우 앞에 '0' 붙혀주는 함수
function leftPad(value) {
    // if (value < 10) {
    //     value = "0" + value;
    //     return value;
    // }
    return value;
}



//---------------------------------------------------------------------------------------
//스케줄 등록 부분
const openModalButton = document.getElementById('scheduleAddBtn');
const modalOverlay = document.querySelector('.modal-overlay');
const scheduleRegisterBtn = document.getElementById('scheduleRegisterBtn');

const date = document.getElementById('date');
const url = document.getElementById('url');
const description = document.getElementById('description');

// 스케줄 모달 출력
openModalButton.addEventListener('click', function () {
    modalOverlay.style.visibility = 'visible';
    date.value = null;
    url.value = null;
    description.value = null;
});

modalOverlay.addEventListener('click', function (event) {
    if (event.target === modalOverlay) {
        modalOverlay.style.visibility = 'hidden';
    }
});


// 스케줄 등록 함수
async function scheduleRegister(scheduleData) {
    try {
        const url = "/calendar/register";
        const config = {
            method: "post",
            headers: {
                'content-type': 'application/json; charser=utf-8'
            },
            body: JSON.stringify(scheduleData)
        };
        const resp = await fetch(url, config);
        const result = await resp.text();
        return result;
    } catch (err) {
        console.log(err);
    }
}

//스케줄 목록 가져오기
async function scheduleList() {
    try {
        const url = "/calendar/list";
        const resp = await fetch(url);
        const result = await resp.json();
        return result;
    } catch (err) {
        console.log(err);
    }
}

function schedulePrint() {
    scheduleList().then(result => {
        console.log("scheduleList 결과 >> " + result.length);
        const schedule = document.getElementById('schedule-container');
        if (result.length > 0) {
            schedule.innerHTML = "";
            let div = "";

            for (let CalendarVO of result) {
                let date = CalendarVO.date;
                console.log("date >> " + date);
                let month = date.substring(date.indexOf("-") + 1, date.lastIndexOf("-"));
                if (month.charAt(0) == '0') {
                    month = month.charAt(1);
                }
                let day = date.substring(date.lastIndexOf("-") + 1);
                if (day.charAt(0) == '0') {
                    day = day.charAt(1);
                }

                //각 월마다 해당 스케줄 출력
                if ((nowMonth.getMonth() + 1) == month) {
                    div += `<div class="schedule">`;
                    div += `<h4>${day}일</h4>`;
                    div += `<p><a href="${CalendarVO.url}" target="_blank">${CalendarVO.cal_content}</a></p>`;
                    div += `<div id="schedule${month}" class="scheduleMonth"></div>`;
                    div += `<input type="hidden" id="cal_num" name="cal_num" value="${CalendarVO.cal_num}"/>`;
                    div += `</div>`;
                }
            }
            schedule.innerHTML = div;
        }
        else {
            let div = `<div class="schedule">`;
            div += `<h4>일정 없음</h4>`;
            div += `</div>`;
            schedule.innerHTML = div;
        }
    })
}



scheduleRegisterBtn.addEventListener('click', () => {

    let scheduleData = {
        id: id,
        date: date.value,
        url: url.value,
        cal_content: description.value
    };
    if (id == null || id == "") {
        alert("세션이 완료되었습니다. 다시 로그인 해주세요.");
        location.href = "/member/logout";
    }
    if (date.value == null || date.value == "") {
        alert("날짜를 입력해주세요.");
        date.focus();
    } else if (description.value == null || description.value == "") {
        alert("내용을 입력해주세요.");
        description.focus();
    }
    else {

        scheduleRegister(scheduleData).then(result => {
            if (result > 0) {
                modalOverlay.style.visibility = 'hidden';
                alert("스케줄 등록 성공!");
                schedulePrint();
            }
            else {
                alert("스케줄 등록 실패ㅠ");
            }
        });
    }

});

//--------------------------------------------------------------
// todo 기능 구현
const todoBtn = document.getElementById('todoBtn');
const todoContent = document.getElementById('todo-content');

//todo 내용 저장
async function todoRegister(todoData) {
    try {
        const url = "/todo/register";
        const config = {
            method: "post",
            headers: {
                'content-type': 'application/json; charser=utf-8'
            },
            body: JSON.stringify(todoData)
        };
        const resp = await fetch(url, config);
        const result = await resp.text();
        return result;
    } catch (err) {
        console.log(err);
    }
}

//todo 목록 가져오기
async function todoList() {
    try {
        const url = "/todo/list";
        const resp = await fetch(url);
        const result = await resp.json();
        return result;
    } catch (err) {
        console.log(err);
    }
}

//todo 목록 isDel 'y'로 변경
async function removeTodo(todo_num){
    try{
        const url='/todo/remove/'+todo_num;
        const config={
            method:'put'
        };
        const resp = await fetch(url, config);
        const result = await resp.text();
        return result;
    }catch(err){
        console.log(err);
    }
}

//todo 삭제 이모티콘 클릭 시
document.addEventListener('click',(e)=>{
    if(e.target.classList.contains('bi-trash3')){
        console.log("todo 삭제 이모티콘 클릭");
        let div=e.target.closest('div');
        let todo_num=div.dataset.todonum;
        console.log("삭제 클린한 div의 todo_num : "+todo_num);
        removeTodo(todo_num).then(result=>{
            if(result >0){
                alert('todo완료 변경 성공~!!');
            }
            else{
                alert('todo완료 변경 실패ㅠ');
            }
            todoPrint();
            todoModalPrint();
        })
    }
})

//todo 목록들 화면에 뿌리기
function todoPrint() {
    todoList().then(result => {
        console.log("todo 결과 >> " + result.length);
        const todo = document.getElementById('todo-container');
        if (result.length > 0) {
            todo.innerHTML = "";
            let div = "";
            for (let todoVO of result) {
                if(todoVO.isDel=='n'){
                div += `<div class="todo-content" data-todonum="${todoVO.todo_num}">`;
                div += `<p><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
                fill="currentColor" class="bi bi-check2-circle" viewBox="0 0 16 16">
                <path
                    d="M2.5 8a5.5 5.5 0 0 1 8.25-4.764.5.5 0 0 0 .5-.866A6.5 6.5 0 1 0 14.5 8a.5.5 0 0 0-1 0 5.5 5.5 0 1 1-11 0z" />
                <path
                    d="M15.354 3.354a.5.5 0 0 0-.708-.708L8 9.293 5.354 6.646a.5.5 0 1 0-.708.708l3 3a.5.5 0 0 0 .708 0l7-7z" />
            </svg>&nbsp; ${todoVO.todo_content}</p>`;
                //a태그에 삭제 controller 연결하기
                div += `<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
                fill="currentColor" class="bi bi-trash3" viewBox="0 0 16 16">
                <path
                    d="M6.5 1h3a.5.5 0 0 1 .5.5v1H6v-1a.5.5 0 0 1 .5-.5ZM11 2.5v-1A1.5 1.5 0 0 0 9.5 0h-3A1.5 1.5 0 0 0 5 1.5v1H2.506a.58.58 0 0 0-.01 0H1.5a.5.5 0 0 0 0 1h.538l.853 10.66A2 2 0 0 0 4.885 16h6.23a2 2 0 0 0 1.994-1.84l.853-10.66h.538a.5.5 0 0 0 0-1h-.995a.59.59 0 0 0-.01 0H11Zm1.958 1-.846 10.58a1 1 0 0 1-.997.92h-6.23a1 1 0 0 1-.997-.92L3.042 3.5h9.916Zm-7.487 1a.5.5 0 0 1 .528.47l.5 8.5a.5.5 0 0 1-.998.06L5 5.03a.5.5 0 0 1 .47-.53Zm5.058 0a.5.5 0 0 1 .47.53l-.5 8.5a.5.5 0 1 1-.998-.06l.5-8.5a.5.5 0 0 1 .528-.47ZM8 4.5a.5.5 0 0 1 .5.5v8.5a.5.5 0 0 1-1 0V5a.5.5 0 0 1 .5-.5Z" />
            </svg>`;
                div += `</div>`;
                }
            }
            todo.innerHTML = div;
        }
        else {
            let div = `<div class="todo-content">`;
            div += `<h4>todo 없음</h4>`;
            div += `</div>`;
            todo.innerHTML = div;
        }
    })
}

//todo 모달 폼에 내용 뿌리기
function todoModalPrint() {
    todoList().then(result => {
        const todo = document.getElementById('todoModalList');
        if (result.length > 0) {
            todo.innerHTML = "";
            let div = "";
            for (let todoVO of result) {
                if(todoVO.isDel=='n'){
                div += `<div class="todo-content" data-todonum="${todoVO.todo_num}">`;
                div += `<p><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
                fill="currentColor" class="bi bi-check2-circle" viewBox="0 0 16 16">
                <path
                    d="M2.5 8a5.5 5.5 0 0 1 8.25-4.764.5.5 0 0 0 .5-.866A6.5 6.5 0 1 0 14.5 8a.5.5 0 0 0-1 0 5.5 5.5 0 1 1-11 0z" />
                <path
                    d="M15.354 3.354a.5.5 0 0 0-.708-.708L8 9.293 5.354 6.646a.5.5 0 1 0-.708.708l3 3a.5.5 0 0 0 .708 0l7-7z" />
            </svg>&nbsp; ${todoVO.todo_content}</p>`;
                //a태그에 삭제 controller 연결하기
                div += `<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
                fill="currentColor" class="bi bi-trash3" viewBox="0 0 16 16">
                <path
                    d="M6.5 1h3a.5.5 0 0 1 .5.5v1H6v-1a.5.5 0 0 1 .5-.5ZM11 2.5v-1A1.5 1.5 0 0 0 9.5 0h-3A1.5 1.5 0 0 0 5 1.5v1H2.506a.58.58 0 0 0-.01 0H1.5a.5.5 0 0 0 0 1h.538l.853 10.66A2 2 0 0 0 4.885 16h6.23a2 2 0 0 0 1.994-1.84l.853-10.66h.538a.5.5 0 0 0 0-1h-.995a.59.59 0 0 0-.01 0H11Zm1.958 1-.846 10.58a1 1 0 0 1-.997.92h-6.23a1 1 0 0 1-.997-.92L3.042 3.5h9.916Zm-7.487 1a.5.5 0 0 1 .528.47l.5 8.5a.5.5 0 0 1-.998.06L5 5.03a.5.5 0 0 1 .47-.53Zm5.058 0a.5.5 0 0 1 .47.53l-.5 8.5a.5.5 0 1 1-.998-.06l.5-8.5a.5.5 0 0 1 .528-.47ZM8 4.5a.5.5 0 0 1 .5.5v8.5a.5.5 0 0 1-1 0V5a.5.5 0 0 1 .5-.5Z" />
            </svg>`;
                div += `</div>`;
                }
                else{
                    div += `<div class="todo-content" data-todonum="${todoVO.todo_num}">`;
                    div += `<p style="color:gray;"><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
                    fill="currentColor" class="bi bi-check2-circle" viewBox="0 0 16 16">
                    <path
                        d="M2.5 8a5.5 5.5 0 0 1 8.25-4.764.5.5 0 0 0 .5-.866A6.5 6.5 0 1 0 14.5 8a.5.5 0 0 0-1 0 5.5 5.5 0 1 1-11 0z" />
                    <path
                        d="M15.354 3.354a.5.5 0 0 0-.708-.708L8 9.293 5.354 6.646a.5.5 0 1 0-.708.708l3 3a.5.5 0 0 0 .708 0l7-7z" />
                </svg>&nbsp; <STRIKE><i> ${todoVO.todo_content}</i></STRIKE></p>`;
                    //a태그에 삭제 controller 연결하기
                    div += `<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
                    fill="currentColor" class="bi bi-trash3" viewBox="0 0 16 16">
                    <path
                        d="M6.5 1h3a.5.5 0 0 1 .5.5v1H6v-1a.5.5 0 0 1 .5-.5ZM11 2.5v-1A1.5 1.5 0 0 0 9.5 0h-3A1.5 1.5 0 0 0 5 1.5v1H2.506a.58.58 0 0 0-.01 0H1.5a.5.5 0 0 0 0 1h.538l.853 10.66A2 2 0 0 0 4.885 16h6.23a2 2 0 0 0 1.994-1.84l.853-10.66h.538a.5.5 0 0 0 0-1h-.995a.59.59 0 0 0-.01 0H11Zm1.958 1-.846 10.58a1 1 0 0 1-.997.92h-6.23a1 1 0 0 1-.997-.92L3.042 3.5h9.916Zm-7.487 1a.5.5 0 0 1 .528.47l.5 8.5a.5.5 0 0 1-.998.06L5 5.03a.5.5 0 0 1 .47-.53Zm5.058 0a.5.5 0 0 1 .47.53l-.5 8.5a.5.5 0 1 1-.998-.06l.5-8.5a.5.5 0 0 1 .528-.47ZM8 4.5a.5.5 0 0 1 .5.5v8.5a.5.5 0 0 1-1 0V5a.5.5 0 0 1 .5-.5Z" />
                </svg>`;
                    div += `</div>`;
                }
            }
            todo.innerHTML = div;
        }
        else {
            let div = `<div class="todo-content">`;
            div += `<h4>todo 없음</h4>`;
            div += `</div>`;
            todo.innerHTML = div;
        }
    })
}


//todo 모달 폼 add 버튼 클릭 시
todoBtn.addEventListener('click', () => {

    let todoData = {
        id: id,
        todo_content: todoContent.value
    };
    if (id == null || id == "") {
        alert("세션이 완료되었습니다. 다시 로그인 해주세요.");
        location.href = "/member/logout";
    }
    if (todoContent.value == null || todoContent.value == "") {
        alert("내용 입력해주세요.");
        todoContent.focus();
    }
    else {
        todoRegister(todoData).then(result => {
            if (result > 0) {
                alert("todo 등록 성공!");
                todoPrint();
                todoContent.value=null;
            }
            else {
                alert("todo 등록 실패ㅠ");
            }
        });
    }

});

// todo 모달 페이지
const todoModal_content=document.getElementById('todoModalInput'); //모달 폼 입력창
const todoModal = document.querySelector('.todo-modal');

document.getElementById('todoTitle').addEventListener('click',()=>{
    todoModalPrint();
    todoModal.style.visibility = 'visible';
    todoModal_content.value = null;
});

todoModal.addEventListener('click', function (event) {
    if (event.target === todoModal) {
        todoModal.style.visibility = 'hidden';
    }
});

document.getElementById('todoModalAddButton').addEventListener('click',()=>{
   
    let todoData = {
        id: id,
        todo_content: todoModal_content.value
    };
    if (id == null || id == "") {
        alert("세션이 완료되었습니다. 다시 로그인 해주세요.");
        location.href = "/member/logout";
    }
    if (todoModal_content.value == null || todoModal_content.value == "") {
        alert("내용 입력해주세요.");
        todoModal_content.focus();
    }
    else {
        todoRegister(todoData).then(result => {
            if (result > 0) {
                alert("todo 등록 성공!");
                todoModalPrint();
                todoPrint();
                todoModal_content.value=null;
            }
            else {
                alert("todo 등록 실패ㅠ");
            }
        });
    }
});