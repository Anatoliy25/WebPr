var triger = true;//флаг смены игрока
var i =0 ;        // выбор хода
var a11= 0;
var a12= 0;
var a13= 0;
var a21= 0;
var a22= 0;
var a23= 0;
var a31= 0;
var a32= 0;
var a33= 0;
var arr = [a11,a12,a13,a21,a22,a23,a31,a32,a33]; //счетчики нажатий

function checkWin(){
	
	if((arr[0]+arr[1]+arr[2])==30||(arr[3]+arr[4]+arr[5])==30||(arr[6]+arr[7]+arr[8])==30||(arr[0]+arr[3]+arr[6])==30||
			(arr[1]+arr[4]+arr[7])==30||(arr[2]+arr[5]+arr[8])==30||(arr[0]+arr[4]+arr[8])==30||(arr[2]+arr[4]+arr[6])==30)
	{alert("Вы выиграли")  
		
		var data = {
	    foo: "wins"	    
		};
	
	$.ajax({
	    type: "POST",
	    url: "DbWrite",
	    contentType: "application/json", // NOT dataType!
	    data: JSON.stringify(data),
	    success: function(response) {
	        // ...
	    }
	});
		
		
   	 	location.href = 'test.jsp';}
	
	else if(arr[0]!=0&&arr[1]!=0&&arr[2]!=0&&arr[3]!=0&&arr[4]!=0&&arr[5]!=0&&arr[6]!=0&&arr[7]!=0&&arr[8]){alert("Ничья")
		
		
		var data = {
	    foo: "draws"	    
		};
	
	$.ajax({
	    type: "POST",
	    url: "DbWrite",
	    contentType: "application/json", // NOT dataType!
	    data: JSON.stringify(data),
	    success: function(response) {
	        // ...
	    }
	});
		
   	 	location.href = 'test.jsp';}
		
	else if((arr[0]+arr[1]+arr[2])==3||(arr[3]+arr[4]+arr[5])==3||(arr[6]+arr[7]+arr[8])==3||(arr[0]+arr[3]+arr[6])==3||
			(arr[1]+arr[4]+arr[7])==3||(arr[2]+arr[5]+arr[8])==3||(arr[0]+arr[4]+arr[8])==3||(arr[2]+arr[4]+arr[6])==3)
	{alert("Вы проиграли")
		
		var data = {
	    foo: "loses"	    
		};
	
	$.ajax({
	    type: "POST",
	    url: "DbWrite",
	    contentType: "application/json", // NOT dataType!
	    data: JSON.stringify(data),
	    success: function(response) {
	        // ...
	    }
	});
		
	 	location.href = 'test.jsp';}	
}


function AddExp(){
	
	var data = {
		    foo: "exp"	    
			};
		
		$.ajax({
		    type: "POST",
		    url: "DbWrite",
		    contentType: "application/json", // NOT dataType!
		    data: JSON.stringify(data),
		    success: function(response) {
		    	
		    	
		    }
		});
	
	
	
}


 function AIclick()
	{
	  i = Math.floor(Math.random()*10);
		  if(arr[i]==0){
			  if(i==9){i=4};
		 	return i;		  
		  }else AIclick();
	}
 
 
 function imgchange(obj,imgY,imgNol,id) 
  {
	 	  
	 if(arr[id]==0){
	  
		 if(triger){ 
	   	 	obj.src=imgY;
	   	 	arr[id]+=10;
	   	 	checkWin();
   	        AIclick();
	 
	
   	switch (i) 
   	   {
	   	case 0:	   		
	        	setTimeout(function() {$(document).ready(function(){
	        		  	$("#0").click();
	        		  }); }, 100);	        	        	
		        	 triger=!triger;		        		        			   		
	   		break;
	   		
        case 1:      	
        		setTimeout(function() {$(document).ready(function(){
        		  $("#1").click();
        		}); }, 100);      	
        		triger=!triger;
	   		break;
	   		
        case 2:
	        	setTimeout(function() {$(document).ready(function(){
	        		  $("#2").click();
	        		}); }, 100);      	
	        	triger=!triger;          	
	   		break;
	   		
        case 3:
	        	setTimeout(function() {$(document).ready(function(){

	        		  $("#3").click();
	        		}); }, 100);	        		        		        	
	        	triger=!triger;        	       	
	   		break;
	   		
        case 4:
	        	setTimeout(function() {$(document).ready(function(){
	        		  $("#4").click();
	        		}); }, 100);	        		        		        	
	        	triger=!triger;	        	
	   		break;
	   		
        case 5:
	        	setTimeout(function() {$(document).ready(function(){
	        		  $("#5").click();
	        		}); }, 100);	       	        	
	        	triger=!triger;        
     	    break;
     	    
        case 6:
	        	setTimeout(function() {$(document).ready(function(){
	        		  $("#6").click();
	        		}); }, 100);	        		        	
	        	triger=!triger;     	
	   		break;
	   		
        case 7:
	        	setTimeout(function() {$(document).ready(function(){

	        		  $("#7").click();
	        		}); }, 100);	        	
	        	triger=!triger;	        	        	
	   		break;
	   		
        case 8:
	        	setTimeout(function() {$(document).ready(function(){
	        		  $("#8").click();
	        		}); }, 100);	        		        	
	        	triger=!triger;	        	      	
	   		break;
   	   }
	 }else if(!triger){
		 obj.src=imgNol;
		 arr[id]+=1;
		 checkWin();
		 triger=!triger
	 }
	} 
	 else {
		 alert("ячейка занята  выберите другую");
		    
	 }
		 	 
}
 
 
 
 
 