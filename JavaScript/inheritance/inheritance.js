function employee(Name, Manager, Age, Experience) {
    this.name = Name;
    this.manager = Manager;
    this.age = Age;
    this.experience = Experience;
}
employee.prototype.department = "Software Engineering";

var e1 = new employee("Tom", "Tran", 25, 5);
document.getElementById("demo").innerHTML =
"New employee " + e1.name + ", works under the department: " + e1.department; 