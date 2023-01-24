package com.bootcoding.dsa.hashtable;

import java.util.HashMap;
import java.util.Objects;

public class HashTableExample {

    public static void main(String[] args) {
        int a[] = {10, 20, 10, 30, 20, 40};
        //Find duplicate elements in an array

        // int, char, double, string, boolean
        // Integer,Character, Double, String, Boolean, Long, Short

        HashMap store = new HashMap();
        for(int i = 0; i < a.length; i++){
            if(store.containsKey(a[i])){
                int value = (int) store.get(a[i]);
                store.put(a[i], value + 1);
            }else{
                store.put(a[i], 1);
            }
        }
        for(Object key : store.keySet()){
            int k = (int) key;
            int value = (int) store.get(k); // no. of occurrences
            if(value > 1){
                System.out.println(k);
            }
        }
    }
}
