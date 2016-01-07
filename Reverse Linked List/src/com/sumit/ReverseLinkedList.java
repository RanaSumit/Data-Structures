package com.sumit;



public class ReverseLinkedList {
    MyLinkedList head;
    public static void main (String arg[]) {
        ReverseLinkedList myList = new ReverseLinkedList();
        for(int i = 1; i < 10; i++) {
            myList.createLinkedList(new Integer(i).toString());
        }
        //Original LinkedList
        System.out.println("Original: ");
        myList.display();

        System.out.println("Reverse: ");
        myList.printReverseLinkedList(myList.head);
    }
    void createLinkedList(String data) {
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

    void printReverseLinkedList(MyLinkedList node) {
        if(node != null) {
            printReverseLinkedList(node.getNext());
            System.out.print(" " + node.getData());
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
        System.out.println(list.getData()+"\n");
    }
}
class MyLinkedList {
    private String data;
    private MyLinkedList next;
    MyLinkedList(String data, MyLinkedList next) {
        this.data = data;
        this.next = next;
    }
    public String getData() {
        return data;
    }
    public MyLinkedList getNext () {
        return next;
    }
    public void setData(String data) {
        this.data = data;
    }
    public void setNext (MyLinkedList next) {
        this.next = next;
    }
}