package com.bootcoding.dsa.Recursion;

public class SumOfNNatural {
    public int sum(int n) {
        if (n == 1)
            return 1;
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        SumOfNNatural s = new SumOfNNatural();
        int x = s.sum(5);
        System.out.println(x);
    }
}
