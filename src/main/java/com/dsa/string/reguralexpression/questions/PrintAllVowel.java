package com.dsa.string.reguralexpression.questions;

import java.util.Scanner;

public class PrintAllVowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                System.out.println(ch);
            }
        }
    }
}
