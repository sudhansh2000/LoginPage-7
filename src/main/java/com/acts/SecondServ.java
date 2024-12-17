package com.acts;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class SecondServ extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		
		PrintWriter out=resp.getWriter();
		
		out.println("<html>");
        out.println("<head><title>hello end point servlet</title></head>");
        out.println("<body>");
        out.println("<h1>Hello, Welcome to My First Servlet!</h1>");
        out.println("</body>");
        out.println("</html>");
        
        
	}
	

}
