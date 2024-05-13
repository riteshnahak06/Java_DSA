package com.dsa.arrays.arrayrotation;
import java.util.Arrays;

public class P02RightRotationByKTimes {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(rightRotate(arr,2)));
    }
    static int[] rightRotate(int [] arr, int k){
        k=k%arr.length; // so rotation will be restricted number of iteration
        for (int i=0;i<k;i++){
            // do the rotation
            int prev=arr[arr.length-1]; // this will change
            int temp;
            for (int j=0;j< arr.length;j++){ // this condition will change
                temp=arr[j];
                arr[j]=prev;
                prev=temp;
            }
        }
        return arr;
    }
}
