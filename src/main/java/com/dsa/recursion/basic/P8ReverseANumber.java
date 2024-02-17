package com.dsa.recursion.basic;
//reverse of a number
public class P8ReverseANumber {
    public static void main(String[] args) {
        System.out.println(reverse(321,3));
    }
    static int reverse(int  n,int len){

        if (n==0) return 0;
        return ((n%10)*(int)Math.pow(10,len-1))+reverse(n/10,--len);
    }
}
