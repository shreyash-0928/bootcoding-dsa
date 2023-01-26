package com.bootcoding.dsa.linkedlist;

public class FindElement {
    public static void main(String[] args) {
        Node firstnode = new Node(1);
        Node secondnode = new Node(2);
        Node thirdnode = new Node(3);
        Node forthnode = new Node(4);
        Node fifthnode = new Node(5);

        Node head = firstnode;
        firstnode.next = secondnode;
        secondnode.next = thirdnode;
        thirdnode.next = forthnode;
        forthnode.next = fifthnode;
        fifthnode = null;
        int n = 3;
        printFindElement(head,n);
    }

    private static void printFindElement(Node head,int n) {
        Node temp = head;
        while (temp!= null){
            if (temp.data==n){
                System.out.println("val "+ temp.data);
//              temp.next=temp.next.next;
            }
            temp=temp.next;
        }
        temp= head;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }

    }
}
