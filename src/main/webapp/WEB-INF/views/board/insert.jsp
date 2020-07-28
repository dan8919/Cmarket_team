  
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<script src="/resources/js/uploadfn.js" type="text/javascript"></script>
<title>Insert title here</title>
<style type="text/css">
	.fileDrop{
		width : 80%;
		height : 200px;
		border : 1px solid red;
		margin : auto;
	}
	
	.uploadedList{
		margin-top: 50px;
	}
	.uploadedList li{
		list-style : none;
	}
	.originalfilename{
		overflow : hidden;
		white-space : nowrap;
		text-overflow : ellipsis; 
	}
</style>



</head>
<body>
	<div class="container">
	
		<div class="row">
		
		<h1>글쓰기</h1>
			<form action="/board/insert" method="post">
				<div class="form-group">
					<label for="title">제목</label>
					<input name="title" requeired id="title" class="form-control">			
				</div>
				
				<div class="form-group">
					<label for="cno">카테고리번호</label>
					<input name="cno" requeired id="cno" class="form-control">			
				</div>
							
				<div class="form-group">
					<label for="gno">제품번호</label>
					<input name="gno" requeired id="gno" class="form-control">			
				</div>
						
			</form>
			
			
			<div class="form-group">
				<button class="btn btn-danger" id="isnertbtn">등록</button>
				<button class="btn btn-link" id="listbtn">목록</button>
			</div>
		
		</div> <!-- class = "row" -->
		
	</div><!-- class = "container  -->

	<script type="text/javascript">
			$(document).ready(function(){
				$("#isnertbtn").click(function(event){
					$("form").submit();
					});

				$("#listbtn").click(function(){
					location.href="/board/list";
					});
				
				});
			



	</script>

</body>
</html>