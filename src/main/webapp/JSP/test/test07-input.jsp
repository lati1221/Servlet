<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>메뉴검색</h1>
	<form method="post" action="/JSP/test/test07.jsp">
		<div class="d-flex col-4 p-0">		
			<input type="text" class="form-control" name="menu">
			<label class="col-8"><input type="checkbox" name="points">4점 이하 제외</label>
		</div>
		<button type="submit">검색</button>
			
	</form>



</body>
</html>