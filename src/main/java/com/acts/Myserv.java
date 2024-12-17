package com.acts;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Myserv extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		var out = response.getWriter();

        // Write the HTML response
        out.println("<html>");
        out.println("<head><title>My First Servlet</title></head>");
        out.println("<body>");
        out.println("<h1>Hello, Welcome to My First Servlet!</h1>");
        out.println("</body>");
        out.println("</html>");
		
	}

}
