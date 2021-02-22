//Find a given element in a collection.

const findSingleElement = (arr, num) => {
    for(let i = 0; i<arr.length; i++) {
        if(arr[i]===num) return true;
    }
    return false;
}

const arr = [23, 32, 45, 32, 31];
console.log(findSingleElement(arr, 45));