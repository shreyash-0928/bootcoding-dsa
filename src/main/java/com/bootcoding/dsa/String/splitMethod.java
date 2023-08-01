package com.bootcoding.dsa.String;

public class splitMethod {
    public static int mostWordsFound(String[] sentences){

        int max = 0;
        for(String s : sentences){
            String[] words = s.split(" ");
            if(words.length > max){
                max = words.length;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String[] s = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int max = mostWordsFound(s);
        System.out.println(max);
    }

}
