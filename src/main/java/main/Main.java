package main;

import java.sql.*;
//import java.sql.DriverManager;
//import java.sql.SQLException;

//import connection.DBConnection;

public class Main {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/WebPr";

	static final String USER = "root";
	static final String PASS = "root";

	public static void main(String[] args) {
		//DBConnection connect = new DBConnection("localhost","root","root","WebPr");
		//connect.initProperties();
		//connect.init();
		Connection conn = null;
		Statement stmt = null;	
		
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			
			System.out.println("Creating statement...");
		      stmt = conn.createStatement();
		      String sql;
		      sql = "SELECT * FROM users ";
		      ResultSet rs = stmt.executeQuery(sql);

		      //STEP 5: Extract data from result set
		      while(rs.next()){		        
		         int id  = rs.getInt("id");
		         
		         String first = rs.getString("Username");
		         String last = rs.getString("login");
		         String pass = rs.getString("pass");
		        
		         System.out.print("ID: " + id);		       
		         System.out.print(", Username: " + first);
		         System.out.print(", login: " + last);
		         System.out.print(", pass: " + pass);
		      }
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		

	}

}
