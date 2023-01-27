package com.bootcoding.dsa.sorting;

public class sortingExample {

    public static void main(String[] args) {
        int a[] = {2, 100, 20, 50, 90};
        
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {

                int temp = 0;
                if (a[j] < a[i]) {

                    // swap
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }
            System.out.println(a[i]);

        }


    }

}