class AreaPart2 {
    /**
     * Constructeur: Initialise une nouvelle instance de la classe "Area"
     * La largeur et la hauteur définissent respectivement le nombre de colonnes et de lignes. 
     * @param int _width largeur de la zone
     * @param int _height hauteur de la zone
     */
    constructor(_width, _height) {
        // A vous de jouer
        this.width = parseInt(_width);
        this.height = parseInt(_height);
    }

    addArea(_aera) {
        if ((typeof _area) !== 'Aera') {
            return false;
        }

        // A vous de jouer
        this.area = _area;
        return true;
    }

    /**
     * Ajoute un "Point" dans la zone
     * Le "Point" peut se trouver hors des limites de la zone
     * @param Point _point 
     * @returns Boolean true en cas de succès, false si l'ajout est impossible 
     */
    addPoint(_point) {
        if ((typeof _point) !== 'Point') {
            return false;
        }

        // A vous de jouer
        this.point = _point;
        return true;
    }


    /**
     * Déplace un point existant dans la zone vers de nouvelles coordonnées
     * Les nouvelles coordonnées peuvent se trouver hors limites
     * @returns Boolean true en cas de succès, false en cas d'échec
     */
    movePoint(_point) {
        // implémenter la méthode

        if ((typeof _point) !== 'Point') {
            return false;
        }

        // A vous de jouer
        this.point = _point;




        return true;

    }


    /**
     * Vérifie la position de chaque "Point" existant dans la zone
     * Chaque Point hors des limites est automatiquement déplacé dans les limites vers la position libre la plus proche
     * @returns int le nombre de points déplacés
     */
    needAllInside(_point) {
        // implémenter la méthode

        /*
        if ((typeof _point) != 'Point') {
            return false;
        }
        */

        this.point = _point;

        if (this.point.x > this.width || this.point.y > this.height) {

            return false;
        }

        return true;

    }
}

module.exports = { AreaPart2 };