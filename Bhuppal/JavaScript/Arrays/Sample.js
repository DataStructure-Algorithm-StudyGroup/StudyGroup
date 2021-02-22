/*
const sumToN = (arrValues, iNumToSumTo) =>  {
    let i = 0;
    let j = 1;
    bSumFound = false;

    do {
        if(arrValues[i] + arrValues[j] === iNumToSumTo) {
            bSumFound = true;
            return `The values at index ${i} and index ${j} sum to ${iNumToSumTo}`;
        } else if(j === arrValues.length) {
            i++;
            j = i + 1; // reset pointers;
        } else {
            j++;
        }

    } while(bSumFound !== true);
    if (bSumFound === false) return "no match found";
}
let arr = [8, 2,  0, 0, 2];
console.log(sumToN(arr, 3));
*/

function getRandomInt(min, max) {
    min = Math.ceil(min);
    max = Math.floor(max);
    return Math.floor(Math.random() * (max - min) + min); //The maximum is exclusive and the minimum is inclusive
}


console.log(getRandomInt(0,10));