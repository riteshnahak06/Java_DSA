package com.dsa.basicAlgoirthm;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    private static int factorial(int n){
        //base condition
        if (n==0) return 1;
        return n*factorial(n-1);
    }
}
