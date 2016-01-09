package com.sumit;

import java.util.Scanner;

public class NthElement {
    static MyLinkedList head;
    static int counter = 0;
    public static void main(String[] args) {
        NthElement myList = new NthElement();

        for(int i = 1; i<10; i++)
        {
            myList.createLinkedList(new Integer(i).toString());

        }
        System.out.println("Linked List: ");
        myList.display();
        System.out.println("Enter Nth element to display from last node: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("Returning value using iteration");
        myList.iterationMethod(number);
        System.out.println("Returning value using recursion");
        myList.recursionMethod(head,number);


    }
    void createLinkedList(String data)
    {
        if(head == null || head.getData() == null || head.getData().isEmpty()) {
            head = new MyLinkedList(data, null);
        }
        else {
            MyLinkedList temp = head;
            while(temp.getNext() != null) {
                temp = temp.getNext();
            }
            MyLinkedList node = new MyLinkedList(data, null);
            temp.setNext(node);
        }
    }
    void display()
    {
        MyLinkedList list = head;
        System.out.print(head.getData()+" ");
        list = head.getNext();
        while(list.getNext() != null)
        {
            System.out.print(list.getData()+" ");
            list = list.getNext();
        }
        System.out.println(list.getData());
    }
    void iterationMethod (int n)
    {
        if( n < 1 || head.getData() == null)
        {
            System.out.println("No element found");
        }

        MyLinkedList ptr1 = head;
        MyLinkedList ptr2 = head;
        for(int i =0; i < n - 1 ; i++)
        {
            if(ptr2 == null)
            {
                System.out.println("List is less than number entered, Enter a valid(Smaller) number");

            }
            else
            {
                ptr2 = ptr2.getNext();
            }
        }
            while(ptr2.getNext() != null)
            {
                ptr1 = ptr1.getNext();
                ptr2 = ptr2.getNext();
            }
            System.out.println(n + " Element from last node is: " + ptr1.getData());

    }
    void recursionMethod(MyLinkedList list,int n)
    {


        if(list != null)
         {



             recursionMethod(list.getNext(),n);
             counter++;
             if(n==counter)
             {
                 System.out.println(n+ " Element from last node is: "+ list.getData());
             }
         }

    }
}
class MyLinkedList
{
    private String data;
    private MyLinkedList next;
    MyLinkedList(String data, MyLinkedList link)
    {
        this.data = data;
        this.next = link;
    }
    public String getData()
    {
        return  data;
    }
    public MyLinkedList getNext()
    {
        return next;
    }
    public void setData(String data)
    {
        this.data = data;
    }
    public void setNext(MyLinkedList next)
    {
        this.next = next;
    }
}
