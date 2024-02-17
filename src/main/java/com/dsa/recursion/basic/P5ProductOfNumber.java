package com.dsa.recursion.basic;
//product of two number
//this is not suitable for negative number
public class P5ProductOfNumber {
    public static void main(String[] args) {
        System.out.println(product(44,99));
    }

    private static int product(int a, int b) {
        if (b<1) return 0;
        return a+product(a,b-1);
    }
}
