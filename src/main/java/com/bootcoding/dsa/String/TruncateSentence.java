package com.bootcoding.dsa.String;

public class TruncateSentence {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.substring(0, k + 1));
        }
    }
}
