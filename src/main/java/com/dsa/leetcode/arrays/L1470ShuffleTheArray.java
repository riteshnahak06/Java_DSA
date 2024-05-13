package com.dsa.leetcode.arrays;

import java.util.Arrays;

/*
Example 1:

Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7]
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
Example 2:
Input: nums = [1,2,3,4,4,3,2,1], n = 4
Output: [1,4,2,3,3,2,4,1]

 */
public class L1470ShuffleTheArray {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,4,3,2,1};
        System.out.println(Arrays.toString(shuffle(arr,4)));

    }
    static int[] shuffle(int[] nums, int n){
        int [] result=new int[nums.length];
        for (int i=0;i<n;i++){
            result[i]=nums[i];
            result[i+1]=nums[n+i];
        }
        return result;
    }

    private static void swapValu(int [] nums,int a, int b) {
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }

}
