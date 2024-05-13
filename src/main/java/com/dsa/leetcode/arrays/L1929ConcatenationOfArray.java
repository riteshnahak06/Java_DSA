package com.dsa.leetcode.arrays;

import java.util.Arrays;

public class L1929ConcatenationOfArray {
    public static void main(String[] args) {
        int [] arr={1,2,1};
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }
    public static int[] getConcatenation(int[] nums) {
        int length=nums.length;
        int [] result=new int[nums.length*2];
        for (int i=0;i<nums.length;i++){
                result[i]=nums[i];
                result[i+length]=nums[i];
        }
        return result;
    }
}
