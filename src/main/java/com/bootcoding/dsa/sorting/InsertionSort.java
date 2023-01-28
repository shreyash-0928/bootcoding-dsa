package com.bootcoding.dsa.sorting;

public class InsertionSort {
    public static void insertionSort(int a[]){
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {

                if (a[j+1] < a[i]) {

                    //Swap
                    temp = a[j+1];
                    a[j + 1] = a[i];
                    a[i] = temp;
                }

            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {50,17,19,13,5};
        insertionSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}

