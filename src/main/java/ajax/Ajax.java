package ajax;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import com.google.gson.Gson;
//import com.google.gson.JsonElement;
//import com.google.gson.JsonObject;
import javax.servlet.http.HttpSession;


public class Ajax extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 
    
	Connection conn = null;
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

		
		
		/*
		if (request.getParameter("enter") != null){
			
			try{
		        String Username = "Olia"; //request.request.getParameter("login");   
		        String password = "111111"; //request.getParameter("password");
		        Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
		        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/WebPr","root","root");
		        PreparedStatement pst = conn.prepareStatement("Select Username,pass from users where Username=? and pass=?");
		        pst.setString(1, Username);
		        pst.setString(2, password);
		        ResultSet rs = pst.executeQuery();                        
		        if(rs.next()) {   
		        	
		        	
		            System.out.println("Valid login credentials");  
		        	
		        }
		        else {
		        	System.out.println("Invalid login credentials");
		        	
	        	}
		            
		        
		   }
		   catch(Exception e){       
		       e.printStackTrace();       
		   }   
			/*finally{
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}*/
			
			
			
			
		//}
			
		//*/
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn = null;
		String wins = "0";
		String loses= "0";
		String draws= "0";
		String exp= "0";
		HttpSession session = request.getSession(true);
		//String login = (String)session.getAttribute("login");
		
		try {
			String Username = (String)session.getAttribute("login");
			// String password = "111111"; //request.getParameter("password");
			Class.forName("com.mysql.jdbc.Driver"); // MySQL database connection
			 conn = DriverManager.getConnection("jdbc:mysql://localhost/WebPr", "root", "root");
			PreparedStatement pst = conn.prepareStatement("Select wins,loses,draws,exp from users where login=? ");
			pst.setString(1, Username);

			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				wins =  rs.getString("wins");
				loses = rs.getString("loses");
				draws = rs.getString("draws");
				exp = rs.getString("exp");
				
				

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
			//	e.printStackTrace();
			}
		}
		
		Map<String, String> options = new LinkedHashMap<String, String>();
		options.put("value1", wins);	    
		options.put("value2", loses);	   
		options.put("value3", draws);	    
		options.put("value4", exp);
	    
	    String json = new Gson().toJson(options);

	    response.setContentType("application/json");
	    response.setCharacterEncoding("UTF-8");
	    response.getWriter().write(json);
		
	}

	
	

}
