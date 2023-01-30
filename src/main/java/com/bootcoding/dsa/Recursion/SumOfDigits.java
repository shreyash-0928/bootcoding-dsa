package com.bootcoding.dsa.Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 94;
        System.out.println("Sum of digits : " + printSum(n));
    }

    public static int printSum(int n){
        if(n<10){
            return n;
        }
        return n%10 + printSum(n/10);
    }
}
