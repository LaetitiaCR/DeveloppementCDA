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

    getEmployee() {
        var empl = [this.id, this.lastname, this.firstname, this.email, this.role, this.salary, this.hiredate];
        return empl;
    }


}








/** @var Employee employee1 */
var employee1 = new Employee(1, 'Doe', 'John', 'manager', 82000, new Date('2020-12-28')); // création d'un nouvel employé
//var empl1 = new Array(employee1.getEmployee());
const employees = [employee1];
console.log('Obtenir salariés');
var empl1 = employee1.getEmployee();
console.log(empl1);
//console.log(employee1.getEmployee());
console.log("affiche paramètres d'un employé ");
console.log(employee1); // doit afficher l'objet "employee1"
console.log('*****');
console.log("Il y a " + employees.length + " employé(e)s."); // doit afficher "Il y a 5 employé(e)s."
console.log('*****');

//console.log(employees); // export des employés dans la console



var employee2 = new Employee(2, 'Pont', 'Patrice', 'director', 110000, new Date('2010-11-22')); // création d'un nouvel employé
var empl2 = employee2.getEmployee();
console.log(empl2);
console.log(empl2);
//console.log(employee1.getEmployee());
console.log("affiche paramètres d'un employé ");
console.log(employee2); // doit afficher l'objet "employee2"
console.log('*****');
console.log("Il y a " + employees.length + " employé(e)s."); // doit afficher "Il y a 5 employé(e)s."
console.log('*****');

var employee3 = new Employee(3, 'Ruel', 'Noel', 'secretary', 70000, new Date('2011-10-20')); // création d'un nouvel employé
var empl3 = employee3.getEmployee();
console.log(empl3);
console.log(empl3);
//console.log(employee1.getEmployee());
console.log("affiche paramètres d'un employé ");
console.log(employee3); // doit afficher l'objet "employee3"
console.log('*****');
console.log("Il y a " + employees.length + " employé(e)s."); // doit afficher "Il y a 5 employé(e)s."
console.log('*****');

var employee4 = new Employee(4, 'Riviere', 'Lisa', 'engineer', 90000, new Date('2012-01-15')); // création d'un nouvel employé
var empl4 = employee4.getEmployee();
console.log(empl4);
console.log(empl4);
//console.log(employee1.getEmployee());
console.log("affiche paramètres d'un employé ");
console.log(employee4); // doit afficher l'objet "employee4"
console.log('*****');
console.log("Il y a " + employees.length + " employé(e)s."); // doit afficher "Il y a 5 employé(e)s."
console.log('*****');

var employee5 = new Employee(5, 'Mars', 'Alice', 'programmer', 80000, new Date('2015-02-27')); // création d'un nouvel employé
var empl5 = employee5.getEmployee();
console.log(empl5);
console.log(empl5);
//console.log(employee1.getEmployee());
console.log("affiche paramètres d'un employé ");
console.log(employee5); // doit afficher l'objet "employee1"
console.log('*****');
console.log("Il y a " + employees.length + " employé(e)s."); // doit afficher "Il y a 5 employé(e)s."
console.log('*****');
console.log('*****');

console.log(employees); // export des employés dans la console

//Console.log(employeeNum.getMonthlySalary());







/*

// @var array employees 
const employees = [employee1, employee2, employee3, employee4, employee5]; // tableau contenant les employés

console.log(employee1); // doit afficher l'objet "employee1"
console.log("Il y a " + employees.length + " employé(e)s."); // doit afficher "Il y a 5 employé(e)s."
console.log(employees); // export des employés dans la console



for (i = 0; i < empl.length; i++) {
    if (empl[i][7] < empl[i + 1][7]) {
        empl_old = empl[i][1] + " " + empl[i][2];
    }

    if (empl[i][5] > empl[i + 1][5]) {
        empl_max_sal = empl[i][1] + " " + empl[i][2];
    }

    if (empl[i][5] < empl[i + 1][5]) {
        empl_min_sal = empl[i][1] + " " + empl[i][2];
    }

}
*/
for (var i = 0; i < 5; i++) {

    var1 = i;
    emplNum = 'empl' + var1;
    var2 = i + 1;
    emplNumSuivant = 'empl' + var2;
    if (emplNum[6] < emplNumSuivant[6]) {
        empl_old = emplNum[1];
    } else {
        empl_old = emplNumSuivant[1];
    }

    /*
    if (empl[i][5] > empl[i + 1][5]) {
        empl_max_sal = empl[i][1] + " " + empl[i][2];
    }

    if (empl[i][5] < empl[i + 1][5]) {
        empl_min_sal = empl[i][1] + " " + empl[i][2];
    }
    */

}


Console.log("Le salarié le plus ancien est : " + empl_old);
Console.log("Le salarié le plus payé est : " + empl_max_sal);
Console.log("Le salarié le plus ancien est : " + empl__min_sal);
Console.log(" La différence entre le plus bas salaire et le plus haut est : " + empl_max_sal - empl__min_sal);