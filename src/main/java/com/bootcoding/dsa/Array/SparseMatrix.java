package com.bootcoding.dsa.Array;

import java.util.Arrays;

public class SparseMatrix {
    public static void main(String[] args) {
        int count1 = 0;
        int count2 = 0;

        int[][] matrix = {
                {0,0,1,0},
                {0,1,1,0},
                {1,0,0,1},
                {0,0,0,0}
        };
        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {
                if(matrix[i][j] == 0){
                count1++;
            }else{
                    count2++;
                }
            }
        }
        System.out.println(count1);
        if(count1>count2) {
            System.out.println("It is a Sparse Matrix");
        }

    }
}
