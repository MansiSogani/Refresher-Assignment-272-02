var faculties = [
    {
    "firstName":"Shim",
    "lastName":"Simon",
    "phoneNumber":"123456789",
    "Address":"235 Engg Building, San Jose State University",
    "Age": 48
    }, 
    {
    "firstName":"Dan",
    "lastName":"Harkey",
    "phoneNumber":"987654321",
    "Address":"532 Engg Building, San Jose State University",
	"Age": 52
    }
];
for(i=0;i<3;i++)
{
document.getElementById("demo"+i).innerHTML =
faculties[i]["firstName"] + "  " + faculties[i]["lastName"] +" " + faculties[i]["phoneNumber"]+ " " +faculties[i]["Address"]+ " " +faculties[i]["Age"];
}