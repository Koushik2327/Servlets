package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;


@WebServlet("/SimpleServlet")
public class SimpleServlet extends GenericServlet {
	
	public void init() {
		System.out.println("intialize the servlet");
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		
		res.setContentType("text/html");
		System.out.println("to call service method");
		
		PrintWriter out = res.getWriter();
		out.println("Welocme to servlet programming");
	}
	
	public void destroy() {
		System.out.println("to destroy the servlet object");
	}
	
}
