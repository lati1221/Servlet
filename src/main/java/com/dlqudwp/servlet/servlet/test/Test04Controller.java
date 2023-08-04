package com.dlqudwp.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test04")
public class Test04Controller extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>반복문리스트</title></head><body><ul>");
		
		int sum = 1;
		for(int i = 0; i < 30; i++) {
			sum = 1 + i;
			out.println("<li>" + sum + "번째 리스트</li>");
		}
		out.println("</ul></body></html>");
	}
	
	
	
	

}
