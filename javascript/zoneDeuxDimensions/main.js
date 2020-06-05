const { Area } = require("./Area");
const { Point } = require("../point/Point");



let width = 40; //4 colonnes
let height = 40; // 4 lignes
var area1 = new Area(width, height);

width = 6; //6 colonnes
height = 8; //8 lignes
let area2 = new Area(width, height);


// console.log(a1);
// console.log(a2);


let a1p1 = new Point(0, 10);
let a1p2 = new Point(20, 30);
let a1p3 = new Point(40, 50);
let a1p4 = new Point(20, 10);
let a1p5 = new Point(30, 30);
let a1p6 = new Point(100, 250);
let a1p7 = new Point(200, 100);
let a1p8 = new Point(250, 300);

area1.addPoint(a1p1);
area1.addPoint(a1p2);
area1.addPoint(a1p3);
area1.addPoint(a1p4);
area1.addPoint(a1p5);
area1.addPoint(a1p6);
area1.addPoint(a1p7);
area1.addPoint(a1p8);

area1.movePoint(a1p1);


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