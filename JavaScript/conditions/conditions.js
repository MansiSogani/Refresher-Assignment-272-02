
function check() {
	var age = document.getElementById("age").value;
	age = parseInt(age);
	if (age > 18) {
		document.getElementById("result").innerHTML = "You are eligible to drive";
	} else {
		document.getElementById("result").innerHTML = "You are not eligible to drive";
	}
}