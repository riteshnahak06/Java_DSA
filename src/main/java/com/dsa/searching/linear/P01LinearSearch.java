package com.dsa.searching.linear;

public class P01LinearSearch {
    public static void main(String[] args) {
        int [] arr={23,45,21,11,89,9};
        System.out.println(search(arr,99));
    }
    static int search(int [] arr,int target){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
