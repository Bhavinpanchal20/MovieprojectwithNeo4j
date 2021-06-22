function showAll()
{
		
     		 $("#roledata").html("");
     		 $.getJSON("http://localhost:8080/showall",  function(users)
            {
            	console.log(users);
                for (var i in users) {
                    $('#roledata').append("<p>Name: " + users[i].username + "</p>")
                    $('#roledata').append("<p>Role: " + users[i].role + "</p><br>")
                }
                });
 }
     
     	