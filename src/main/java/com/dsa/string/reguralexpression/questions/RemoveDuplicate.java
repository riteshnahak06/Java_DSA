package com.dsa.string.reguralexpression.questions;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String s="abcaba";
        String ss="";
        for (int i=0;i<s.length();i++){
            if (ss.indexOf(s.charAt(i))<0){ //i.e character of s not there in ss
                ss=ss+s.charAt(i);
            }
        }
        System.out.println(ss);

    }
}
