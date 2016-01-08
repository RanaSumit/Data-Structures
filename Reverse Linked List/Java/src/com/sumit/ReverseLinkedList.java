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

        System.out.println("Using Recursive Reverse: ");
        myList.recursiveReverse(myList.head);

        System.out.println("\nUsing Iterative Reverse: ");
        myList.iterativeReverse(myList.head);


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

    void recursiveReverse(MyLinkedList node) {
        if(node != null) {
            recursiveReverse(node.getNext());
            System.out.print(" " + node.getData());
        }
    }

    void iterativeReverse(MyLinkedList node){

        MyLinkedList prevNode, currNode, nextNode;

            prevNode = null;
            currNode = node;
        //System.out.print("Current Node: " + currNode.getData()+"\n");
            while(currNode != null)

            {
                nextNode = currNode.getNext();
                currNode.setNext(prevNode);
                prevNode = currNode;
                currNode = nextNode;

            }
        while(prevNode != null) {
            System.out.print(" " + prevNode.getData());
            prevNode = prevNode.getNext();
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