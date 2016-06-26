<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel ="stylesheet" href="css/style1.css">
</head>
<body>
Пример аякс
  
      
    <script type="text/javascript">
    
    
    
    $(document).ready(function() {  
    	var $s = $("<b>&nbspСтатистика  &nbspигрока:</p>").appendTo($("#leftpanel"));
    	
    	setInterval(function() {
    		   
    		$.get("Ajax", function(responseJson) {                 
                var $div = $("#leftpanel");                           
                $div.find("p").remove();                          
                
                
                $.each(responseJson, function(key, value) { 
                	if(key=="value1"){
                		var $w = $("<p>Побед:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</p>").appendTo($("#leftpanel"))
                		$("<b>").val(key).text(value).appendTo($w);
                		}
                	if(key=="value2"){
                		
                		var $l = $("<p>Поражений:&nbsp&nbsp&nbsp</b>").appendTo($("#leftpanel"))
                		$("<b>").val(key).text(value).appendTo($l);
                		}
                	if(key=="value3"){
                		var $d = $("<p>Ничьи:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</b>").appendTo($("#leftpanel"))
                		$("<b>").val(key).text(value).appendTo($d);
                		}    
                	if(key=="value4"){
                		var $o = $("<p>Очки опыта:&nbsp&nbsp&nbsp</b>").appendTo($("#leftpanel"))
                		$("<b>").val(key).text(value).appendTo($o);
                		}            	
                });
            });
      
        	}, 5000);
        
    });
    
   

    </script>


<div id="leftpanel"  ></div>



</body>
</html>