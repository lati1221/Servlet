<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리스트 다루기 1</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">



</head>
<body>
	 
	<%
		List<String> goodsList = Arrays.asList(new String[]{ 
			    "저지방 우유", "요플레 4개", "딸기 1팩", "삼겹살 300g", "생수 6개", "주방 세제"
			});
		Map<String, Integer> goodList = new HashMap<>();
		
		goodList.put("저지방 우유", 1);
		goodList.put("요플레 4개", 2);
		goodList.put("딸기 1팩", 3);
		goodList.put("삼겹살 300g", 4);
		
	
	%>

	<div class="container">
	
		<table class="table text-center">
			<thead>
				<tr>
					<th>번호</th>
					<th>품목</th>
				</tr>
			</thead>
			<tbody>
				<% for(int i = 0; i < goodsList.size(); i++) { %>
				<tr>
					<td><%= i + 1 %></td>
					<td><%= goodsList.get(i) %></td>
				</tr>
				<% } %>			
			</tbody>
		
		</table>
	</div>
</body>


</html>