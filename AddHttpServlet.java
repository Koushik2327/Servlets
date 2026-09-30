package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/httpServlet")
public class AddHttpServlet extends HttpServlet {
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				int a =Integer.parseInt(req.getParameter("a"));
				int b= Integer.parseInt(req.getParameter("b"));
				int c = a+b;
				resp.setContentType("text/html");
				PrintWriter out = resp.getWriter();
				out.println("a: "+a+"<br/>");
				out.println("b: "+b+"<br/>");
				out.println("a+b: "+c+"<br/>");
		}
}
