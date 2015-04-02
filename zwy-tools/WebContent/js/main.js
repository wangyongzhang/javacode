require.config({
	paths:{
		jquery:"jquery/1.9.1/jquery.min",
		a:"a"
	}
});

define(["jquery","a"],function($,a){
	alert($().jquery);
	alert(info);
});