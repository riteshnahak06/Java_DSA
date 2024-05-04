package com.dsa.recursion.basic;

public class P15RemoveCharacter {
    public static void main(String[] args) {

    }
    static String remove(String s,int index){
        if (index<0) return "";
        else if (s.charAt(index)=='x') {
            return remove(s,index-1);
        }else return remove(s,index-1)+s.charAt(index);
    }
}
