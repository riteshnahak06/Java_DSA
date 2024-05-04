package com.dsa.arrays.basic;


public class P05SumOfPrime {
    public static void main(String[] args) {
        int[] arr={2,3,5,6,32};
        System.out.println(sumOfPrime(arr));
    }
   static int sumOfPrime(int[] arr){
        int sum=0;
        for (int num:arr){
            if (isPrimeNumber(num,num/2)){
                sum+=num;
            }
        }
        return sum;
   }

    private static boolean isPrimeNumber(int num, int i) {
        if (i==1) return true;
        else if (num%i==0) return false;
        else return isPrimeNumber(num,--i);
    }
}
