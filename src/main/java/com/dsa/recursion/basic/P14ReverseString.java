package com.dsa.recursion.basic;

import org.apache.commons.lang3.StringUtils;

public class P14ReverseString {
    public static void main(String[] args) {
        String ans=rev("RItesh");
        System.out.println(ans );
    }
    static String rev(String s){
        if (StringUtils.isBlank(s)){
            return s;
        }
        return rev(s.substring(1))+s.charAt(0);
    }
}
