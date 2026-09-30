package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;


@WebServlet("/addServlet")
public class AddServlet extends GenericServlet {
	
	public void init() {
		System.out.println("init");
	}
	
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		
		int sum =num1+num2;
		
		PrintWriter out =res.getWriter();
		
		out.println("First num: "+num1);
		out.println("Second num: "+num2);
		out.println("total: "+sum);
		
		
		
		
		
	}
	
	public void destroy() {
		System.out.println("destroy");
	}
	
}
