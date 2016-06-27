setInterval('AddExp()', 10000);
    

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