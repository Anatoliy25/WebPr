<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h2>Hello jsp!</h2>


	<%
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		String loginin = request.getParameter("enter");
		String register = request.getParameter("register");
		
	%>
	
	<p><font color = "blue">Login: <%= login %></font></p>
	<p><font color = "red">Login: <%= password %></font></p>
	<p><font color = "black">button login in: <%= loginin %></font></p>
	<p><font color = "black">button register: <%= register %></font></p>


</body>
</html>