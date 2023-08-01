package com.bootcoding.dsa.linkedlist.SinglyLinkedList;

import java.util.LinkedList;

public class Ex1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

        System.out.println(ll);

        ll.remove(1);
        System.out.println(ll);
    }
}
