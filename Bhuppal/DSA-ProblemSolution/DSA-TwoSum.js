/*
Problem:
Given an array of integers nums and an integer target, return true or false such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
Arrays are not sorted

https://www.youtube.com/watch?v=XKu_SEDAykw
```Javascript
How to: Work at Google — Example Coding/Engineering Interview

[1, 2, 3, 9] & Target sum = 8  No   In this case, not satisfied
[1, 2, 4, 4] & Target Sum = 8  Yes  In this case, satisfied

 */
//
```javascript

//Solution #1 Naive solution - using O(N^2)
const HasPairWithSumUsingNaiveSolutionONSqaure = (data, sum) => {
    for (let i = 0; i <= data.length; i++) {
        for (let j = 0; j <= data.length; j++) {
            if ((i!=j) && data[i] + data[j] === sum)
                return true;
        }
    }
    return false;
}

//Solution #2 using Binary search Two pointer solution
//Note
const HasPairWithSumBinarySearch = (data, sum) => {
    let low = 0;
    let high = data.length -1;
    while(low<high) {
        let currentValue = data[low] + data[high];
        if (currentValue === sum) return true;
        currentValue > sum ? high-- : low++;
    }
    return false;
}


//Solution #3 using O(N):
const HasPairWithSum = (data, sum) => {
    let comp = new Set(); //Complements
    for(let value of data) {
        if(comp.has(value)) return true;
        comp.add(sum-value);
    }
    return false;
}

//Quick unit test
let arr1 = [1, 2, 3, 9]; //Negative test
let arr2 = [1, 2, 4, 4]; //Positive test
let arr3 = [45, 8, 3, 84, 42, 33, 4, 21, 5, 19, 290]; //unsorted array elements & Positive test
let arr4 = [29, 23, 345, 231, 23, 28, 23, 1, 238, 4, 512, 5, 839, 192]; //Unsorted array elements & Negative test

//console.log(HasPairWithSumUsingNaiveSolutionONSqaure(arr2,8));
//console.log(HasPairWithSumBinarySearch(arr2,8));
console.log('Result:', HasPairWithSum(arr4, 8));
```



