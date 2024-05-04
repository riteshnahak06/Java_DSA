package com.dsa.arrays.basic;

import java.util.Arrays;

public class P10MinimumElementOfSortArray {
    public static void main(String[] args) {
        int[] arr = {3, 32, 33, 21, 11, 2, 66, 22};
        System.out.println(minimumElement(arr,5));
    }

    private static int minimumElement(int[] arr, int position) {
        Arrays.sort(arr);
        return arr[position];
    }
}
