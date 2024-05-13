package com.dsa.arrays.medium;

import java.util.Arrays;

public class P05UpdateElementInArray {
    public static void main(String[] args) {
        int [] arr={2,42,14,24,13,3};
        updateElement(arr,1,22);
        System.out.println(Arrays.toString(arr));
    }
    static void updateElement(int [] arr,int index,int newVal){
        for (int i=0;i<arr.length;i++){
            if (i==index){
                arr[index]=newVal;
            }
        }
    }

}
