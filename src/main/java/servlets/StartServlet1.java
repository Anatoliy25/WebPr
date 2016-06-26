package servlets;

import java.io.IOException;
import java.sql.*;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;

import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class StartServlet1 extends DispatcherServlet {
	private static final long serialVersionUID = 1;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		
		//HttpSession session = request.getSession(true);
		//String str = request.getParameter("login");
		//session.setAttribute("login", str);
		 if(request.getParameter("login1") != null)super.forward("/index.jsp", request, response);
		 else if(request.getParameter("register1") != null){
			 
			 
			 try{
				 	String Username = request.getParameter("name"); 
			        String login = request.getParameter("login");   
			        String password = request.getParameter("password");
			        Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
			        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/WebPr","root","root");
			        Statement st = conn.createStatement();
			        int i = st.executeUpdate("insert into users(Username, login, pass) values ('" + Username + "','" + login + "','" + password + "' )");
			        if (i > 0) {
			        	System.out.println("registration succsessful");
			        	HttpSession session = request.getSession(true);
			        	String str = request.getParameter("login");
			        	session.setAttribute("login", str);
			            response.sendRedirect("test.jsp");
			           // out.print("Registration Successfull!"+"<a href='index.jsp'>Go to Login</a>");
			        } else {
			            response.sendRedirect("index.jsp");
			        }
			        
			 }
			       
			            //System.out.println("Invalid login credentials");
			        	//super.forward("/index.jsp", request, response);
			        
			 
			   catch(Exception e){       
			       e.printStackTrace();       
			   }   
		 };
	}

}
