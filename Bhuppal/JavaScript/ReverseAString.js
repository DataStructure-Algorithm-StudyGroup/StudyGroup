//Create a function that returns a string
//Bhuppal Kumar
//ramuK lappuhB

function reverseAString(strSource) {
    //Check for edge case
    if(!strSource || typeof strSource !== 'string' || strSource.length <=2) {
        return strSource;
    }
    const strTarget = [];
    for(let i = strSource.length-1; i >=0; i--){
        strTarget.push(strSource[i]);
    }
    console.log(strTarget.join(''));
}

//ES5
function reverseAString_1(strSource){
    return strSource.split('').reverse().join('');
}

//ES6
const reverseAString_2 = (strSource) => [...strSource].reverse().join('');

let strTemp = "Bhuppal Kumar";
console.log(reverseAString(strTemp));
console.log("Second way of doing it");
console.log('ES5:',reverseAString_1(strTemp));
console.log('ES5:',reverseAString_1(strTemp));
console.log('ES6:',reverseAString_2(strTemp));