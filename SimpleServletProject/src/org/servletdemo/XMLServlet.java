package org.servletdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class XMLServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("First Servlet");
		PrintWriter writer = response.getWriter();
		writer.println("<h3>Hello HTML</h3>");
		String userName=request.getParameter("userName");
		//writer.println(request.getParameter("userName"));
		HttpSession session=request.getSession();
		if(userName !=null && userName !="")
		session.setAttribute("name", userName);
		
		writer.println(userName);
		writer.println(session.getAttribute("name"));
		
	}
}
