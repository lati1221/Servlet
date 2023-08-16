package com.dlqudwp.servlet.database;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dlqudwp.servlet.common.MysqlService;

@WebServlet("/db/ex01")
public class Ex01Controller extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		MysqlService mysqlService = new MysqlService();
		mysqlService.connect();
		
		String selectQuery = "SELECT * FROM `used_goods`;";
		ResultSet resultSet = mysqlService.select(selectQuery);
		
		out.println("<html><head><title>중고물품</title></head><body>");
		
		while(resultSet.next()) {
			String title = resultSet.getString("title");
			int price = resultSet.getInt("price");
			
			// 제목 : 플스 팝니다. 가격 : 30000원
			out.println("<div>제목 : " + title + " 가격 : " + price + "</div>");
			
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		String insertQuery = INSERT INTO `used_goods`
				(`sellerId`, `title`, `price`, `description`)
				VALUE
				(3, '고양이 간식 팝니다', 2000, '저희 고양이가 안먹어서 팔아요');
		
		
		mysqlService.disconnect();
		
		out.println("</body></html>");
		
		
		
//		try {
//			// 데이터베이스 접속
//			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
//			// 서버 주소, 아이디, 비밀번호
//			String url = "jdbc:mysql://localhost:3306/byungje";
//			String userId = "root";
//			String password = "root";
//			
//			Connection connection = DriverManager.getConnection(url, userId, password);
//			Statement statement = connection.createStatement();
//			
//			String selectQuery = "SELECT * FROM `used_goods`;";
//			ResultSet resultSet = statement.executeQuery(selectQuery);
//			
//			
//			out.println("<html><head><title>중고물품</title></head><body>");
//			
//			while(resultSet.next()) {
//				String title = resultSet.getString("title");
//				int price = resultSet.getInt("price");
//				
//				// 제목 : 플스 팝니다. 가격 : 30000원
//				out.println("<div>제목 : " + title + " 가격 : " + price + "</div>");
//			}
//			
//			out.println("</body></html>");
//			
//			
//		} catch (SQLException e) {
//			
//			e.printStackTrace();
//		}
//		
//		
	
	
	
	

