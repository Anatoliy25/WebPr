<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<style>
   		<%@include file='css/style.css' %>
    </style>
 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>registration</title>
</head>
<body>

<form action = "StartServlet1" method = "POST" class = "login" >
        Имя: <input type = "text" name = "name"/>
		Логин: <input type = "text" name = "login"/>
		Пароль: <input type = "password" name = "password"/>
		<input type = "submit" name = "register1" value = "регистрация">
		<input type = "submit" name = "login1" value = "войти">
		
	</form>

</body>
</html>