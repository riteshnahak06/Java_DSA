package com.dsa.arrays.basic;

import java.util.Arrays;

public class P14NthMaxAndNthMinOfArray {
    public static void main(String[] args) {
        int[] arr = {10, 12, 86, 44, 21, 36};
        int[] result = maxAndMin(arr, 2);
        System.out.println(Arrays.toString(result));
    }

    static int[] maxAndMin(int[] arr, int position) {
        int min = 0, max = 0;
        Arrays.sort(arr);
        if (position > arr.length || position <= 0) {
            return new int[]{-1, -1};
        }
        // for min
        for (int i = 0; i < arr.length; i++) {
            if (i == position - 1) {
                min = arr[i];
                break; // No need to continue looping after finding the nth minimum
            }
        }

        // for max
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == arr.length - position) {
                max = arr[i];
                break; // No need to continue looping after finding the nth maximum
            }
        }

        return new int[]{max, min};
    }
}
