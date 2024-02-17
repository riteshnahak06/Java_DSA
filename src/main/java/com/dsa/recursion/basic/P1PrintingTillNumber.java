package com.dsa.recursion.basic;

public class P1PrintingTillNumber {
    public static void main(String[] args) {
        print(6);
    }
    private static void print(int n){

        if (n>=0){
            System.out.print(n+" "); // 6 5 4 3 2 1 0
            print(n-1);
            System.out.print(n+" "); // 0 1 2 3 4 5 6
        }
    }
}
