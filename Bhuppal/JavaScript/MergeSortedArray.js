//Merge Sorted Array
//mergeSortedArray();
//[0, 3, 4, 4, 6, 30, 31]

function mergeSortedArray(arr1, arr2) {
    if(arr1.length === 0) {
        return arr2;
    }
    else if(arr2.length === 0) {
        return arr1;
    }
    let resultArray = [];
    let arr1Item = arr1[0];
    let arr2Item = arr2[0];
    let arr1Index = 1;
    let arr2Index = 1;

    //[0,3,4,31], [3,4,6,30]
    while( arr1Item || arr2Item) {
        if(arr2Item === undefined || arr1Item < arr2Item) {
            resultArray.push(arr1Item);
            arr1Item = arr1[arr1Index];
            arr1Index++
        } else   {
            resultArray.push(arr2Item);
            arr2Item = arr2[arr2Index];
            arr2Index++
        }
    }


return resultArray;
}


console.log(mergeSortedArray([0,3,4,31], [3,4,6,30]));
