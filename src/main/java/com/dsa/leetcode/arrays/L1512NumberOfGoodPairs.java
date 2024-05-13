package com.dsa.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

/*
Given an array of integers nums, return the number of good pairs.
A pair (i, j) is called good if nums[i] == nums[j] and i < j.
Example 1:
Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

Example 2:
Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.
 */
public class L1512NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,1,3};
        System.out.println(numIdenticalPairsOptimized(arr));

    }
    public static int numIdenticalPairs(int[] nums) {
        int count=0;
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]==nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static int numIdenticalPairsOptimized(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                count += map.get(nums[i]); // Increment the count by the current value in the map
                map.put(nums[i], map.get(nums[i]) + 1); // Update the count of occurrences
            } else {
                map.put(nums[i], 1); // Initialize the count of occurrences for this number
            }
        }
        return count;
    }
}
