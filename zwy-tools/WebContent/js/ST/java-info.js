$(document).ready(
	function(){
		//数据加载
		serviceRes = $.ajax({
			type : "GET", 
	        url : "http://localhost:8080/Xcc-service/serviceTest/javaInfo", 
	        dataType: "JSON",
	        success : function(msg) { 
	        	$("#version").text(msg.version);
	            $("#vendor").text(msg.vendor);
	            $("#verdorUrl").text(msg.verdorUrl);
	            $("#home").text(msg.home);
	            $("#classVersion").text(msg.classVersion);
	            $("#classPath").text(msg.classPath);
	            $("#libraryPath").text(msg.libraryPath);
	            $("#tempFilePath").text(msg.tempFilePath);
        	}  
		});
		//偶数行底色为灰色
		$("tr:first").css("background-color","#ccc");
		$("tr:even").css("background-color","#bbb");
		
//		serviceRes = $.get({
//			url:"http://localhost:8080/Xcc-service/serviceTest/javaInfo",
//			dataType:"JSON",
//			success : function(msg){
//				$("#version").text(msg.version);
//	            $("#vendor").text(msg.vendor);
//	            $("#verdorUrl").text(msg.verdorUrl);
//	            $("#home").text(msg.home);
//	            $("#classVersion").text(msg.classVersion);
//	            $("#classPath").text(msg.classPath);
//	            $("#libraryPath").text(msg.libraryPath);
//	            $("#tempFilePath").text(msg.tempFilePath);
//			}
//		});
	}
);