<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <style>
   		<%@include file='css/style.css' %>
    </style>
<title>Start page</title>
</head>
<body>

	<form action = "StartServlet" method = "POST" class = "login" >
		Логин: <input type = "text" name = "login"/>
		Пароль: <input type = "password" name = "password"/>
		<input type = "submit" name = "enter" value = "Войти">
		<input type = "submit" name = "register" value = "Зарегистрироваться">
		
	</form>

</body>
</html>