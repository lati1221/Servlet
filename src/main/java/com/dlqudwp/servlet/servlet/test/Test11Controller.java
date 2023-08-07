package com.dlqudwp.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servlet/test11")
public class Test11Controller extends HttpServlet {
	
	private final Map<String, String> userMap =  new HashMap<String, String>() {
	    {
	        put("id", "hagulu");
	        put("password", "asdf");
	        put("name", "김인규");
	    }
	};
	
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		
		out.println("<html><head><title>로그인</title></head><body>");
		//전달 받은 id가 userMap의 id와 일치하지 않는지
		
		if(!id.equals(userMap.get("id"))) {
		
			out.println("<h1>ID가 일치하지 않습니다.</h1>");
			
			
		}
		
		else if(!password.equals(userMap.get("password"))) {
			
			out.println("<h1>password가 일치하지 않습니다.</h1>");
		
		}
		
		else if(id.equals(userMap.get("id"))&&password.equals(userMap.get("password"))) {
			
			out.println("<h1>" + userMap.get("name") + "님 환영합니다.</h1>");
			
		}
	
		out.println("</body></html>");
	}
	
	

}
