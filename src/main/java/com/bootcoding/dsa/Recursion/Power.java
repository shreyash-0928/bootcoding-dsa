package com.bootcoding.dsa.Recursion;

public class Power {
    public static int power(int a,int b) {
        if (b == 0)
            return 1;
        return a * power(a, b - 1);
    }

    public static void main(String[] args) {
        int result = Power.power(2,3);
        System.out.println(result);
    }
}
