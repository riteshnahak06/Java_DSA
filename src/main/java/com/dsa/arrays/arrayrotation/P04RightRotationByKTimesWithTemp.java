package com.dsa.arrays.arrayrotation;
import java.util.Arrays;

public class P04RightRotationByKTimesWithTemp {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(rightRotateWithTemp(arr,2)));
    }
    static int[] rightRotateWithTemp(int [] arr,int k){
        k=k%arr.length; // so rotation will be restricted number of iteration
        for (int i=0;i<k;i++){
            int temp=arr[arr.length-1];
            for (int j=arr.length-1;j>0;j--){
                arr[j]=arr[j-1];
            }
            arr[0]=temp;
        }
        return arr;
    }
}
