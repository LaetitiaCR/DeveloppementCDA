class Employee {


    constructor(_id, _lastname, _firstname, _role, _salary, _hiredate) {
        // id (int): identifiant
        this.id = parseInt(_id);
        this.lastname = _lastname;
        this.firstname = _firstname;
        //email (string): calculé automatiquement dans le constructeur (exemple: John Doe => jdoe@email.fr)
        this.email = (this.firstname.substring(0, 1) + this.lastname + '@email.fr').toLowerCase();
        //ou this.email = (this.firstname[0] + this.lastname + '@email.fr').toLowerCase();
        this.role = _role; //role (string): poste occupé
        this.salary = _salary;
        //date d'embauche au format YYYY-MM-DD
        this.hiredate = _hiredate;

    }

    /**
     * revoie le salaire mensuel d'un salarié
     * @param {*} salary 
     */
    static getMonthlySalary(salary) {
        var salary_mensuelle = salary / 12 * 0.75;
        return salary_mensuelle;
    }


    //(exemples: "19 jours", "3 mois et 2 jours", "2 ans 7 mois et 8 jours") 
    /**
     * renvoie une chaine -> l'ancienneté de l'employé 
     * @param {*} hiredate 
     */
    static getSeniority(hiredate) {
        var dateNow = new Date();
        var dateempl = hiredate;

        console.log(dateempl);
        var time_year_empl = dateNow.getFullYear() - dateempl.getFullYear();
        var time_monts_empl = dateNow.getMonth() - dateempl.getMonth();
        var time_day_empl = dateNow.getDay() - dateempl.getDay();

        var time_entreprise = "L'employée travaille " + time_year_empl + " année(s), " + time_monts_empl + " mois, " + time_day_empl + " jours ";
        return time_entreprise;
    }

}

module.exports = { Employee };