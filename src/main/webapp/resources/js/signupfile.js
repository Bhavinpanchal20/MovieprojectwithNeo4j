$(document).ready(function(){
	$("#new-role").click(function(){
		callaaddfun();
		
	});
});

function callaaddfun(){
	
	var theatres = {};
	theatres.username = $("#username").val();
	theatres.password = $("#password").val();
	theatres.role = $("#role").val();
	console.log(JSON.stringify(theatres));
	$.ajax({
		type: "POST",
		contentType: "application/json",
		url: "http://localhost:8080/addnew",
		data: JSON.stringify(theatres),

		success: function() {
			alert("Add New Role successfully!");
		},
		error: function() {
			alert("error");
		}

	})
}