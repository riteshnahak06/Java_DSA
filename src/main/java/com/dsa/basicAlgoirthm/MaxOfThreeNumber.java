package com.dsa.basicAlgoirthm;

public class MaxOfThreeNumber {
    public static void main(String[] args) {
        System.out.println(max_v1(34,65,99));
        System.out.println(max_v2(32,11,67));
    }
    private static int max_v1(int a,int b,int c){
        return (a>b && a>c)?a:(b>c?b:c);
    }
    private static int max_v2(int a,int b,int c){
        return Math.max(Math.max(a,b),c);
    }
}
