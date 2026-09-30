package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String uname = req.getParameter("username");
		String pass = req.getParameter("password");
		
		PrintWriter out = resp.getWriter();
		
		
		try {
			Connection con =ConnectionDao.getConnection();
			
			String qry= "Select* from userData where username =? and password =?;";
			PreparedStatement pst = con.prepareStatement(qry);
			pst.setString(1, uname);
			pst.setString(2, pass);
			ResultSet result = pst.executeQuery();
			
			if(result.next()) {
				out.println("login successfull");
			}else out.println("username or password is incorrect");
			
			result.close();
			pst.close();
			con.close();
		} catch (Exception e) {
			  out.println("Error: " + e);
			    e.printStackTrace();
		}
		
	}

}
