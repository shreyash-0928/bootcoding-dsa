package com.bootcoding.dsa.Array;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {

        int[] originalArr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr1 = new int[originalArr.length];

        for (int i = 0; i < originalArr.length; i++) {
            arr1[i] = originalArr[i];

        }
        System.out.println("New array : " + Arrays.toString(arr1));


    }
}


