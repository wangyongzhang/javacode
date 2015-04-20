$("#dateTest").html((new Date()).toString());
$("#pareseTest").html((new Date("May 25, 2004")).toString());
$("#UTCTest").html(new Date(Date.UTC(2005, 4, 5, 17, 55,55)).toString());
$("#dateString").html(new Date().toDateString());
$("#timeString").html(new Date().toTimeString());
$("#localeDateString").html(new Date().toLocaleDateString());
$("#localeTimeString").html(new Date().toLocaleTimeString());
$("#utcString").html(new Date().toUTCString());
