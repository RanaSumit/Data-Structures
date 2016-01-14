package com.sumit;

import java.util.Scanner;

public class Main {

    public static int[] MergeSort(int[] arr)
    {
            if(arr.length <= 1)
            {
                return arr;
            }
        int[] first = new int[arr.length/2];
        int[] second = new int[arr.length - first.length];
        System.arraycopy(arr, 0, first, 0, first.length);
        System.arraycopy(arr, first.length, second, 0, second.length);

        //Sorting each half
        MergeSort(first);
        MergeSort(second);

        //Merge halves together
        merge(first, second, arr);
        return arr;

    }
    public static void merge(int[] first, int[] second, int[] result)
    {
        int iFirst = 0;
        int iSecond = 0;

        int j = 0;
        while(iFirst < first.length && iSecond < second.length)
        {
            if (first[iFirst] < second[iSecond])
            {
                result[j] = first[iFirst];
                iFirst++;
            }
            else
            {
                result[j] = second[iSecond];
                iSecond++;
            }
            j++;
        }
        System.arraycopy(first, iFirst, result, j,first.length - iFirst);
        System.arraycopy(second, iSecond, result, j, second.length - iSecond);
    }
    public static void main(String[] args) {
	    System.out.println("Merge Sort");
        System.out.println("Enter number of elements to be sorted: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int arr[] = new int[n];
        //Entering elements in array
        System.out.println("Enter " + n + " integer elements: ");
        for(int i = 0; i < n; i++)
        {
            arr[i] = scan.nextInt();
        }

        MergeSort(arr);

        System.out.println("Sorted Array: ");


        for(int i = 0; i < n; i++)
        {
            System.out.print(" " + arr[i]);
        }
    }
}
