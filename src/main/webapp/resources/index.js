
$(function(){
//	$.ajax({
//		url:"saluda", 
//		type:"GET",
//		dataType: "json",
//	})
//	.done(function(response){
//		console.log("objeto:"+response); 
//	})
//	.fail(function(error){
//		console.log("error:r"+error); 
//	});
	var data = {
	           saludo: "holaMundojson",
	};
	$.ajax({
		url:"postSomething", 
		type:"POST",
		data: JSON.stringify(data),
		dataType: "json",
		contentType: "application/json",
	})
	.done(function(response){
		console.log("objeto:"+response); 
	})
	.fail(function(error){
		console.log("error:r"+error); 
	});
	
})