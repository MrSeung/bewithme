
async function postCommunityToServer(cmuData){
    try{
        const url = "/community/insert";
		const config = {
			method: 'post',
			headers:{
				'content-Type': 'application/json; charset=utf-8'
			},
			body:JSON.stringify(cmuData)
		};
		const resp = await fetch(url, config); 
		const result = await resp.text(); 
		return result;
		
	}catch(error){
		console.log(">>> 비동기 전송 error발생 : " + error);
	}
}




document.getElementById('subBtn').addEventListener('click',()=>{
	const com_title =  document.getElementById('com_title').value;
	const com_content = document.getElementById('summernote').value;
	
	//라디오박스 value가져오기
	let com_category = '';
	const categorys = document.getElementsByName('com_category');
	
	categorys.forEach((node) => {
		if(node.checked)  {
			com_category = node.value;
		}
	});
	
	if(com_title == null || com_title == ""){ 
		alert("제목을 입력해주세요");
        document.getElementById('com_title').focus(); 
		return false;

	}else if( com_content == null || com_content == ""){
        alert("내용을 입력해주세요");
        document.getElementById('com_content').focus(); 
		return false;

    }else{
		let cmuData = { 
			com_title : com_title,
            id : document.getElementById("id").value,
            com_category : com_category,
            com_content : com_content
		};
        console.log(cmuData);
        
		postCommunityToServer(cmuData).then(result=>{
			if(result == 1){
				alert('게시글 작성 완료');
				window.location.href = "/community/communitypage";
			}
		});
		
	}

})