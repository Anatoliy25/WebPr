<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="shortcut icon" href="img/game.ico" type="image/ico">
<title>Game</title>
<link rel ="stylesheet" href="css/style1.css">
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
<script src="js/game.js"></script>
<script src="js/ajax.js"></script>

</head>
<body>
    <% 
    String value = (String)session.getAttribute("login");   
    %>
   

    <div id = "main">
    
	    <div id = "top" >
	    <p class = top> Привет, <%= value %> |  <a id = "topref" href = "logout.jsp">  Выйти </a>
	    </div>
	    
	    <div id= "leftpanel"> </div>
	    
	    <div id=rightpanel>
	    
	    	<a class = rp   href ="test.jsp">Новая игра</a>
	    	<a class = rp   href ="">Сброс статистики</a>
	    </div>

	<div id= "game"  >
	
		<div id= "game1" >	
			<img id= "0" src="img/white.jpg" onclick=imgchange(this,"img/krestik.jpg","img/nolik.jpg",this.id)>
								
		</div>
		
		<div id= "game2" >
			<img id= "1" src="img/white.jpg" onclick=imgchange(this,"img/krestik.jpg","img/nolik.jpg",this.id)>

		</div>
		
		<div id= "game3" >
			<img id= "2" src="img/white.jpg" onclick=imgchange(this,"img/krestik.jpg","img/nolik.jpg",this.id)>

		</div>
			<div id= "game4" >
			<img id= "3" src="img/white.jpg" onclick=imgchange(this,"img/krestik.jpg","img/nolik.jpg",this.id)>

		</div>
		<div id= "game5" >
			<img id= "4" src="img/white.jpg" onclick=imgchange(this,"img/krestik.jpg","img/nolik.jpg",this.id)>

		</div>
		<div id= "game6" >
			<img id= "5" src="img/white.jpg" onclick=imgchange(this,"img/krestik.jpg","img/nolik.jpg",this.id)>

		</div>
		<div id= "game7" >
			<img id= "6" src="img/white.jpg" onclick=imgchange(this,"img/krestik.jpg","img/nolik.jpg",this.id)>

		</div>
		<div id= "game8" >
			<img id= "7" src="img/white.jpg" onclick=imgchange(this,"img/krestik.jpg","img/nolik.jpg",this.id)>

		</div>
		<div id= "game9" >
			<img id= "8" src="img/white.jpg" onclick=imgchange(this,"img/krestik.jpg","img/nolik.jpg",this.id)>

 		</div>
	
	</div>
	</div>

</body>
</html>
