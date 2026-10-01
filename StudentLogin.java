package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebInitParam;


@WebServlet("/slogin")
//		value ="/slogin",
//		initParams = {
//				
//				  @WebInitParam(name = "username", value = "admin"),
//			        @WebInitParam(name = "timeout", value = "30")
//		}
		
			
//		)

public class StudentLogin extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
//			ServletConfig config = getServletConfig();
			
//			String uname = config.getInitParameter("username");
//			String timeout = config.getInitParameter("timeout");
//			
			PrintWriter out = resp.getWriter();
//			
//			out.println(uname);
//			out.println(timeout);
			
			if(req.getParameter("sname").equals("java")) {
				RequestDispatcher rd = req.getRequestDispatcher("Welcome");
				rd.forward(req, resp);
			}else {
				out.println("invalid");
				RequestDispatcher rd1 = req.getRequestDispatcher("std.html");
				rd1.include(req, resp);
			}
			
			
		
		
	}
	
}
