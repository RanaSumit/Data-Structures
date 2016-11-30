package com.sumit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter number of integers to be sorted");
	int n = scan.nextInt();
	int arr[] = new int[n];
    System.out.println("Enter " + n + " integers: ");
    for(int i = 0; i < n; i++)
        arr[i] = scan.nextInt();

    sort(arr,0,n);
    System.out.println("\nElements after sorting ");
    for (int i = 0; i < n; i++)
        System.out.print(arr[i]+" ");
    System.out.println();
    }
    public static void sort(int[] a, int low, int high) {
        int N = high - low;
        if (N <= 1)
            return;
        int mid = low + N/2;
        // recursively sort
        sort(a, low, mid);
        sort(a, mid, high);
        // merge two sorted subarrays
        int[] temp = new int[N];
        int i = low, j = mid;
        for (int k = 0; k < N; k++)
        {
            if (i == mid)
                temp[k] = a[j++];
            else if (j == high)
                temp[k] = a[i++];
            else if (a[j]<a[i])
                temp[k] = a[j++];
            else
                temp[k] = a[i++];
        }
        for (int k = 0; k < N; k++)
            a[low + k] = temp[k];
    }
}
