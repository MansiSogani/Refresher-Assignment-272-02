function calculatePerimeterOfSquare() {
		var side = document.getElementById("side").value;
		perimeter = 4 * side;
		document.getElementById("perimeter").innerHTML = "The perimeter of square is : "+perimeter;;

	};
	function calculatePerimeterOfSquareinStrictMode() {
		"use strict";
		var side = document.getElementById("side").value;
		perimeter = 4 * side;
		document.getElementById("perimeter").innerHTML = "The perimeter of square in strict mode is : "+perimeter;;

	};