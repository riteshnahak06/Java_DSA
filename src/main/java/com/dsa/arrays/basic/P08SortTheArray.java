package com.dsa.arrays.basic;

import java.util.Arrays;

public class P08SortTheArray {
    public static void main(String[] args) {
        int [] arr={3,32,33,21,11};
        sortAsc(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sortAsc(int [] arr){
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }

    private static void swap(int [] arr,int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
