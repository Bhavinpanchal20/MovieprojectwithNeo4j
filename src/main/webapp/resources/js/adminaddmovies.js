
$(document).ready(function() {
	
	$("#add-movie").click(function(event) {
		
		fire_ajax_submit();
	});
	
});

function fire_ajax_submit() {
	
	var movies = {};
	movies.moviename=$("#moviename").val();
	movies.theatrename=$("#theatrename").val();
	movies.duration = $("#duration").val();
	movies.screen=$("#screen2").val();
	movies.showtimemovie=$("#showtime").val();
	movies.showdatemovie=$("#thendate").val();
//	var maxvalue=$("#screen").val();
//	alert($("#screen").length);
//	alert($("#screen").val());
//	console.log(maxvalue);
//	console.log($("#screen").val());
//	$('#selectscreen').attr({"data-max",maxvalue});
	
//	if(maxvalue>0){
//		$("#selectscreen").attr("max",maxvalue);
//	}
//	$("#selectscreen").change(function(){
//		
//		$("#selectscreen").attr("max",maxvalue);
//	});
//	$("#selectscreen").change(function(){
//		var maxvalue=$("#screen").val();
//		  var value = $(this).val();
//		    
//		    if ((value !== '') && (value.indexOf('.') === -1)) {
//		        
//		        $(this).val(Math.max(Math.min(value, maxvalue), -90));
//		    }
//	})
//	$("#selectscreen").attr({
//		"max":$("#screen").val();
//		"min":0;
//	});
//	$("selectscreen").change(function(){
//		var max=$("#screen").val();
//		var min=1;
//	});
//	console.log($("#dateinsert").val());
	console.log(JSON.stringify(movies));
	$.ajax({
		type: "POST",
		contentType: "application/json",
		url: "http://localhost:8080/insertmovies",
		data: JSON.stringify(movies),

		success: function() {
//			console.log($("#dateinsert").val());
			alert("Saved successfully!");
		},
		error: function() {
			alert("error");
		}

	})
}