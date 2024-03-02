package com.dsa.string.reguralexpression;

import java.util.Scanner;

//validate gmail id
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(s.matches("[a-z][a-z0-9_][a-z0-9_]+@gmail[.]com"));
    }
}
