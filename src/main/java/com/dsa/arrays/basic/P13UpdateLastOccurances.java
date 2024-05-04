package com.dsa.arrays.basic;

import java.util.Arrays;

public class P13UpdateLastOccurances {
    public static void main(String[] args) {
        int [] arr={2,33,21,2,45,3,1,44,2,45,32};
        updateLast(arr,2,69);
        System.out.println(Arrays.toString(arr));
    }

    static void updateLast(int[] arr,int oldVal,int newVal){
        for (int i=arr.length-1;i>=0;i--){
            if (arr[i]==oldVal){
                arr[i]=newVal;
                return;
            }
        }
    }
}
