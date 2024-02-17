package com.dsa.recursion.basic;
//count number of digit
public class P9CountOfDigit {
    public static void main(String[] args) {
        System.out.println(countOfDigit(45));

    }
    static int count=0; // it should be declared as global else it won.t give correct ans
    static int countOfDigit(int n){
        if (n!=0){
            count++;
            countOfDigit(n/10);
        }
        return (count!=0)?count:1;
    }


}
