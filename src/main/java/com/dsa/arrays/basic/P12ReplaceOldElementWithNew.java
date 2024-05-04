package com.dsa.arrays.basic;

import java.util.Arrays;

public class P12ReplaceOldElementWithNew {
    public static void main(String[] args) {
        int [] arr={2,4,3,4,345};
        replace2ndOccuranceWithNew(arr,4,99);
        System.out.println(Arrays.toString(arr));

        replaceWithNew(arr,4,99);
        System.out.println(Arrays.toString(arr));
    }
    static void replaceWithNew(int[] arr,int oldVal,int newVal){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==oldVal){
                arr[i]=newVal;
                return;
            }
        }
    }
    static void replace2ndOccuranceWithNew(int [] arr,int oldVal,int newVal){
        int count=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==oldVal){
                count++;
                if (count==2){
                    arr[i]=newVal;
                    return;
                }
            }
        }
    }
}
