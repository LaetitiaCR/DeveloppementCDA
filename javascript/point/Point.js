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

    duplicate() {
        const pt2 = new Point(this.x, this.y);
        return pt2;
    }

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


}


module.exports = { Point };