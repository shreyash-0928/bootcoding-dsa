package com.bootcoding.dsa.timeComplexity;

public class AddUp {
    public static void main(String[] args) {
        System.out.println(addUp(10));
    }
//    static int addUp(int n){
//        int sum = 0;
//        for (int i = 0; i <= n; i++) {
//            sum += i;
//        }
//        return sum;
//    }
    static int addUp(int n){
        int sum = n * (n+1)/2;
        return sum;
    }

}
