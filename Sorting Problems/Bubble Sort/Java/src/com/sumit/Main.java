package com.sumit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter Number of elements: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int array[] = new int[n];
        System.out.println("Enter " + n + " integer elements: ");
        for(int i = 0; i < n; i++)
        {
            array[i] = scan.nextInt();
        }

        // Printing unsorted array
        System.out.println("Unsorted Array: ");
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(" " + array[i]);
        }

        BubbleSort(array);

        System.out.println("");
        System.out.println("Sorted Array: ");
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(" " + array[i]);
        }



    }
    public static void BubbleSort(int[] array)
    {
        int length = array.length;
        int temp = 0;
        for(int i = 0; i < length; i++)
        {
            for(int j = 1; j < length; j++)
            {
                if(array[j-1] > array[j])
                {
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
