/*
Check the number is even or odd
If number is  divisible by 2. So we use mod (modulus - %) operator
if the remainder is "0", then its even number otherwise Odd number
Advanced Note: you could also replace n % 2 with the bit AND operator: n & 1. If the first bit (LSB) is 1 then is odd otherwise is even.
*/

const IsEvenOrOdd = (number) => {
  return  (number & 1 ===1) ?
                `${number} is even number.`
                 : `${number} is odd number.`;
}

console.log(IsEvenOrOdd(14));

console.log(IsEvenOrOdd(9));
