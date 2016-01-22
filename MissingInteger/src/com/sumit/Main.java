package com.sumit;

import java.util.Arrays;
import java.util.Scanner;

public class Main {



    public static int solution(int A[])
    {

        Arrays.sort(A);
        int minValue = 1;
        for(int value: A){
            if (value == minValue){
                minValue++;
            }
        }
        return minValue;
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
        System.out.println("Missing Value: " + solution(arr));

    }
}
