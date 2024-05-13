package com.dsa.sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

// divide array to 2 half by recursion.sort bot half then merge them
//Time Complexity // best- o(nlogn) , worst=O(nlogn)
//space comp - 0(n) -> new array is will be created for result
public class P03MergeSort {
    public static void main(String[] args) {
        int[] arr={23,3,12,434,235,22};
        System.out.println(Arrays.toString(arr));
        int [] res=mergeSort(arr);
        System.out.println(Arrays.toString(res));
    }

    private static int[] mergeSort(int[] arr) {
        //base condition
        if (arr.length==1){
            return arr;
        }
        int mid= arr.length/2;

        int [] left=mergeSort(Arrays.copyOfRange(arr,0,mid));
        int [] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }

    private static int [] merge(int[] first, int[] second) {
        int[] mix= new int[first.length+second.length];
        //take pointer for each array
        int i=0;int j=0;
        int k=0; //pointer for mix
        while (i<first.length && j<second.length){
            if (first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }else {
                mix[k]=second[j];
                j++;
            }
            //increment mix index
            k++;
        }
        //sometime if one array complete then put the remain value in mix array as it is
        while (i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while (j<second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }
}
