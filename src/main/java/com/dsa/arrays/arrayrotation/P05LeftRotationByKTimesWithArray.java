package com.dsa.arrays.arrayrotation;
import java.util.Arrays;

public class P05LeftRotationByKTimesWithArray {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(leftRotateWithTempArray(arr,2)));
    }
    static int[] leftRotateWithTempArray(int [] arr, int k){
        k=k% arr.length;
        int temp[]=new int[k];
        for (int i=0;i<k;i++){
            temp[i]=arr[i];
        }
        for (int i=k;i< arr.length;i++){
            arr[i-k]=arr[i];
        }
        for (int i=0;i<k;i++){
            arr[i+arr.length-k]=temp[i];
        }
        return arr;
    }
}
