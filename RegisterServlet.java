package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Register")
public class RegisterServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String uname = req.getParameter("username");
		String pass = req.getParameter("password");
		
		PrintWriter out = resp.getWriter();
		
		
		try {
			Connection con =ConnectionDao.getConnection();
			
			String qry= "insert into userdata(username,password) values(?,?)";
			PreparedStatement pst = con.prepareStatement(qry);
			pst.setString(1, uname);
			pst.setString(2, pass);
			int resu=pst.executeUpdate();
			
			if(resu>0) {
				out.println("Registerd Successfully");
			}else out.println("Already Present");
			
			pst.close();
			con.close();
		} catch (Exception e) {
			out.println(e.getMessage());
		}
		
	}

}
