package com.bootcoding.dsa.sorting;

public class BubbleSort {

    public static void bubbleSort(int a[]){
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <a.length-1; j++) {

                if(a[j] > a[j+1]){

                    //Swap
                    temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }

            }

        }
    }

    public static void main(String[] args) {
        int arr[] = {50,17,19,13,5};
        bubbleSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}

