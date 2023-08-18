package com.dlqudwp.servlet.database;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dlqudwp.servlet.common.MysqlService;

@WebServlet("/db/website/delete")
public class WebsiteDeleteController extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//		response.setContentType("text/plain");
//		
//		PrintWriter out = response.getWriter();
	
		// 전달 받은 id에 대응하는 행을 삭제하는 기능
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		MysqlService mysqlService = MysqlService.getInstance();
		mysqlService.connect();
		
		String query = "DELETE FROM `webpage` WHERE `id` = " + id + ";";
		
		int count = mysqlService.update(query);
		
//		out.println("실행결과 : " + count);
		
		response.sendRedirect("/database/website-list.jsp");
		
		
		
	}
}
