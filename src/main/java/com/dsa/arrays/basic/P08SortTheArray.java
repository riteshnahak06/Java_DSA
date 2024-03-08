package com.dsa.arrays.basic;

import java.util.Arrays;

public class P08SortTheArray {
    public static void main(String[] args) {
        int [] arr={3,32,33,21,11,2,66,22};
        sortAsc(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortAsc(int[] arr) {
        int n=arr.length-1;
        for (int i=0;i<n;i++){
            for (int j=0;j<n-i;j++){
                if (arr[j]>arr[j+1]){
                    swapVal(arr,j,j+1);
                }
            }
        }
    }

    private static void swapVal(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
