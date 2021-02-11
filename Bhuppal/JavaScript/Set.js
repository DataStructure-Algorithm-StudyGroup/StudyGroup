
/*
The Set object lets you store unique values of any type, whether primitive values or object references.
https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Set
 */

let mySet = new Set();
mySet.add(1);
mySet.add(5);
mySet.add(5);
mySet.add(5);

console.log(mySet);
console.log(mySet.values());