$(document).ready(function(){
	$("#arrayBtn").click(function(){
		var array = new Array();
		array.push("123");
		array.push("456");
		alert("Array: "+Object.prototype.toString.call(array));
		alert("jQuery Object: "+$("#test").toString());
	});
	
	$("#idTest").click(function(){
		alert($("#myDiv").html);
	});
	
	//filter Test
	$("#filterTest").click(function(){
		var filterClass = $("div").filter(".testClass");
		var findClass = $("div").find(".testClass");
		if(typeof borderTest == "undefined"){
			borderTest = false;
		}
		if(!borderTest){
			findClass.css("border","");
			filterClass.css("border","solid 2px #FF0000");
			borderTest = true;
		}else{
			findClass.css("border","solid 2px #FF0000");
			filterClass.css("border","");
			borderTest = false;
		}
	});
	//add Test
	$("#addTest").click(function(){
		var filterClass = $("div").filter(".testClass");
		if(typeof addTest == "undefined"){
			addTest = true;
		}
		if(addTest){
			filterClass.append("<div><p>测试 3</p></div>");
			addTest = false;
		}else{
			$("div").filter(".testClass :last").remove();
			addTest = true;
		}
	});
	
	//children Test
	$("#childrenTest").click(function(){
		var childrenClass = $("#childrenDiv div").children();
		if(typeof childrenTest == "undefined"){
			childrenTest = true;
		}
		if(childrenTest){
			childrenClass.css("border","solid 2px #FF0000");
			childrenTest = false;
		}else{
			childrenClass.css("border","");
			childrenTest = true;
		}
	});
	
	//contents Test
	$("#contentsTest").click(function(){
		var childrenClass = $("#childrenDiv div").children().children();
		var contentsClass = $("#childrenDiv div").contents().contents();
		if(typeof contentsTest == "undefined"){
			contentsTest = true;
		}
		if(contentsTest){
			childrenClass.unwrap("<b/>");
			contentsClass.wrap("<b/>");
			contentsTest = false;
			$("#contentsTest").text("Children Test 2");
		}else{
			contentsClass.unwrap("<b/>");
			childrenClass.wrap("<b/>");
			contentsTest = true;
			$("#contentsTest").text("Contents Test");
		}
	});
	
	//change Image
	$("#dingdangImg").click(function(){
		var imgTest = $("#dingdangImg");
		if(imgTest.attr("src") == "image/dingdang1.jpg"){
			imgTest.attr("src","image/dingdang2.jpg");
		}else{
			imgTest.attr("src","image/dingdang1.jpg");
		}
	});
	
	//toggle Test
	$("#divMsg").click(function(){
		this.$divMsg = $("#divMsg");
		this.$divMsg.toggleClass("bred tblue");
	});
	
	//offset Test
	$("#divMsg2").hide();
	$("#offsetTest").click(function(e){
		var offset = $(e.target).offset();	//获取按钮的top和left值
		offset.left += $(e.target).outerWidth();	//加上按钮元素的高度
		$("#divMsg2").css(offset);	//设置弹出层的位置
		$("#divMsg2").toggle();	//切换弹出层的显示状态
	});
	
	//DOM Event
	function console(text){
		$("#divDomEvent").append("<div>"+text+"</div>");
	}
	$("*").each(function(){
		this.addEventListener("click",function(e){
			console("捕获阶段，"+this.tagName+"#"+this.id+" 事件类型："
					+e.type+" 事件源："+e.target.id);
		},true);
		this.addEventListener("click",function(e){
			console("冒泡阶段，"+this.tagName+"#"+this.id+" 事件类型："
					+e.type+" 事件源："+e.target.id);
		},false);
	});
	
	window.id = "window1";
	window.addEventListener("click",function(e){
		$("#divDomEvent").text("");		//清空原有显示
		console("捕获阶段，window"+this.tagName+"#"+this.id+" 事件类型："
				+e.type+" 事件源："+e.target.id);
	},true);
	window.addEventListener("click",function(e){
		console("冒泡阶段，window"+this.tagName+"#"+this.id+" 事件类型："
				+e.type+" 事件源："+e.target.id);
	},false);
	
//	var textNode = $("#spanEvent");
//	textNode.addEventListener("click",function(e){
//		console("捕获阶段，"+this.tagName+"#"+this.id+" 事件类型："
//				+e.type+" 事件源："+e.target.id);
//	},true);
//	textNode.addEventListener("click",function(e){
//		console("冒泡阶段，"+this.tagName+"#"+this.id+" 事件类型："
//				+e.type+" 事件源："+e.target.id);
//	},false);
	
	//bind Test
	$("#bindTest").bind("click.event1",function(e){
		alert("I event1,unbind event2");
		$("#bindTest").unbind("click.event2");
	});
	$("#bindTest").bind("click.event2",function(e){
		alert("I event2,unbind event1");
		$("#bindTest").unbind("click.event1");
	});
	
	//unload Test
	$(window).bind("beforeunload",(function(){
		return "Are you sure you want to leave?";
	}));
	
	//target Test
	$("div").not("#divMsg").click(function(e){
		console("target:"+e.target.id+",currentTarget:"+e.currentTarget.id+",relatedTarget:"
				+e.relatedTarget);
		alert("I living!");
		e.stopPropagation();
	});
	
	//mouse Test
	$("#enterleave").mouseenter(function(){
		var n = parseInt($("#enter").text())+1;
		$("#enter").text(n);
	}).mouseleave(function(){
		var n = parseInt($("#leave").text())+1;
		$("#leave").text(n);
	});
	
	$("#overout").mouseover(function(){
		var n = parseInt($("#over").text())+1;
		$("#over").text(n);
	}).mouseout(function(){
		var n = parseInt($("#out").text())+1;
		$("#out").text(n);
	});
	
	$("#enterleave").hover(function(e){
		e.type == "mouseenter"?$("#enter").text(parseInt($("#enter").text())+1)
				:$("#leave").text(parseInt($("#leave").text())+1);
		
	});
});