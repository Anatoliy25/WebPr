package servlets;

import java.io.IOException;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Registration extends DispatcherServlet {
	private static final long serialVersionUID = 1;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Connection conn = null;
		if (request.getParameter("login1") != null)
			super.forward("/index.jsp", request, response);
		else if (request.getParameter("register1") != null) {

			try {
				String Username = request.getParameter("name");
				String login = request.getParameter("login");
				String password = request.getParameter("password");
				Class.forName("com.mysql.jdbc.Driver"); // MySQL database
														// connection
				conn = DriverManager.getConnection("jdbc:mysql://localhost/WebPr", "root", "root");
				Statement st = conn.createStatement();
				int i = st.executeUpdate("insert into users(Username, login, pass) values ('" + Username + "','" + login
						+ "','" + password + "' )");
				if (i > 0) {
					System.out.println("registration succsessful");
					HttpSession session = request.getSession(true);
					String str = request.getParameter("login");
					session.setAttribute("login", str);
					response.sendRedirect("test.jsp");

				} else {
					response.sendRedirect("index.jsp");
				}

			}

			catch (Exception e) {
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
		;
	}

}
