package com.bootcoding.dsa.String;

public class SkipACharacter {
    public static void main(String[] args) {
        String str1 = "ababbbaacde";
        String str2 = str1.replace("a","");
        System.out.println(str2);
    }
}
