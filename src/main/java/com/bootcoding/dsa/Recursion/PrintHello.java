package com.bootcoding.dsa.Recursion;

public class PrintHello {
    public void printHello(int n){
        if(n == 0){
            return ;
        }
        System.out.println("Hello");
        printHello(n-1);
    }

    public static void main(String[] args) {
        PrintHello ph = new PrintHello();
        ph.printHello(5);
    }
}
