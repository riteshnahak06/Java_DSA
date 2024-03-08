package com.dsa.arrays.basic;

import java.util.Arrays;

//print 1st smallest,1st largest,2nd smallest,2nd largest,3rd smallest,3rd largest
//after sorting
public class P11SmallestAndLargestInSequence {
    public static void main(String[] args) {
        int[] arr = {3, 32, 33, 21, 11, 2, 66, 22};
        //smallestLargestSequence(arr);
        int[] sequence = smallestLargestSequence2(arr); // work fine for only even length
        System.out.println();
        System.out.println(Arrays.toString(sequence));
    }

    private static void smallestLargestSequence(int[] arr) {
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            System.out.print(arr[start] + " " + arr[end] + " ");
            start++;
            end--;
        }
    }

    private static int[] smallestLargestSequence2(int[] arr) {
        Arrays.sort(arr);
        int[] result = new int[arr.length];
        int start = 0;
        int end = arr.length - 1;
        int index = 0;
        while (start <= end) {
            result[index++] = arr[start];
            result[index++] = arr[end];
            start++;
            end--;
        }

//        if (arr.length % 2 != 0) {
//            result[index] = arr[start];  // Assign middle element
//        }

        return result;
    }
}
