package com.dsa.arrays.medium;

import java.util.Arrays;

public class P03InsertElementIntoArray {
    public static void main(String[] args) {
        int[] arr={23,45,321,44};
        System.out.println(Arrays.toString(insertAtLast(arr,60)));
        int[] arr2={23,45,321,44};
        System.out.println(Arrays.toString(insertAtFast(arr2,40)));
    }
    static int [] insertAtLast(int [] arr,int element){
        int i,result[]=new int[arr.length+1];
        for (i=0;i< arr.length;i++){
            result[i]=arr[i];
        }
        result[i]=element;
        return result;
    }
    static int [] insertAtFast(int [] arr,int element){
        int i,result[]=new int[arr.length+1];
        for (i=0;i< arr.length;i++){
            result[i+1]=arr[i];
        }
        result[0]=element;
        return result;
    }

}
