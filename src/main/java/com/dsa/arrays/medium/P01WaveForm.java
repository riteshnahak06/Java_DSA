package com.dsa.arrays.medium;

import java.util.Arrays;

public class P01WaveForm {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        waveForm(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void waveForm(int[] arr){
        Arrays.sort(arr);
        for (int i=1;i<arr.length;i=i+2){
            swapValue(arr,i,i+1);
        }
    }

    private static void swapValue(int[] arr, int a, int b) {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

}
