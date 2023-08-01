package com.bootcoding.dsa.Array;

import java.util.Arrays;

public class TwoDarray {
    public static void main(String[] args) {
        int[][] matrix = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix[i][j] = i + j;
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
