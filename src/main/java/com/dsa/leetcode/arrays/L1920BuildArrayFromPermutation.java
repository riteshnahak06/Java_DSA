package com.dsa.leetcode.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
Input: nums = [0,2,1,5,3,4]
Output: [0,1,2,4,5,3]
Explanation: The array ans is built as follows:
ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
    = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
    = [0,1,2,4,5,3]
Example 2:
Input: nums = [5,0,1,2,3,4]
Output: [4,5,0,1,2,3]
Explanation: The array ans is built as follows:
ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
    = [nums[5], nums[0], nums[1], nums[2], nums[3], nums[4]]
    = [4,5,0,1,2,3]
Follow-up: Can you solve it without using an extra space (i.e., O(1) memory)?
 */
public class L1920BuildArrayFromPermutation {
    public static void main(String[] args) {
        int [] arr={5,0,1,2,3,4};
        System.out.println(Arrays.toString(buildArray(arr)));
        System.out.println(Arrays.toString(buildArrayV2(arr)));

    }
    static int[] buildArray(int[] nums){
        int[] result=new int[nums.length];
        for (int i=0;i<nums.length;i++){
            result[i]=nums[nums[i]];
        }
        return result;
    }
    static int[] buildArrayV2(int[] nums){
        Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if (map.containsKey(nums[i])){
                nums[i]=nums[nums[i]];
            }
            map.put(nums[i],i);

        }
        return nums;
    }
}
