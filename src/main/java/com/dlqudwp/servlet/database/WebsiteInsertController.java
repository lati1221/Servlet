package com.dlqudwp.servlet.database;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dlqudwp.servlet.common.MysqlService;

@WebServlet("/db/website/insert")
public class WebsiteInsertController extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String url = request.getParameter("url");

		MysqlService mysqlService = MysqlService.getInstance();
		mysqlService.connect();
		
		String query = "INSERT INTO `webpage`\r\n"
				+ "(`name`, `url`)\r\n"
				+ "VALUES\r\n"
				+ "('" + name + "', '" + url + "')";
		
		int count = mysqlService.update(query);
		
		mysqlService.disconnect();
		
		
		response.sendRedirect("/database/website-list.jsp");
		
		
	}	

}

	
	

