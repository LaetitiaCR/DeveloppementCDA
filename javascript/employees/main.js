//appel du module à exporter Employee
const { Employee } = require("Employee");

//insertion des données dans la class Employee
// @var Employee employee1 
const employee1 = new Employee(1, 'Doe', 'John', 'manager', 82000, new Date('2020-12-28')); // création d'un nouvel employé
const employee2 = new Employee(2, 'Pont', 'Patrice', 'director', 110000, new Date('2010-11-22')); // création d'un nouvel employé
const employee3 = new Employee(3, 'Ruel', 'Noel', 'secretary', 70000, new Date('2011-10-20')); // création d'un nouvel employé
const employee4 = new Employee(4, 'Riviere', 'Lisa', 'engineer', 90000, new Date('2012-01-15')); // création d'un nouvel employé
const employee5 = new Employee(5, 'Mars', 'Alice', 'programmer', 80000, new Date('2015-02-27')); // création d'un nouvel employé

// @var array employees 
const employees = [employee1, employee2, employee3, employee4, employee5]; // tableau contenant les employés

sal = 0;
emp = "";
emplSalMax = "";
salMax = 0;
salMin = 0;
emplSalMin = 0;
dateOld = new Date();

/* 
  Boucle qui parcoure la table employees
  dans le premier if compare les salaires et récupère le plus élevé
  dans le deuxième if compare les salaires et récupère le moins élevé
 */
for (var i = 0; i < employees.length; i++) {
    console.log(employees[i]);

    if (i != 0) {
        if (employees[i].salary > salMax) {
            salMax = employees[i].salary;
            emplSalMax = employees[i].lastname + " " + employees[i].firstname;
        }

        if (salMin > employees[i].salary || salMin == 0) {
            salMin = employees[i].salary;
            emplSalMin = employees[i].lastname + " " + employees[i].firstname;
        }

        if (dateOld > employees[i].hiredate) {
            dateOld = employees[i].hiredate;
            emplOld = employees[i].lastname + " " + employees[i].firstname;
        }
    }

    console.log(Employee.getSeniority(employees[i].hiredate));
    console.log(Employee.getMonthlySalary(employees[i].salary));
    //console.log(Employee.getMonthlySalary());
}



/*
  affiche les employees insérer dans la class Employee et le nombre de salarié
 */
console.log(employees); // export des employés dans la console
console.log("Il y a " + employees.length + " employé(e)s."); // doit afficher "Il y a 5 employé(e)s."

//employees.push = [employee];
//console.log(employee1); // doit afficher l'objet "employee1"



/*
  affiche dans la console
  le salarié le plus ancien
  le salarié le plus payé de la class Employee
  le salarié le moins payé
  La diffférence de salaire entre le plus payé et le moins payé
 */
console.log("Le salarié le plus ancien est : " + emplOld);
console.log("Le salarié le plus payé est : " + emplSalMax);
console.log("Le salarié le moins payé est : " + emplSalMin);
diffSal = salMax - salMin;
console.log(" La différence entre le plus bas salaire et le plus haut est : " + diffSal);