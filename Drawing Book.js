'use strict';

const fs = require('fs');

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
 * Complete the 'pageCount' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER p
 */

function pageCount(n, p) {
    // Write your code here
    
    let n1 = 1;
    let n2 = (n % 2 === 0) ? n : n-1;
    let turn = 0;
    
    while(turn < n) {
        if(n1 >= p || n2 <= p) {
            return turn;
        }
        turn++;
        n1 += 2;
        n2 -= 2;
    }
}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const n = parseInt(readLine().trim(), 10);

    const p = parseInt(readLine().trim(), 10);

    const result = pageCount(n, p);

    ws.write(result + '\n');

    ws.end();
}

/* 
https://www.hackerrank.com/challenges/drawing-book/problem?isFullScreen=true
*/