package com.dsa.arrays.basic;

public class P02SumOfEvenElement {
    public static void main(String[] args) {
        int [] arr={2,43,21,3,45,22};
        System.out.println(sumOfEven(arr));
    }
    static int sumOfEven(int[] arr){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]%2==0){
                sum+=arr[i];
            }
        }
        return sum;
    }
}
