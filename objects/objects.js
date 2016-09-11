// wap in js to store student info using obj and get vaule of the records saved.
var student = {
    firstName : "Mansi",
    lastName  : "Sogani",
    age       : 23,
    id 		  : 010715887
};

document.getElementById("demo").innerHTML =
student.firstName + " " + student.lastName + ", Student id: (" + student.id + ") is " + student.age + " years old.";