package com.bootcoding.dsa.Array;

import java.util.Arrays;

public class CopyInReverse {
    public static void main(String[] args) {

        int[] originalArr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int[] reverseArr = new int[originalArr.length];

        for (int i = originalArr.length - 1; i >= 0 ; i--) {
            reverseArr[i] = originalArr[i];

        }
        System.out.println(Arrays.toString(reverseArr));


//        for (int i = 0; i < originalArr.length; i++) {
//            reverseArr[i] = originalArr[originalArr.length - 1 - i];
//        }
//        System.out.println(Arrays.toString(reverseArr));
    }
}
