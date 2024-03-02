package com.dsa.arrays.basic;

public class P03SumOfPositiveElement {
    public static void main(String[] args) {
        int [] arr={1,6,-1,-4,5,-3};
        System.out.println(sumOfPositive(arr));
    }
    static int sumOfPositive(int [] arr){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>0){
                sum+=arr[i];
            }
        }
        return sum;
    }
}
