package com.bootcoding.dsa.Recursion;

public class NoOfStepsToReduceANumberToZero {
    public static void main(String[] args) {
     int ans = numberOfSteps(14);
        System.out.println(ans);
    }
    public static int numberOfSteps(int num) {
        if(num==0)
            return 0;

        if(num%2 == 0)
            return 1 + numberOfSteps(num/2);

        else return 1 + numberOfSteps(num-1);
    }
}
