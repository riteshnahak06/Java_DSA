package com.dsa.searching.binary;

import java.util.Arrays;
// Check binary search in first half
public class P02HalfBinarySearch {
    public static void main(String[] args) {
        int [] arr={34,223,42,13,53,21,45,6};
        System.out.println(searchInFirstHalf(arr,53));
    }
    static int searchInFirstHalf(int[] arr, int element){
        Arrays.sort(arr);
        int start= 0;
        int end=(arr.length)/2;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]<element){
                start=mid+1;
            } else if (arr[mid]>element) {
                end=mid-1;
            }else return mid;
        }
        return -1;
    }
}
