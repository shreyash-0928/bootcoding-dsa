package com.bootcoding.dsa.bitManipulation;

public class AND {
    public static void main(String[] args) {
        int n = 76;
        System.out.println(isOdd(n));
    }
    //Even or Odd
    private static boolean isOdd(int n){
        return (n & 1) == 1;
    }
}
