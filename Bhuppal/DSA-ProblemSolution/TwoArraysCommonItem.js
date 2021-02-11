/*
Given 2 arrays, create a function that let's a user know (true/false) whether
these tow arrays contain any common items
For example:
const arr1 = ['a', 'b', 'c', 'd'];
const arr2 = ['x', 'y', 'z'];
Should return false

const arr1 = ['a', 'b', 'c', 'd', 'x'];
const arr2 = ['x', 'y', 'z'];
Should return true
 */
/*
//Naive solution
function findPair1(arr1, arr2) {
    for(let i=0;i<arr1.length; i++) {
        for(let j=0;j<arr2.length;j++) {
            if(arr1[i] === arr2[j]) return true;
        }
    }
    return false;
}
const arr1 = ['a', 'b', 'c', 'd', 'x'];
const arr2 = ['x', 'y', 'z'];
//console.log(findPair1(arr1, arr2));

//O(N)

function findPair2(arr1, arr2) {
    //Loop through first array and create object
    // where properties === items in the array
    let map = {};
    for(let i=0; i<arr1.length; i++) {
        if(!map[arr1[i]]) {
            map[arr1[i]] = arr1[i];
        }
    }
    for(let j=0;j<arr2.length;j++){
        if(map[arr2[j]]) return true;
    }
    return false;
}
//console.log(findPair2(arr1, arr2));

function findPair3(arr1, arr2) {
    return arr1.some(item => arr2.includes(item));
}
const arr1 = ['a', 'b', 'c', 'd', 'x'];
const arr2 = ['x', 'y', 'z'];
console.log(findPair3(arr1, arr2));


*/

/*
function getRandomIntInclusive(min, max) {
    min = Math.ceil(min);
    max = Math.floor(max);
    return Math.floor(Math.random() * (max - min) + min);
}
const randomize = (arr,length, notToShuffle) => {
    let notToShuffleValue = arr[notToShuffle];
    let targetIndex = notToShuffle;
    for (let i = length-1; i > 0; i--) {
            let j = getRandomIntInclusive(i, length);
                let temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
               if(arr[i]===notToShuffleValue) targetIndex=i;
               if(arr[j]===notToShuffleValue) targetIndex=j;
    }
    let temp = arr[notToShuffle];
    arr[notToShuffle] = notToShuffleValue;
    arr[targetIndex] = temp;
    //console.log(targetIndex);
    console.log(arr);
}
let array = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'];
//randomize (array, array.length, 3); //'d' should not shuffle

//randomize (array, array.length, 0);

//randomize (array, array.length, 3);
*/

/*
function callByReference(arr) {
    console.log("Inside Call by Reference Method");
    arr[2] = 892;
    console.log(arr);
}
let myArr = [1,2,3,4,5];
console.log("Before Call by Reference Method");
console.log(myArr);
callByReference(myArr)
console.log("After Call by Reference Method");
console.log(myArr);

 */
```JavaScript
const shuffleArray = (arrToShuffle, indexToSkip) => {
    let array = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'];
    let shuffledArray = [];
    arrToShuffle.forEach(value => {
        if(arrToShuffle.indexOf(value) !== indexToSkip) {
            let randomNum = Math.floor(Math.random() * arrToShuffle.length-1);
            shuffledArray[randomNum] = value;
        }
        return shuffledArray;
    })
}
let array = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'];
console.log(shuffleArray(array, 3));
```


function solution(number){
    let sum = 0;
    if(number === 2) return sum; //here you check pre validation...
    for(let i = 0; i<number;i++) {
        if(i < 0) { return 0;} //This logic never going to be true
        if((i%3===0|| i%5===0) || (i%3==0 && i%5===0)) { sum +=i};
    }
    return sum;
}