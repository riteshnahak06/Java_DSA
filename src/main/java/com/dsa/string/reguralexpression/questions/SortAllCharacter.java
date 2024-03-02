package com.dsa.string.reguralexpression.questions;

import java.util.Arrays;

public class SortAllCharacter {
    static String string="welcome";
    public static void main(String[] args) {
        sortByAsc();
        sortByDesc();
    }

    private static void sortByAsc() {
        char[] charArray = string.toCharArray();
        Arrays.sort(charArray); //sort data in ascending
        String str=new String(charArray);
        System.out.println(str);
    }
    private static void sortByDesc() {
        char[] charArray = string.toCharArray();
        Arrays.sort(charArray); //sort data in ascending
        reverse(charArray); //reverse
        System.out.println(String.valueOf(charArray));
    }

    private static void reverse(char[] charArray) {
        int n=charArray.length;
        for(int i=0;i<n/2;i++){
            char temp=charArray[i];
            charArray[i]=charArray[n-i-1];
            charArray[n-i-1]=temp;
        }
    }
}
