const Employee = require('../employees/Employee.js');
const Enterprise = require('./Enterprise');


var employe1 = new Employee(1, 'DEV', 'Mike', 'DWWM', 50000, new Date());

const ets = new Enterprise();

ets.create(employe1);
ets.create(new Employee(2, 'RAB', 'IT', 'CDA', 60000, new Date()));


let monFiltre = emp => emp.hiredate > new Date();

let r1 = ets.readAll(monFiltre);
let r2 = ets.readAll(emp => emp.hiredate < new Date());

console.log(r1);
console.log(r2);


let myEmployee = ets.read(2);

//myEmployee.firstname = "OT";

ets.update(myEmployee);

console.log(myEmployee);

myEmployee2 = new Employee();

ets.update(myEmployee2);




/*
console.log(employe1);
let clone = Object.assign({}, employe1); //object.assing() method
let cloneWithPrototype = Object.create(Object.getPrototypeOf(employe1)),
employee1;
console.log(clone);
console.log(cloneWithPrototype);
*/