package com.bootcoding.dsa;

    public class LinkedList {
        public static void main(String[] args) {
            Node firstnode = new Node(10);
            Node secondnode = new Node(20);
            Node thirdnode = new Node(30);
            Node forthnode = new Node(40);
            Node fifthnode = new Node(50);

            Node head = firstnode;
            firstnode.next = secondnode;
            secondnode.next = thirdnode;
            thirdnode.next = forthnode;
            forthnode.next = fifthnode;
            fifthnode = null;
            head=insertAtFirstNode(head);

            InsertLastNode(head);

            printLinkedList(head);

        }

        private static void InsertLastNode(Node head) {
            Node newNode = new Node(69);
            Node temp = head;
            while (temp.next != null){
                temp = temp.next ;

            }
            temp.next = newNode;
            newNode = null;

        }

        private static Node insertAtFirstNode(Node head) {
            Node newNode = new Node(60);
            newNode.next = head;
            head = newNode;
            return head;

        }


        public static void printLinkedList(Node head){
            Node temp = head;
            while (temp != null){
                System.out.print("-> " + temp.data);
                temp = temp.next;
            }
        }
    }

//temp.data = temp.next.data;
//temp.next = temp.next.next;



