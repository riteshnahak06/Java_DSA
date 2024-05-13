package com.dsa.sorting;

import java.util.Arrays;
import java.util.Random;
// tab a value check with another min if there swap
//Time Complexity // best- o(n^2) , worst=O(n^2)
//space comp - 0(1)
public class P02SelectionSort {
    public static void main(String[] args) {
        Random random=new Random();
        int [] arr=new int[7];
        for (int i=0;i<arr.length;i++){
            arr[i]=random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selectionSort(int [] arr){
        for (int i=0;i<arr.length-1;i++){
            int min=arr[i];
            int indexOfMin=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]<min){
                    min=arr[j];
                    indexOfMin=j;
                }
            }
            // now swap i vale with min
            swap(arr,i,indexOfMin);
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
