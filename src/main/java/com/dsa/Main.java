package com.dsa;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] arr={3,42,13,43,21,11,3};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void bubbleSort(int[] arr) {
        for (int i=0;i< arr.length-1;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j+1]<arr[j]){
                    swap(arr,j,j+1);
                }
            }
        }
    }

    private static void selectionSort(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            int min=arr[i];
            int indexAtMin=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]<min){
                    min=arr[j];
                    indexAtMin=j;
                }
            }
            swap(arr,i,indexAtMin);
        }
    }
    private static void swap(int[] arr, int a, int b) {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}