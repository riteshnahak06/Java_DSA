package com.dsa.basicAlgoirthm;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        System.out.println(sumOfNumber(55));
        System.out.println(sumOfNumber_v2(55));
        System.out.println(sumOfNumber_v3(55));
    }
    private static int sumOfNumber(int num){
        int sum=0;
        for (int i=1;i<=num;i++){
            sum+=i;
        }
        return sum;
    }
    private static int sumOfNumber_v2(int n){
        if (n==0) return 1;
        else return n+sumOfNumber_v2(n-1);
    }
    private static int sumOfNumber_v3(int n){
        return n*((n+1)/2);
    }
}
