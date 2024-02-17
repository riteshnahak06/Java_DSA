package com.dsa.recursion.basic;
//calculate power(a^B)
public class P3Power {
    public static void main(String[] args) {
        System.out.println(powerOf(2,4));
    }

    private static int powerOf(int base, int power) {
        if (power==0) return 1;
        return base*powerOf(base,power-1);
    }
}
