package com.bootcoding.dsa.Array;

public class MaxSubArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        // Print all subarrays of the given array
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    // Print the element at index k
                    arr[k] += arr[k];
                    System.out.println(arr[k]);
                }
                System.out.println();
            }

        }

    }
}
