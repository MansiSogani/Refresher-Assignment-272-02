// convert Marks to nearest one place in decimal.

function convert(){

var Marks = document.getElementById("Marks").value;;
document.getElementById("result").innerHTML = "Reduced Marks to two decimal places is "+ Math.round(Marks);

}