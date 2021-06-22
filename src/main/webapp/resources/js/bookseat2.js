$(document).ready(function(){
	
/*	$('#btnSeating').on('click', createseating);*/
	$('#btnSeating').click(function(){
			
	
	});
	$("#add-ticket").click(function(){
			count=createseating();
			callaaddfun();
			console.log(count);
	});

})
function createseating(that){
    var count=0;
     var seatingValue = [];
     for ( var i = 0; i < 10; i++){
       
        for (var j=0; j<10; j++){
            var seatingStyle = "<div class='seat available'></div>";
            seatingValue.push(seatingStyle);
    
             if(j===9){
            console.log("	");
            var seatingStyle = "<div class='clearfix'></div>";
            seatingValue.push(seatingStyle);   
            }
      }   
    }
$('#messagePanel').html(seatingValue);
    $(function(){
                $('.seat').on('click',function()
                { 
                	if($(this).hasClass("selected")){
//                    count=count-1;
                    $(this).removeClass("selected");
//                    console.log(count);

                  }else
                  {            
//                    count=count+1;
                    $(this).addClass("selected");
//                    console.log(count);
                  }
    
                });
    
                $('.seat').mouseenter(function(){     
                    $(this).addClass("hovering");
                       $('.seat').mouseleave(function(){ 
                       $(this).removeClass("hovering");
                          
                      });
                });
                console.log(count);
    	});
   	 this.value=count;
    };
function callaaddfun(){
		var a=createseating();
		console.log(a);
}

