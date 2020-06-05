function draw() {

    let colonnes = 4;
    let lignes = 4;
    let left = 0;
    let top = 0;
    let width = 40;
    let height = 40;
    let deplaceLeft = left;
    let deplaceTop = top;


    var canvas = document.getElementById("canvas");
    var ctx = canvas.getContext("2d");

    // contour d'un rectangle/carré

    //deplace vers le bas selon le nombres de lignes
    for (let y = 0; y < lignes; y++) {

        //desssine une ligne selon le nombres de colonnes
        for (let i = 0; i < colonnes; i++) {
            ctx.strokeStyle = "rgba(0, 0, 200, 0.2)"; // mauve claire
            ctx.strokeRect(deplaceLeft, deplaceTop, width, height);

            deplaceLeft = deplaceLeft + width;


        }

        deplaceLeft = left;
        deplaceTop = deplaceTop + height;
    }



    /*
        let p1 = new Point(0, 10);

        
        let p2 = new Point(20, 30);
        let p3 = new Point(40, 50);
        let p4 = new Point(20, 10);
        let p5 = new Point(30, 30);
        let p6 = new Point(100, 250);
        let p7 = new Point(200, 100);
        let p8 = new Point(250, 300);


        left = p1.x;
        top = p1.y;

        width = 2;
        height = 2;

        // rectangle/carré rempli
        ctx.fillStyle = "rgba(0, 0, 0, 1)"; //noir
        ctx.fillRect(left, top, width, height);

        left = p2.x;
        top = p2.y;

        // rectangle/carré rempli
        ctx.fillStyle = "rgba(0, 0, 0, 1)"; //noir
        ctx.fillRect(left, top, width, height);

        left = p3.x;
        top = p3.y;

        // rectangle/carré rempli
        ctx.fillStyle = "rgba(0, 0, 0, 1)"; //noir
        ctx.fillRect(left, top, width, height);

        left = p4.x;
        top = p4.y;

        // rectangle/carré rempli
        ctx.fillStyle = "rgba(0, 0, 0, 1)"; //noir
        ctx.fillRect(left, top, width, height);

        left = p5.x;
        top = p5.y;

        // rectangle/carré rempli
        ctx.fillStyle = "rgba(0, 0, 0, 1)"; //noir
        ctx.fillRect(left, top, width, height);

        left = p6.x;
        top = p6.y;

        // rectangle/carré rempli
        ctx.fillStyle = "rgba(0, 0, 0, 1)"; //noir
        ctx.fillRect(left, top, width, height);

        left = p7.x;
        top = p7.y;

        // rectangle/carré rempli
        ctx.fillStyle = "rgba(0, 0, 0, 1)"; //noir
        ctx.fillRect(left, top, width, height);
    */
}