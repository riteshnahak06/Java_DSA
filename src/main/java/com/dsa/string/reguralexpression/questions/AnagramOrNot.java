package com.dsa.string.reguralexpression.questions;

import java.util.Arrays;

// if a string contain same number of character with same frequency.
public class AnagramOrNot {
    public static void main(String[] args) {
        String s1="race";
        String s2="care";
        String s3="cary";
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        char[] charArray3 = s3.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        Arrays.sort(charArray3);
        System.out.println(Arrays.equals(charArray1,charArray2));
        System.out.println(Arrays.equals(charArray1,charArray3));
    }
}
