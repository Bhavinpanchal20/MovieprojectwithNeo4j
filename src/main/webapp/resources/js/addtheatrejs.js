$(document).ready(function(){
	$("#add-theatre").click(function(){
		callaaddfun();
		
	});
});

function callaaddfun(){
	
	var theatres = {};
	theatres.theatrename = $("#theatrename").val();
	theatres.screen = $("#screen").val();
	console.log(JSON.stringify(theatres));
	$.ajax({
		type: "POST",
		contentType: "application/json",
		url: "http://localhost:8080/addnewtheatre",
		data: JSON.stringify(theatres),

		success: function() {
			alert("Add Theatre successfully!");
		},
		error: function() {
			alert("error");
		}

	})
}