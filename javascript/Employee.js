class Employee {


    constructor(id, lastname, firstname, role, salary, hiredate) {
        // id (int): identifiant
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        //email (string): calculé automatiquement dans le constructeur (exemple: John Doe => jdoe@email.fr)
        this.email = this.lastname.substring(1, 2).tolowercase + this.firstname.tolowercase + 'email.fr';
        //role (string): poste occupé
        this.role = role;
        this.salary = salary;
        //date d'embauche au format YYYY-MM-DD
        this.hiredate = hiredate;


        //this.setEmployee(id, lastname, firstname, email, role, salary, hiredate);

    }

    setMonthlySalary() {
            this.salaire_mensuelle = this.salary / 12 * 0.75;
            // return salaire_mensuelle;
        }
        //retourne un entier -> le salaire mensuel NET calculé à partir du salaire annuel 
        //(salaire_mensuel = salaire_annuel / 12 * 0.75)
    getMonthlySalary() {
        // let salaire_mensuelle = this.salary / 12 * 0.75;
        return this.salaire_mensuelle;
    }

    //renvoie une chaine -> l'ancienneté de l'employé 
    //(exemples: "19 jours", "3 mois et 2 jours", "2 ans 7 mois et 8 jours") 
    setSeniority() {
        this.dateNow = new Date();

        this.time_year_empl = this.dateNow.getFullYear - this.hiredate.getFullYear;
        this.time_monts_empl = this.dateNow.getMonth - this.hiredate.getMonth;
        this.time_day_empl = this.dateNow.getDay - this.hiredate.getDay

        this.time_entreprise = "L'employée travaille " + this.time_year_empl + " année(s), " + this.time_monts_empl + " mois, " + this.time_day_empl + " jours ";
    }

    getSeniority() {
        return this.time_entreprise
    }





}









// @var Employee employee1 
var employee1 = new Employee(1, 'Doe', 'John', 'manager', 82000, new Date('2020-12-28')); // création d'un nouvel employé
//var empl1 = new Array(employee1.getEmployee());

var employee2 = new Employee(2, 'Pont', 'Patrice', 'director', 110000, new Date('2010-11-22')); // création d'un nouvel employé
//var empl1 = new Array(employee1.getEmployee());
var employee3 = new Employee(3, 'Ruel', 'Noel', 'secretary', 70000, new Date('2011-10-20')); // création d'un nouvel employé
var employee4 = new Employee(4, 'Riviere', 'Lisa', 'engineer', 90000, new Date('2012-01-15')); // création d'un nouvel employé
var employee5 = new Employee(5, 'Mars', 'Alice', 'programmer', 80000, new Date('2015-02-27')); // création d'un nouvel employé

// @var array employees 
const employees = [employee1, employee2, employee3, employee4, employee5]; // tableau contenant les employés

sal = 0;
emp = "";
emplSalMax = "";
salMax = 0;
salMin = 0;
emplSalMin = 0;
dateOld = new Date();

for (var i = 0; i < employees.length; i++) {
    console.log(employees[i]);

    //emp1 = employees[i].lastname + " " + employees[i].firstname;

    if (i != 0) {
        if (employees[i].salary > salMax) {
            salMax = employees[i].salary;
            emplSalMax = employees[i].lastname + " " + employees[i].firstname;
        }

        //salMin = employees[i].salary;
        if (salMin > employees[i].salary || salMin == 0) {
            salMin = employees[i].salary;
            emplSalMin = employees[i].lastname + " " + employees[i].firstname;
        }

        if (dateOld > employees[i].hiredate) {
            dateOld = employees[i].hiredate;
            emplOld = employees[i].lastname + " " + employees[i].firstname;
        }
    }





}


/*

*/

console.log(employees); // export des employés dans la console
console.log("Il y a " + employees.length + " employé(e)s."); // doit afficher "Il y a 5 employé(e)s."

//employees.push = [employee];



/*
console.log(employee1); // doit afficher l'objet "employee1"
console.log("Il y a " + employees.length + " employé(e)s."); // doit afficher "Il y a 5 employé(e)s."
console.log(employees); // export des employés dans la console
*/


console.log("Le salarié le plus ancien est : " + emplOld);


console.log("Le salarié le plus payé est : " + emplSalMax);
console.log("Le salarié le moins payé est : " + emplSalMin);
diffSal = salMax - salMin;
console.log(" La différence entre le plus bas salaire et le plus haut est : " + diffSal);