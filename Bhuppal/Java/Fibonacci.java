/*
*** Fibonacci ***
What is Fibonacci?
The numbers are mathematical occurrences in which numbers follow
a specific sequence of integers.
For Example: The Fibonacci numbers are in the following sequence
0   1   1   2   3   5   8   13   21   34   55   89   144
  1   2   3   4   5   6   7   8    9    10   11   12

The first two sequence are 0 and 1. After following 1 sequence, subsequent number being
the sum of the previous two.

In mathematical terms, the sequence Fn of Fibonacci numbers
Fn = Fn-1 + Fn-2

Problem: Given a number n, print n-th Fibonacci Number
Hint:
Input : n = 5 then the result is 8
Input : n = 11 then the result is 89
 */

//Fibonacci
class Fibonacci {

    //Time complexity is O(n!)
    //Space complexity is O(n) puts in call stack multiple copy's of function
    static int fibonacci_Solution1(int num) {
        if(num <= 1) return num;

        return fibonacci(num-1) + fibonacci(num-2);
    }

    //Time complexity is O(n)
    //Space complexity is O(


    public static void main(String args[]) {
        int num = 15;
        System.out.println(fibonacci_Solution1(num));
    }
}
//Time complexity is O(n!)
//Space complexity is O(n) puts in call stack multiple copy's of function


