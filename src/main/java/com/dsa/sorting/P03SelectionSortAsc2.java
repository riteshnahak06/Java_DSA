package com.dsa.sorting;

import java.util.Arrays;

// find minimum element then swap in first iteration
public class P03SelectionSortAsc2 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 46, 73, 23, 12, 45};
        System.out.println("Before Sorting " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("After  Sorting " + Arrays.toString(arr));
    }
    static void selectionSort(int [] arr){
        for (int i=0;i<arr.length;i++){
            int maxIndex=getMaxIndex(arr,i);
            swapVal(arr,maxIndex,i);
        }
    }

    private static int getMaxIndex(int[] arr, int i) {
        int maxIndex=i;
        for (int j=i+1;j<arr.length;j++){
            if (arr[maxIndex]<arr[j]){
                maxIndex=j;
            }
        }
        return maxIndex;
    }

    private static void swapVal(int [] arr,int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
