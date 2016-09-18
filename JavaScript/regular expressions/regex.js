function display_subject(){
	var sub = document.getElementById("subject").value;
	var subject = sub.replace(/cmpe/i, 'CMPE');
	document.getElementById("Display").innerHTML = subject;
}