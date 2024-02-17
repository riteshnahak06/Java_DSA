package com.dsa.recursion.basic;
//prime using recursion
public class P6PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrimeNumber(5,5/2));
    }

    private static boolean isPrimeNumber(int n,int i) {
        if (n%i==0) return false;
        else if (i==1) {
             return true; // for 2 and 3
        }else return isPrimeNumber(n,--i);
    }

}
