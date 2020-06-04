/**
 * @class Employee
 */

class Employee {

    /**
     * Constructeur
     */
    constructor(_id, _lastname, _firstname, _role, _salary, _hiredate) {

        this.id = parseInt(_id); // NaN
        this.lastname = _lastname || "Ano";
        this.firstname = _firstname || "Nymous";
        this.role = _role || "Boulanger";
        this.salary = parseInt(_salary);
        this.hiredate = _hiredate;

        this.email = (this.firstname[0] + this.lastname).toLowerCase() + "@email.fr";
    }

    /**
     * Récupère le salaire mensuel de l'employé
     */
    getMonthlySalary() {
        //(salaire_mensuel = salaire_annuel / 12*0.75)
        return Math.round(this.salary / 12 * 0.75);
    }

    /**
     * 
     */
    getSeniority_Masoud() {

        let now = new Date();
        //let embaucheDate = this.hiredate;

        let diff = now.getTime() - this.hiredate.getTime();
        diff = Math.floor(diff / (1000 * 60 * 60 * 24));
        let ans = Math.floor(diff / 365.25);

        diff = diff - ans * 365.25;
        let mois = Math.floor(diff / (365.25 / 12));

        diff = Math.round(diff - mois * (365.25 / 12));
        let jour = diff;

        if (jour > 0 && mois > 0 && ans > 0) {
            return ans + " ans et " + mois + " mois et " + jour + " jours";
        } else if (jour > 0 && mois > 0 && ans == 0) {
            return mois + " mois et " + jour + " jours";
        } else if (jour > 0 && mois == 0 && ans == 0) {
            return jour + " jours";
        } else {
            return "L'employé est un alien";
        }
    }

    getSeniority_Aurelien() {
        let now = new Date();
        let diff = now.getTime() - this.hiredate.getTime();
        let year = (1000 * 3600 * 24 * 365.25);
        let month = year / 12;
        let day = year / 365.25;
        let result = "";

        if (diff < 0) {
            return "L'employé vient du futur.";
        } else if (diff % day <= 1) {
            return "L'employé est un newbie.";
        } else {
            result += Math.floor(diff / year) + " ";
            diff %= year; // équivalent de "diff = diff % year;"
            result += Math.floor(diff / month) + " ";
            diff %= month;
            result += Math.floor(diff / day) + " ";
            return result;
        }

    }

    getSeniority() {
        let now = new Date();
        let y = now.getFullYear() - this.hiredate.getFullYear(); // années
        let m = now.getMonth() - this.hiredate.getMonth(); // mois
        let d = now.getDate() - this.hiredate.getDate(); // jours
        let result = "";

        if (m < 0) {
            y--;
            m += 12;
        }

        if (d < 0) {
            m--;
            d = Math.floor(d + (365.25 / 12));
        }

        if (y > 0) {
            result += y + " année(s) ";
        }

        if (m > 0) {
            result += m + " mois ";
        }

        if (d > 0) {
            result += d + " jour(s) ";
        }

        return result;

    }
}



module.exports = Employee;