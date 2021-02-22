let arr = [2, 5, 4, 2,  3, 8, 9 ];

const storeVisitedValues = new Set();

//Time complexity : O(n)
//Space Complexity: O(1)
const CheckFirstRecurringCharacter1 = (arr) =>
{
    for(let i=0;i<arr.length;i++){
        for(let j=i+1; j<arr.length;j++){
            if(arr[i] === arr[j]){
                return arr[i];
            }
        }
    }
    return undefined;
}

//Time complexity : O(n)
//Space Complexity: O(n)
const CheckFirstRecurringCharacter = (arr) =>
{
    for (let i of arr) {
        if (storeVisitedValues.has(i)) return i;
        storeVisitedValues.add(i);
    }
    return undefined;
}

console.log(CheckFirstRecurringCharacter(arr));

