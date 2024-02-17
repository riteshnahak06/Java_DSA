package com.dsa.recursion.basic;
//find sum of digit present in the given number
public class P7SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigit(52));
    }

    static int sumOfDigit(int n){
        if (n==0) return 0;
        return n%10+sumOfDigit(n/10);
    }
}
