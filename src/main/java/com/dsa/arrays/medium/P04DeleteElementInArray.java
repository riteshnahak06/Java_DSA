package com.dsa.arrays.medium;

import java.util.Arrays;

public class P04DeleteElementInArray {
    public static void main(String[] args) {
        int [] arr={2,34,22,44,22,11,2,4,2,44,2,1};
        System.out.println(Arrays.toString(deleteElementInArray(arr,2)));
        System.out.println(Arrays.toString(deleteAnElement(arr,2)));
        System.out.println(Arrays.toString(deleteAll(arr)));

    }
    static int [] deleteElementInArray(int [] arr,int location){
        int [] result=new int[arr.length-1];
        int j=0;
        for (int i=0;i<arr.length;i++){
            if (i==location){
                continue; // it won't go to next step it again start loop and break means out of method
            }
            result[j++]=arr[i];
        }
        return result;
    }
    static int [] deleteAnElement(int[] arr, int element){
        int [] result=new int[arr.length-countOfElement(arr,element)];
        int j=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==element){
                continue;
            }
            result[j++]=arr[i];
        }
        return result;
    }
    static int countOfElement(int[] arr,int element){
        int countOfElement=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==element){
                countOfElement++;
            }
        }
        return countOfElement;
    }
    static int [] deleteAll(int [] arr){
        return new int[0];
    }
}
