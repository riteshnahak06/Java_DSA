package com.dsa.sorting;

import java.util.Arrays;

public class P01BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 46, 73, 23, 12, 45};
        System.out.println("Before Sorting " + Arrays.toString(arr));
        bubbleSortAsc(arr);
        System.out.println("After  Sorting " + Arrays.toString(arr));
    }

    private static void bubbleSortAsc(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j=0;j<arr.length-i-1;j++){ //-i because max value is pushed to last of thr array in each iteration so no need to check these
                if (arr[j]<arr[j+1]){ // change this condition for ascending
                    swapVal(arr,j,j+1);
                }
            }
        }
    }

    private static void swapVal(int [] arr,int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
