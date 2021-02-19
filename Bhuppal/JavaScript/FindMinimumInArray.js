```JavaScript
//Find an minimum Value in Numberic array
function getMinimum(arr) {
    if(arr.length === 0) return arr;
    let minValue = arr[0];
    arr.forEach(item => {
        if(item < minValue) {
            minValue = item;
        }
    })
    return minValue;
}

const getMaximum = (arr) => {
    if(arr.length === 0) return arr;
    let maxValue = arr[0];
    arr.forEach(item => {
        if(item > maxValue) {
            maxValue = item;
        }
    })
    return maxValue;
}

const getMinMax = (arr) => {
    let result = {min:null, max:null};
    if(arr.length === 0) return console.log('Array is empty');
    result['min'] = arr[0];
    result['max'] = arr[0];
    arr.forEach(item => {
        if(item < result['min']) {
            result['min'] = item;
        }
        else if(item > result['max']) {
            result['max'] = item;
        }
    })
    return result;
}


const myArray = [389, 23, 81, 29, 24, 212, 2749];
console.log(getMinimum(myArray));
console.log(getMaximum(myArray));
console.log(getMinMax(myArray));

const car = {type:'Toyota'}
let IsAvailable = 'type' in car;
console.log(IsAvailable);
```