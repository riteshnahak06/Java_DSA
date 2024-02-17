package com.dsa.basicAlgoirthm;

import java.util.ArrayList;

public class Fibnocci {
    public static void main(String[] args) {
        System.out.println(getFibnocci(5));
    }
    private static ArrayList<Integer> getFibnocci(int n){
        ArrayList<Integer> al = new ArrayList<>();
        int a=0;int b=1;
        al.add(a);al.add(b);
        for (int i=1;i<=n-2;i++){
            int c=a+b;
            al.add(c);
            a=b;
            b=c;
        }
        return al;
    }
}
