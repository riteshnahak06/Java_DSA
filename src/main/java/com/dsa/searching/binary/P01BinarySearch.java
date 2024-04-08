package com.dsa.searching.binary;

import java.util.Arrays;

public class P01BinarySearch {
    public static void main(String[] args) {
        int [] arr={9,11,32,44,99};
        System.out.println(binarySearch(arr,9));
    }
    static int binarySearch(int [] arr, int target){
        Arrays.sort(arr);
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid= start+(end-start)/2;
            if (arr[mid]>target){
                end=mid-1;
            } else if (arr[mid]<target) {
                start=mid+1;
            }else return mid;
        }
        return -1;
    }
}
