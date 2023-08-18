<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.dlqudwp.servlet.common.MysqlService" %>
<%@ page import="java.sql.ResultSet" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>즐겨찾기 목록</title>
</head>
<body>

	<% 
	
	MysqlService mysqlService = MysqlService.getInstance();
	mysqlService.connect();

	ResultSet resultSet = mysqlService.select("SELECT * FROM `webpage` ORDER BY `id` DESC");
	
	%>


	<table border="1">
		<thead>
			<tr>
				<th>사이트</th>
				<th>주소</th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<% while(resultSet.next()) { %>
			<tr>
				<td><%= resultSet.getString("name") %></td>
				<td><a target="_blank" href="<%= resultSet.getString("url") %>"><%= resultSet.getString("url") %></a></td>
				<td><a href="/db/website/delete?id=<%= resultSet.getInt("id") %>">삭제</a></td>
			</tr>
			<% } %>
		</tbody>
	</table>

</body>
</html>