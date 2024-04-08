package com.dsa.recursion.basic;

public class P13GcdOrHcf {
    public static void main(String[] args) {
        int res = gcd(2, 3);
        System.out.println(res);
    }
    static int gcd(int a,int b){
        while (a!=b){
            if (a>b) return gcd(a-b,b);
            else return gcd(a,b-a);
        }
        return a;
    }
}
