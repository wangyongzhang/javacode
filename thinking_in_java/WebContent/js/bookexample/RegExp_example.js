var text = $("#testTxt").html();
var pattern = /mom( and dad( and baby)?)?/gi;

var matches = pattern.exec(text);
$("#index").html(matches.index);
$("#input").html(matches.input);
$("#no1").html(matches[0]);
$("#no2").html(matches[1]);
$("#no3").html(matches[2]);
