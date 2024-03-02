package com.dsa.string.reguralexpression;

import java.util.Scanner;

// Validate ATM pin
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(s.matches("[0-9]{4}"));
    }
}
