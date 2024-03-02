package com.dsa.arrays.basic;


public class P05SumOfPrime {
    public static void main(String[] args) {
        int[] arr={2,3,5,6,32};
        System.out.println(sumOfPrime(arr));
    }
    static int sumOfPrime(int [] arr){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            if (isPrimeNumber(arr[i],arr[i]/2)){
                sum+=arr[i];
            }
        }
        return sum;
    }
    private static boolean isPrimeNumber(int n,int i) {
        if (i==1) return true; // condition for 2 and 3
        else if (n%i==0) {
            return false;
        }
        else return isPrimeNumber(n,--i);
    }
}
