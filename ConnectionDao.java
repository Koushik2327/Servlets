package servlets;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDao {

	final static String url = "jdbc:mysql://localhost:3306/advjava";
	final static String uname ="root";
	final static String pwd ="root";
	
	public static Connection getConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pwd);
		return con;
	}

}
