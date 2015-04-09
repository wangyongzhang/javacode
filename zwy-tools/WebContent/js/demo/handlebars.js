$(document).ready(function(){
	var data ={
			"student":[{
				"name":"zhang san",
				"sex":"0",
				"age":18
			},{
				"name":"li si",
				"sex":"0",
				"age":20
			},{
				"name":"lily",
				"sex":"1",
				"age":19
			}],
			"title":"handlebars demo",
			"author":"tester",
			"programme":[{"language":"Chinese"},{"language":"English"},{"language":"Japanese"}]
	};
	
	var tableTemplate = Handlebars.compile($("#table-template").html());
	Handlebars.registerHelper("compare",function(v1,v2,v3,v4,options){
		return v1<=v2&&v3==v4?options.inverse(this):options.fn(this);
	});
	Handlebars.registerHelper("transformat",function(value){
		return value == "0"?"Male":"Female";
	});
	Handlebars.registerHelper("debug",function(optionValue){
		console.log("current Context");
		console.log("==================");
		console.log(this);
		if(optionValue){
			console.log("value");
			console.log("====================");
			console.log(optionValue);
		}
	});
	$("#demoBody").html(tableTemplate(data));
});