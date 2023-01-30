package com.bootcoding.dsa.search;

public class BinarySearch {
    public static void main(String[] args) {
        int a[] = {2,3,6,5,9,7};
        int x = 6;
        int index = binarysearch(a, x, 0, a.length-1);
        System.out.println(x + " is found at index " + index);
    }
    private static int binarysearch(int a[], int x, int left, int right){

        int mid = (left + right)/2;

        if(x==a[mid]){
            return mid;
        }

        if(left >= right){
            return -1;
        }

        if (x > a[mid]){
            return binarysearch(a, x, mid+1, right);
        }else{
            return binarysearch(a, x, left, mid-1);
        }
    }
}
