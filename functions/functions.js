//return fullname of a person using js function

function fullname() {
	var firstname = document.getElementById("firstname").value;
	var lastname = document.getElementById("lastname").value;
	if (firstname == "" && lastname == "") {
		alert("Please enter either firstname or the lastname");
	}
	var fullname = "Welcome  "+ firstname + " " + lastname + "!";
	document.getElementById("fullname").innerHTML = fullname;
	//document.getElementById("firstname").value = "";
	//document.getElementById("lastname").value = "";
}