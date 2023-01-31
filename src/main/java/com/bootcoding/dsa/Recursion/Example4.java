package com.bootcoding.dsa.Recursion;

public class Example4 {
    public static void printNumb(int n){
        if(n == 6) {
            return;
        }
        System.out.println(n);
        printNumb(n+1);
    }

    public static void main(String[] args) {
        int n = 1;
        printNumb(n);
    }
}
