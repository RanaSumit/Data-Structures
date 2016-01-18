package com.sumit;

import java.util.Scanner;

public class Main {

    public static void Max(int arr[])
    {
        int maxOne = 0, maxTwo = 0;

        for(int n: arr)
        {
            if(maxOne < n)
            {
                maxTwo = maxOne;
                maxOne = n;
            }
            else if(maxTwo < n)
            {
                maxTwo = n;
            }
        }
        System.out.println("First Max Number: " + maxOne);
        System.out.println("Second Max Number: " + maxTwo);
    }

    public static void main(String[] args) {
        System.out.print("Enter number of elements in array: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " integer elements: ");
        for(int i = 0; i < n; i++)
        {
            arr[i] = scan.nextInt();
        }

        System.out.println("Array Entered: ");

        for(int i = 0; i < n; i++)
        {
            System.out.print(" " + arr[i]);
        }
        System.out.println(" ");
        Max(arr);
    }
}
