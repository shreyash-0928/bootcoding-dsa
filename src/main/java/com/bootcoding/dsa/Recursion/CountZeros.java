package com.bootcoding.dsa.Recursion;

public class CountZeros {
    public static void main(String[] args) {
        int ans = zeroCount(0);
        System.out.println(ans);
    }
    public static int zeroCount(int num)
    {
        if(num == 0)
            return 1;

        if(num %10 ==0)
            return 1 + zeroCount(num / 10);
        else
            return zeroCount(num/10);
    }
}
