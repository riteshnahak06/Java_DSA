package com.dsa.arrays.basic;

import java.util.Arrays;

public class P07MaxAndMinInArray {
    public static void main(String[] args) {
        int [] arr={3,5,2,13,55};
        System.out.println(Arrays.toString(minMax(arr)));
    }
    static int[] minMax(int [] arr){
        return new int[]{minOfArray(arr),maxOfArray(arr)};
    }
    static int maxOfArray(int [] arr){
        int max=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static int minOfArray(int [] arr){
        int min=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
