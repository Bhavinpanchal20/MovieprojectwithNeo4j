$(document).ready(function(){
    		$("#submitclick").click(function(){
        	   alert("alert this");
        	 $.ajax({
         	    type : "DELETE",
         	    url : "http://localhost:8080/removetheatre/"+name,
         	    contentType: "application/json",
         	  
         	    success: function (data) {   
         	    	alert("Deleted succesfully");
         	    	 /* self.theatredetails(data);
         	           console.log(data); */                
         	    },
         	    error: function () {
         	        console.log("errors");
         	    }
         });
    });
   });