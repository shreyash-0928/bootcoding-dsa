package com.bootcoding.dsa.Recursion;

public class CountTheDigits {
    public static void main(String[] args) {
        int n = 99;
        System.out.println("Number of digits : " + countDigit(n));
    }

    public static int countDigit(int n){
        {
            if (n <10)
                return 1;
            return 1 + countDigit(n / 10);

        }
    }
}
