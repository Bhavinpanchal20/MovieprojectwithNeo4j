$(document).ready(function() {
			var selectedSet = [];
			var seatprice=100;
			var temp=0;
			var ans=0;
			var t=0;
			var mainprice=0;
        $( "td" ).click(function() {
            $( this ).toggleClass( "selected" );
//           $("td.selected").each(function(){
//              selectedSet.push($(this).text());
//                console.log(selectedSet);
//                temp=temp+seatprice;
//                if(temp>0){
//           		 ans=(temp*18)/100;
//           		 temp=ans+temp;
//           	 }
//                console.log(ans);
//             	console.log(temp);
//            });
            if($(this).hasClass("selected")){
            	temp=temp+seatprice;
            	ans=temp; 
            	selectedSet.push($(this).text());
          	$("#mainprice").text(temp);
          	
           	if(ans>0){
             		 ans=(temp*18)/100;
             		 ans=ans+temp;
             		 t=ans;
             		$("#totalprice").text(ans);
           	 }
            }else{
            	selectedSet.pop($(this).text());
            	if(ans>0){
            		ans=ans-118;
            		$("#totalprice").text(ans);
            		
            	}
            	temp=temp-seatprice;
//            	$("#totalprice").text(ans);
//            	temp=temp-seatprice;
//            	ans=temp;
////            	$("#mainprice").text(temp);
//            	ans=temp;
//            	if(ans>0){
//             		 ans=(temp*18)/100;
//             		ans=ans-temp;
//            	 }
            }
//            if(temp>0){
//      		 ans=(temp*18)/100;
//      		 temp=ans+temp;
//     	 }
            $("#mainprice").text(temp);
            var name=$(this).text();
            console.log(name);
        });
        $("td.selected").each(function(){
            selectedSet.push($(this).text());
            alert(selectedSet);
        });
        console.log(temp);
        $("#addticket").click(function(event){
        	alert("This is");
        	var alldata={};
        	alldata.username=$("#username").val();
        	alldata.phoneno=$('#phonenumber').val();
        	alldata.theatrename=$("#theatrename").text();
        	alldata.screen=$("#screen").text();
        	alldata.moviename=$("#moviename").text();
        	alldata.showtime=$("#showtimemovie").text();
        	alldata.seatid=selectedSet;
        	alldata.price=$("#totalprice").text();
        	
        	console.log(JSON.stringify(alldata));
        	$.ajax({
        		type: "POST",
        		contentType: "application/json",
        		url: "http://localhost:8080/bookthat",
        		data: JSON.stringify(alldata),

        		success: function() {
        			console.log(alldata);
        			alert("Saved successfully!");
        		},
        		error: function() {
        			alert("error");
        		}

        	})
        });
//        selectcallfunction();
//        pricetotal();
        
//
//        $("#countprice").click(function(){
//        	alert("This");
//        	console.log("THis is ");
//        	 $("td.selected").each(function(){
//                 selectedSet.push($(this).text());
//                 console.log(selectedSet);
//             });
//        	 $("td.selected").each(function() {
//      			temp=temp+seatprice;
//      			mainprice=temp;
//      		});
//        	 if(temp>0){
//        		 ans=(temp*18)/100;
//        		 temp=ans+temp;
//        	 }
//        	 $("#totalprice").text(temp);
//        	 $("#mainprice").text(mainprice);
//         	console.log(temp);
//         	console.log(ans);
//         	console.log(temp);
//        });
     console.log(selectedSet);
});
