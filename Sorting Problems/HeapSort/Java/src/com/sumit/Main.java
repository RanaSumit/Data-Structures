package com.sumit;

import java.util.Scanner;

public class Main {


    private static int N;
    /* Sort Function */
    public static void HeapSort(int arr[])
    {
        heapify(arr);
        System.out.println("Heapified tree: ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(" " + arr[i]);
        }
        for (int i = N; i > 0; i--)
        {
            swap(arr,0, i);
            N = N-1;
            maxheap(arr, 0);
        }
    }
    /* Function to build a heap */
    public static void heapify(int arr[])
    {
        N = arr.length-1;
        for (int i = N/2; i >= 0; i--)
            maxheap(arr, i);
    }
    /* Function to swap largest element in heap */
    public static void maxheap(int arr[], int i)
    {
        int left = 2*i ;
        int right = 2*i + 1;
        int max = i;
        if (left <= N && arr[left] > arr[i])
            max = left;
        if (right <= N && arr[right] > arr[max])
            max = right;

        if (max != i)
        {
            swap(arr, i, max);
            maxheap(arr, max);
        }
    }
    /* Function to swap two numbers in an array */
    public static void swap(int arr[], int i, int j)
    {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Heap Sort: ");

        System.out.println("Enter number of integer elements to be sorted: ");
        int n = scan.nextInt();
        System.out.println("Enter " + n + " integer elements: ");
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = scan.nextInt();
        }
        HeapSort(arr);

        System.out.println("Sorted array: ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(" " + arr[i]);
        }
    }

}
