package com.dsa.basicAlgoirthm;

public class SwappingTwoNumber {
    public static void main(String[] args) {
        swap_v1(4,8);
        swap_v2(33,-4);
        swap_v3(-6,-4);
        swap_v4(43,69);

    }
    private static void swap_v1(int a,int b){
        System.out.println("Before Swapping A : "+a+" and B : "+b);
        int temp=a;
         a=b;
         b=temp;
        System.out.println("After Swapping A : "+a+" and B : "+b);
    }
    private static void swap_v2(int a,int b){
        System.out.println("Before Swapping A : "+a+" and B : "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping A : "+a+" and B : "+b);
    }
    private static void swap_v3(int a,int b){
        System.out.println("Before Swapping A : "+a+" and B : "+b);
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("After Swapping A : "+a+" and B : "+b);
    }

    //Note: Dec into Bin and Bin into Dec
    private static void swap_v4(int a,int b){
        System.out.println("Before Swapping A : "+a+" and B : "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After Swapping A : "+a+" and B : "+b);
    }

}
