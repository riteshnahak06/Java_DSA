package com.dsa.arrays.medium;

public class P02EqualityOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1={2,4,6,7,8};
        int [] arr2={2,4,6,7,8};
        System.out.println(isSame(arr1,arr2));
    }
    static boolean isSame(int [] arr1,int [] arr2){
        if (arr1.length!=arr2.length){
            return false;
        }
        for (int i=0;i<arr1.length-1;i++){
            if (arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}

