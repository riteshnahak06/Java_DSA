package com.dsa.basicAlgoirthm;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(55,55/2));
        System.out.println(isPrime_v1(55));
    }
    private static boolean isPrime(int num,int divisor){
        //divisor=num/2
        if (divisor==1) return true; // this condition we have given for 2 and 3
        else if (num%divisor==0) {
            // a number divisible by this mean it will have 3 factor,i.e. 1,no itself,and this
            return false;
        }else return isPrime(num,--divisor);
    }
    private static boolean isPrime_v1(int n){
        int factors=0;
        for (int i=1;i<=n;i++){
            if (n%i==0) factors++;
        }
        return factors==2?true:false;
    }
}
