package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import java.sql.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class StartServlet extends DispatcherServlet {
	private static final long serialVersionUID = 1;


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Connection conn = null;
		HttpSession session = request.getSession(true);
		String str = request.getParameter("login");
		session.setAttribute("login", str);

		if (request.getParameter("enter") != null) {

			try {
				String Username = request.getParameter("login");
				String password = request.getParameter("password");
				Class.forName("com.mysql.jdbc.Driver"); // MySQL database
														// connection
				conn = DriverManager.getConnection("jdbc:mysql://localhost/WebPr", "root", "root");
				PreparedStatement pst = conn.prepareStatement("Select Username,pass from users where Username=? and pass=?");
				pst.setString(1, Username);
				pst.setString(2, password);
				ResultSet rs = pst.executeQuery();
				if (rs.next()) {
					System.out.println("Valid login credentials");
					super.forward("/test.jsp", request, response);
				} else {
					System.out.println("Invalid login credentials");
					super.forward("/index.jsp", request, response);
				}

			} catch (Exception e) {
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

		else if (request.getParameter("register") != null)
			super.forward("/registration.jsp", request, response);
	}

}
