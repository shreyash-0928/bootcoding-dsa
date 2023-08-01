package com.bootcoding.dsa.Array;

public class Transpose {
    public static void main(String[] args) {
        int[][] matrix = new int[2][2];
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < 2; i++) {
                matrix[j][i] = j+i;
                System.out.print(matrix[j][i]);
            }
            System.out.println();
        }
    }
}
