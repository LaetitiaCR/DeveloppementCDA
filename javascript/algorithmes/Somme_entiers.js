/**
 * Algorithme récursif de calcul de la somme de 2 entiers naturels a et b,
 * les seuls opérations de base sont :
 * l'ajout de 1 à un entier a : a+1
 * le retrait de 1 à un entier a : a-1
 * et les comparaisons à  d'un entier a : a=0, a>0 et a<0 
 * 
 * */

function somme_recursif(a, b) {
    if (a >= 0) {
        let i;
        for (i = 0; i < b; i++) {
            a++;
        }

        return a;
        //console.log(a);
    } else {
        erreur = "Entrer un nombre positif";
        return erreur;
        //console.log("Entrer un nombre positif");
    }
}

console.log(somme_recursif(0, 30));
console.log(somme_recursif(30, 0));
console.log(somme_recursif(2, 3));
console.log(somme_recursif(3, 2));
console.log(somme_recursif(4, 9));
console.log(somme_recursif(9, 4));

/**
 * Algorithme récursif de calcul du produit de 2 entiers naturels a et b
 * Les seules instructions de base permises sont: 
 * - Somme de 2 entiers a et b : (a + b)
 * - Retrait de 1 à un entier a : (a - 1)
 * - Comparaison entre un entier a et 0 : (a === 0)
 * @param int a 
 * @param int b 
 */
function produit_recursif(a, b) {
    if (a === 0) {
        return 0;
    }
    return (produit_recursif(a - 1, b) + b);
}

console.log(produit_recursif(0, 30));
console.log(produit_recursif(30, 0));
console.log(produit_recursif(2, 3));
console.log(produit_recursif(3, 2));
console.log(produit_recursif(4, 9));
console.log(produit_recursif(9, 4));