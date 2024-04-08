package com.dsa.recursion.basic;

public class P12Lcm {
    public static void main(String[] args) {
        int res = lcm(2, 3);
        System.out.println(res);
    }
    static int common=1;
    static int lcm(int n1,int n2){
        if (common%n1==0&&common%n2==0){
            return common;
        }
        common++;
        lcm(n1,n2);
        return common;
    }
}
