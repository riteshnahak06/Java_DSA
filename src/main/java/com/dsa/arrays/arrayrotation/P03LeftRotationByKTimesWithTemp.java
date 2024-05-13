package com.dsa.arrays.arrayrotation;
import java.util.Arrays;

public class P03LeftRotationByKTimesWithTemp {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(leftRotateWithTemp(arr,1)));
    }
    static int[] leftRotateWithTemp(int [] arr,int k){
        k=k%arr.length; // so rotation will be restricted number of iteration
        for (int i=0;i<k;i++){
            int temp=arr[0];
            for (int j=0;j< arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=temp;
        }
        return arr;
    }
}
