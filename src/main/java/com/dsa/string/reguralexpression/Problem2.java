package com.dsa.string.reguralexpression;

import java.util.Scanner;

//validate mobile number
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(s.matches("[6-9][0-9]{9}")); // 9 time is for 0-9 and 1 time is for [6-9] so 10 digit
    }
}
