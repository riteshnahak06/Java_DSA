package com.dsa.sorting;

import java.util.Arrays;

// find minimum element then swap in first iteration
public class P02SelectionSortAsc {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 46, 73, 23, 12, 45};
        System.out.println("Before Sorting " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("After  Sorting " + Arrays.toString(arr));
    }
    static void selectionSort(int [] arr){
        for (int i=0;i<arr.length-1;i++){
            int minIndex = getMinIndex(arr, i);
            // after full iteration of j we will get min value then swap
            swapVal(arr,minIndex,i);
        }
    }

    private static int getMinIndex(int[] arr, int i) {
        int minIndex= i;
        for (int j = i +1; j< arr.length; j++){ //as minimum element came as start so no need to check
            if (arr[minIndex]> arr[j]){ // change condition for desc
                minIndex=j; // min value for one iteration
            }
        }
        return minIndex;
    }

    private static void swapVal(int [] arr,int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
