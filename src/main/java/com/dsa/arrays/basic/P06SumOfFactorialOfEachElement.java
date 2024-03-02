package com.dsa.arrays.basic;

public class P06SumOfFactorialOfEachElement {
    public static void main(String[] args) {
        int [] arr={2,1,3,4};
        System.out.println(sumOfFactorial(arr));
    }
    static int sumOfFactorial(int [] arr){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=factorial(arr[i]);
        }
        return sum;
    }
    static int factorial(int n){
        if (n==0) return 1;
        return n*factorial(n-1);
    }
}
