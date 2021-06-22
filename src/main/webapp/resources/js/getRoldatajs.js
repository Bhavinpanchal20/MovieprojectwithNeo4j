$(document).ready(function(){
	  showalluser();
});

function showalluser(){
	$.ajax({
		type: "POST",
		contentType: "application/json",
		url: "http://localhost:8080/showall",
		dataType:json
		data: JSON.stringify(movies), 

		success: function(result) {
			alert("Saved successfully!");
		},
		error: function() {
			alert("error");
		}

	})
}