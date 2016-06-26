package servlets;

import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class DbWrite extends HttpServlet {
	
	

	private static final long serialVersionUID = 1L;

	// public DbWrite(String str){
	// this.str = str;
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		String login = (String)session.getAttribute("login");
		JsonObject data = new Gson().fromJson(request.getReader(), JsonObject.class);
		String str = data.get("foo").getAsString();
		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		final String DB_URL = "jdbc:mysql://localhost/WebPr";

		final String USER = "root";
		final String PASS = "root";

		Connection conn = null;
		Statement stmt = null;
		//this.doPost(request, response);

		try {
			// String str = "wins";
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			System.out.println("Creating statement...");
			System.out.println(str);
			System.out.println(login);
			
			stmt = conn.createStatement();
			stmt.executeUpdate("UPDATE users SET  " + str + " = " + str + " + 1 where login = '"+login+"'");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}
	
	
	
	

}
