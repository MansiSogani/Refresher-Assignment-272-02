function checkAge() {
    var message, age;
    message = document.getElementById("message");
    message.innerHTML = "";
    age = document.getElementById("demo").value;
    try {
        if(age == "")  throw "empty";
        if(isNaN(age)) throw "not a number";
    }
    catch(err) {
        message.innerHTML = "Age entered is " + err;
    }
}