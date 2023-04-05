package com.bootcoding.dsa.Array;

import java.util.Arrays;

public class CopyOddElement {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] Odd = new int[num.length];


//        int oddIndex = 0;
//        for (int i = 0; i < num.length; i++) {
//            if(num[i] % 2 != 0){
//                Odd[oddIndex] = num[i];
//                oddIndex++;
//            }
//        }System.out.println(Arrays.toString(Odd));

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                Odd[i] = num[i];

            }
        }System.out.println(Arrays.toString(Odd));

    }
}

