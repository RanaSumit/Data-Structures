package com.sumit;

import java.util.Scanner;

public class LinkedList {


    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public void removeDuplicates()
    {
        Node ptr1 = null, ptr2 = null, dup = null;
        ptr1 = head;

        /* Pick elements one by one */
        while (ptr1 != null && ptr1.next != null) {
            ptr2 = ptr1;

            /* Compare the picked element with rest of the elements */
            while (ptr2.next != null) {

                /* If duplicate then delete it */
                if (ptr1.data == ptr2.next.data) {

                    /* sequence of steps is important here */
                    dup = ptr2.next;
                    ptr2.next = ptr2.next.next;
                    System.gc();
                } else /* This is tricky */ {
                    ptr2 = ptr2.next;
                }
            }
            ptr1 = ptr1.next;
        }


    }
    public void push(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void printList()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
	    System.out.println("Enter number of elements: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Enter " + n + " integer elements in Linked List: ");
        LinkedList list = new LinkedList();
        for(int i = 0; i < n; i++)
        {
            list.push(scan.nextInt());
        }

        list.removeDuplicates();

        System.out.println("Array after removal of duplicates: ");
        list.printList();

    }
}

