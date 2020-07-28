<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Insert title here</title>
<style type="text/css">
	.th-center{
		text-align: center;
	}


</style>

</head>
<body>

	<div class="container">
		<div class="row text-center">
			<h1>목록</h1>			
		</div>
		
		<div class="row">
			<a href="/board/insert">글쓰기</a>
		</div>
		
		<div class="row">
			<table class="table">
				<thead>
					<tr>
						<th class="th-center">글번호</th>
						<th class="th-center" style="width: 50%">제목</th>
						<th class="th-center">카테고리넘버</th>
						<th class="th-center">제품넘버</th>
						<th class="th-center">작성일자</th>
					</tr>
				</thead>
				
				<tbody>
					<c:forEach items="${boardList}" var="dto">
						<tr>
							<td>${dto.bno}</td>
							<td><a href="/board/read/${dto.bno}">${dto.title}</a></td>
							<td>${dto.cno}</td>
							<td>${dto.gno}</td>
							<td>${dto.regDate}</td>
						</tr>
					
					</c:forEach>
				</tbody>
			</table>
		</div><!-- class=row text-center -->
		
	

		
	</div><!--class=container  -->















</body>
</html>