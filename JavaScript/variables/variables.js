function retSavings() {
	var income = document.getElementById("income").value;
	var expenditure = document.getElementById("expenditure").value;
	var savings = parseInt(income) - parseInt(expenditure);
	document.getElementById("savings").innerHTML = savings;
}