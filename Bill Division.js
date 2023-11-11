'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', function (inputStdin) {
    inputString += inputStdin;
});

process.stdin.on('end', function () {
    inputString = inputString.split('\n');

    main();
});

function readLine() {
    return inputString[currentLine++];
}

/*
 * Complete the 'bonAppetit' function below.
 *
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY bill
 *  2. INTEGER k
 *  3. INTEGER b
 */

function bonAppetit(bill, k, b) {
    // Write your code here

    //conta certa = console.log("Bon Appetit");
    //conta errada = print no valor que brian deve para anna
    //argumentos = bill array conta, k item index que anna nao comeu, b quanto anna pagou

    let valorCertoAnnaPagar = bill.reduce((valorTotal, valorAtual, index) => {
        if (index !== k) {
            return valorTotal += (valorAtual / 2);
        } else {
            return valorTotal;
        }
    }, 0);

    (valorCertoAnnaPagar === b) ? console.log("Bon Appetit") : console.log(b - valorCertoAnnaPagar);
}

function main() {
    const firstMultipleInput = readLine().replace(/\s+$/g, '').split(' ');

    const n = parseInt(firstMultipleInput[0], 10);

    const k = parseInt(firstMultipleInput[1], 10);

    const bill = readLine().replace(/\s+$/g, '').split(' ').map(billTemp => parseInt(billTemp, 10));

    const b = parseInt(readLine().trim(), 10);

    bonAppetit(bill, k, b);
}
/* 
https://www.hackerrank.com/challenges/bon-appetit/problem?isFullScreen=true
*/