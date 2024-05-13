package com.dsa.leetcode.arrays;

import java.util.Arrays;
import java.util.HashMap;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]

 */
public class L01TwoSum {
    public static void main(String[] args) {
        int [] arr ={3,2,4};
        System.out.println(Arrays.toString(twoSumOptimized(arr,6)));
    }
    static int [] twoSum(int [] nums,int target){
        for (int i=0;i<nums.length;i++){
           for (int j=i+1;j<nums.length;j++){
               if (nums[i]+nums[j]==target){
                   return new int[]{i,j};
               }
           }
        }
        return new int[]{-1,-1};
    }
    // optimize solution with less than o(n^2)
    static int [] twoSumOptimized(int [] nums,int target){
        HashMap<Integer, Integer> complements = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            int complement=target-nums[i];

            // if compliment exists in map return indices
            if (complements.containsKey(complement)){
                return new int[]{complements.get(complement),i};
            }
            complements.put(nums[i],i);
        }
        return new int [] {-1,-1};
    }
}
