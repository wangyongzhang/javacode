$(document).ready(function(){
	$("#colsureButton").click(function (){
		var count = 1;
		//设置定时器，每隔一秒执行一次
		window.setInterval(function(){
			$("#divResult").html(count+"<br/>");
			count++;
		}, 1000);
	});
	
	$("#showDOM").click(function(){
		var oHml = document.documentElement;
		var oHead = oHml.firstChild;
		var oBody = oHml.lastChild;
		alert(oHead);
		alert(oBody);
	});
});