package com.dsa.arrays.basic;

public class P04SumDivisibleByTwoOrThree {
    public static void main(String[] args) {
        int [] arr={2,3,6,12,4,55};
        System.out.println(sumOfElement(arr));
    }
    static int sumOfElement(int [] arr){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]%2==0||arr[i]%3==0){
                sum+=arr[i];
            }
        }
        return sum;
    }
}
