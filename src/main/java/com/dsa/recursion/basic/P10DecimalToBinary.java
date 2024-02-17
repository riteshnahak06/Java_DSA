package com.dsa.recursion.basic;

public class P10DecimalToBinary {
    public static void main(String[] args) {
        System.out.println(convert(8));

    }
    static int convert(int n){
        if (n==0) return 0;
        return (n%2+10*convert(n/2));
    }
}
