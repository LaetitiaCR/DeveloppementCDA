class Point {
    /**
     * Constructeur: Initialise une nouvelle instance de la classe "Point"
     * @param int _x Coordonnée horizontale du point (abscisse). Valeur négative acceptée
     * @param int _y Coordonnée verticale du point (ordonnée). Valeur négative acceptée
     */

    constructor(_x, _y) {
        this.x = parseInt(_x);
        this.y = parseInt(_y);
    }

    /**
     * Retourne une représentation textuelle du Point
     * @return string Les coordonnées du Point
     */

    toString() {
        return "(" + this.x + "," + this.y + ")";
    }




    move(_x, _y) {
        this.x = parseInt(_x);
        this.y = parseInt(_y);
    }




    //nouveau point avec les coordonnées du point d'instance
    duplicate() {
        const pt2 = new Point(this.x, this.y);
        return pt2;
    }

    //copy les coordonnées du point
    copy(_point) {
        this.x = _point.x;
        this.y = _point.y;
    }

    rabbit(_point) {
        let x2 = this.x;
        let y2 = this.y;
        this.move(_point.x, _point.y)
        _point.x = x2;
        _point.y = y2;
    }

    symetrieOrdonnee() {
        if (this.x >= 0) {
            this.x = x - 2 * x;
        } else {
            this.x = x + 2 * x;
        }
    }
    symetrieAbscisse() {
        if (this.y >= 0) {
            this.y = y - 2 * y;
        } else {
            this.y = y + 2 * x;
        }
    }
    symetrie() {
        symetrieOrdonnee();
        symetrieAdbscisse();
    }

    permutter() {
        x = symetrieAdbscisse();
        y = symetrieOrdonnee();

        this.x = y;
        this.y = x;
    }
}


module.exports = { Point };