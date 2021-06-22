$(document).ready(function(){
	var temp=0;
	if($('.input1').val())
		{
		
		var ans=$(this).text();
		temp=temp+ans;
		}
	console.log(temp);
	$(".input1").change(function() {
		  alert( "Handler for .change() called." );
		});
	
});


// match(b:Booking) return sum(toFloat(b.price))