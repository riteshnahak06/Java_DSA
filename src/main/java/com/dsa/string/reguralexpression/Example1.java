package com.dsa.string.reguralexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("[0-9]");
        Matcher m= p.matcher("a1b2c34d"); // target string
        int c=0;
        while (m.find()){
            System.out.println(m.start()+"---" +m.end() + "----"+m.group());
            c++;
        }
        System.out.println("Count "+c);

    }
}
