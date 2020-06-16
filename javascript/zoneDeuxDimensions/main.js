const { AreaPart2 } = require("./AreaPart2");
const { Point } = require("../point/Point");



let a1p1 = new Point(0, 10);
let a1p2 = new Point(20, 30);
let a1p3 = new Point(40, 50);
let a1p4 = new Point(20, 10);
let a1p5 = new Point(30, 30);
let a1p6 = new Point(100, 250);
let a1p7 = new Point(200, 100);
let a1p8 = new Point(250, 300);


// en partant de l'origine 0,0 en haut à gauche
let width = 40; //4 colonnes de 10 de large
let height = 40; // 4 lignes de 10 de haut
var area1 = new AreaPart2(width, height);


//a1p1.x, a1p2.x

area1.addPoint(a1p1);
area1.addPoint(a1p2);
area1.addPoint(a1p3);
area1.addPoint(a1p4);
area1.addPoint(a1p5);
area1.addPoint(a1p6);
area1.addPoint(a1p7);
area1.addPoint(a1p8);

console.log(a1p1);
console.log(area1);
console.log(a1p1.x, a1p1.y);
//console.log()
let deplaceX = 1 * 10;
let deplaceY = 2 * 10;

a1p1.move(deplaceX, deplaceY);

area1.movePoint(a1p1);
//area1.movePoint(deplaceX, deplaceY, a1p1);
//console.log(deplacePoint.a1p1.x, deplacePoint.a1p1.x);
console.log(a1p1.x, a1p1.y);
//console.log(point.x, point.y);


let isInside = area1.needAllInside(a1p1.x, a1p1.y);
//console.log( + " " + area1.width + " " +  + " " + area1.height);
console.log(isInside);
console.log("");





console.log(a1p2.x, a1p2.y);
deplaceX = 1 * 10;
deplaceY = 2 * 10;
a1p2.move(deplaceX, deplaceY);
area1.movePoint(a1p2);
//console.log(pt.x, pt.y);
console.log(a1p2.x, a1p2.y);
//console.log(area1.point.x, area1.point.y)








/*
width = 6; //6 colonnes
height = 8; //8 lignes
let area2 = new Area(width, height);




let a2p1 = new Point(0, 10);
let a2p2 = new Point(20, 30);
let a2p3 = new Point(40, 50);
let a2p4 = new Point(20, 10);
let a2p5 = new Point(30, 30);
let a2p6 = new Point(100, 250);

area2.addPoint(a2p1);
area2.addPoint(a2p2);
area2.addPoint(a2p3);
area2.addPoint(a2p4);
area2.addPoint(a2p5);
area2.addPoint(a2p6);
*/