package com.dsa.arrays.basic;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int [] arr={23,344,12,45,22,11,99};
        sortByAsc(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortByAsc(int[] arr) {
        for (int i=0;i<arr.length;i++){
            for (int j=0;j< arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    swapValues(arr,j,j+1);
                }
            }
        }
    }

    private static void swapValues(int[] arr, int j, int i) {
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }


}
