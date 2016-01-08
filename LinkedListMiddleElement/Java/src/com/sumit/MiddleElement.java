package com.sumit;

public class MiddleElement {
    MyLinkedList head;
    public static void main(String[] args) {
        MiddleElement myList = new MiddleElement();
        for(int i = 1; i<10; i++)
        {
            myList.createLinkedList(new Integer(i).toString());
        }
        System.out.println("Linked List: ");
        myList.display();

        myList.findMiddle(myList.head);

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
    void findMiddle(MyLinkedList node)
    {
        MyLinkedList fastPtr = node;
        MyLinkedList slowPtr = node;
        if(node!=null)
        {
            while(fastPtr != null && fastPtr.getNext() != null)
            {
                fastPtr = fastPtr.getNext().getNext();
                slowPtr = slowPtr.getNext();
            }
            System.out.println("Middle Element is: " + slowPtr.getData());
        }
    }








}


class MyLinkedList
{
    private String data;
    private MyLinkedList next;
    MyLinkedList(String data, MyLinkedList next)
    {
        this.data = data;
        this.next = next;
    }
    public String getData()
    {
        return data;
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
