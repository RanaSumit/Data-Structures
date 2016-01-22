package com.sumit;

import java.util.Scanner;

public class Main {


    public static void QuickSort(int arr[], int low, int high)
    {
        int i = low, j = high;
        int temp;
        int pivot = arr[(low + high) / 2];

        // Partition the array

        while (i <= j)
        {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if(i <= j)
            {
                //swap
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
        }
        //recursively sort lower half
        if(low < j)
            QuickSort(arr, low, j);
        //recursively sort upper half
        if(i < high)
            QuickSort(arr, i, high);
    }


    public static void main(String[] args) {
	    System.out.println("Quick Sort: ");
        System.out.println("Enter number of elements to be sorted: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " integer elements: ");
        for(int i = 0; i < n; i++)
        {
            arr[i] = scan.nextInt();
        }

        System.out.println("Unsorted Array: ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(" " + arr[i]);
        }

        QuickSort(arr, 0, arr.length - 1);
        System.out.println(" ");
        System.out.println("Sorted Array: ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(" " + arr[i]);
        }
    }
}
