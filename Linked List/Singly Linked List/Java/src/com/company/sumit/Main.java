package com.company.sumit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
	    Scanner scan = new Scanner(System.in);
        //Create object of class LinkedList
        LinkedList list = new LinkedList();
        System.out.println("Singly Linked List Test\n");
        char ch;
        //Perform list operations
        do {
            System.out.println("\nSingly Linked List Operations\n");
            System.out.println("1. Insert at beginning");
            System.out.println("2. Insert at end");
            System.out.println("3. Insert at position");
            System.out.println("4. Delete at position");
            System.out.println("5. Check empty");
            System.out.println("6. Get size");
            int choice = scan.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Enter integer element to insert");
                    list.insertAtStart(scan.nextInt());
                    break;
                case 2:
                    System.out.println("Enter integer element to insert");
                    list.insertAtEnd(scan.nextInt());
                    break;
                case 3:
                    System.out.println("Enter integer element to insert");
                    int num = scan.nextInt();
                    System.out.println("Enter position");
                    int pos = scan.nextInt();
                    if(pos<=1||pos>list.getSize())
                        System.out.println("Invalid position\n");
                    else
                        list.insertAtPos(num,pos);
                    break;
                case 4:
                    System.out.println("Enter position");
                    int p = scan.nextInt();
                    if(p<1 || p>list.getSize())
                        System.out.println("Invalid position\n");
                    else
                        list.deleteAtPos(p);
                    break;
                case 5:
                    System.out.println("Empty status = "+list.isEmpty());
                    break;
                case 6:
                    System.out.println("Size = "+list.getSize() +"\n");
                    break;
                default:
                    System.out.println("Wrong Entry \n" );
                    break;

            }
            list.display();
            System.out.println("\n Do you want to continue (Type y or n \n");
            ch =scan.next().charAt(0);


        }while(ch == 'Y' || ch == 'y');

    }
}
