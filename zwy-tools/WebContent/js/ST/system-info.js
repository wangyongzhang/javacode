$(document).ready(
	function(){
		serviceRes = $.ajax({
			//url:"http://127.0.0.1:8080/Xcc-service/serviceTest/ajax.do",
			type : "GET", 
	        url : "http://localhost:8080/Xcc-service/serviceTest/systemInfo", 
	        dataType: "JSON",
	        success : function(msg) { 
	            $("#ip").text(msg.ip);
	            $("#mac").text(msg.mac);
	            $("#machineName").text(msg.machineName);
	            $("#machineTime").text(msg.machineTime);
	            $("#operatingSystem").text(msg.operatingSystem);
	            $("#OSArchitecture").text(msg.osarchitecture);
	            $("#OSVersion").text(msg.osversion);
        	}  
		});
		
		//css修改背景
		$("td:even").css("background-color","#aaa");
	}
);

function back(){
	window.location.href="../../index.html";
}