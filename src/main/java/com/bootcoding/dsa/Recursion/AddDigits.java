package com.bootcoding.dsa.Recursion;

public class AddDigits {
    public static void main(String[] args) {
        int num = 38;
        int a = addDigits(num);
        System.out.println(a);
    }
    public static int addDigits(int num){

        if(num<10){
            return num;
        }
        return addDigits(num/10 + num%10);
    }
}
