package com.dsa.arrays.arrayrotation;
import java.util.Arrays;
public class P01LeftRotationByKTimes {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(leftRotate(arr,6)));
    }
    static int[] leftRotate(int [] arr,int k){
        k=k%arr.length; // so rotation will be restricted number of iteration
        for (int i=0;i<k;i++){
            // do the rotation
            int prev=arr[0];
            int temp;
            for (int j=arr.length-1;j>=0;j--){
                temp=arr[j];
                arr[j]=prev;
                prev=temp;
            }
        }
        return arr;
    }
}
