package com.dsa.arrays.basic;

public class P01SumOfElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(sum(arr));
    }
    static int sum(int [] arr){
        int i=arr.length-1;
        int sum=0;
        while (i>=0){
            sum+=arr[i];
            i--;
        }
        return sum;
    }
}
