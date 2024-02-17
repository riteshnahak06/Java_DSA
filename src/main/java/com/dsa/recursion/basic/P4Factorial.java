package com.dsa.recursion.basic;

public class P4Factorial {
    public static void main(String[] args) {
        System.out.println(facto(4));
    }

      static int facto(int n) {
        if (n==0) return 1;
        return n*facto(n-1);
    }
}
