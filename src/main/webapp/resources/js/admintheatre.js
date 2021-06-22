function vm(){
		 
     	var self=this;
         self.theatredetails=ko.observableArray([]);
         self.theatresearch=ko.observableArray([]);
         // this.Count=ko.computed(function(){
         //     return this.Accounts().length;
         // },this)
         $.getJSON("http://localhost:8080/showtheatre",function(data){
         	  console.log(data);  
         	 self.theatredetails(data);
//         	 var name;
//         	 var i;
//         	 for(i=0;i<data.length;i++)
//         	 {
//         		 name=data[i].theatrename;
//         		 console.log(name);
//         	 }
        /*  	 var name2=data[0].theatrename;
        	console.log(name2) 
         	 var tname=$("#theatrename").val();  */
         });
   		
//	 var tname=$("#theatrename").val();
//	 console.log(tname);
	 
//    	 $("#deletethis").click(function(){
	  self.deletetheatre=function(){
		  
	 
    		 var tname=$("#theatrename").text();
    		 console.log(tname);
    		 $.ajax({
    			 	url:"http://localhost:8080/removetheatre/"+tname,
    	            type: 'DELETE',
    	            contentType: "application/json",
    	           	success: function (result) {
    	                alert("Movie Theatre Delete Succesfully");
    	                
    	            },
    	            error: function (error) {
    	                alert("Error are ocurred");
    	            }
    	        });	
    	 };

	}
     ko.applyBindings(new vm());