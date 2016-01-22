package com.sumit;

import java.util.Scanner;

public class MaxHeap {

    int[] a;
    int size;
    int n;

    public int getVal( int pos ) {
        return a[pos];
    }


    public MaxHeap( int size, int[] e ) {
        this.size = size;
        a = new int[size];
        createHeap(e);
    }

    public int parent( int pos ) {
        return (pos-1)/2;
    }

    public void createHeap( int[] e ) {
        for( int val : e ) {
            int curr = n++;
            a[curr] = val;
            while( curr != 0 && a[curr] > a[parent(curr)]) {
                int t = a[curr];
                a[curr] = a[parent(curr)];
                a[parent(curr)] = t;
                curr = parent(curr);
            }
        }
    }

    public int getMax() {
        int max = a[0];
        a[0] = a[n-1];
        a[n-1] = 0;
        n--;
        int pos = 0;
        while( !leaf(pos) && ( a[pos] < a[left(pos)]) || a[pos] < a[right(pos)]) {
            if( a[left(pos)] > a[right(pos)]) {
                int t = a[pos];
                a[pos] = a[left(pos)];
                a[left(pos)] = t;
                pos = left(pos);
            } else {
                int t = a[pos];
                a[pos] = a[right(pos)];
                a[right(pos)] = t;
                pos = right(pos);
            }
        }
        return max;
    }

    public int getMax( int k ) {
        int max = 0;
        for( int i=0; i < k; i++ ) {
            max = getMax();
        }
        return max;
    }

    public boolean leaf( int pos ) {
        return pos >= n/2;
    }

    public int left( int pos ) {
        return (2*pos + 1);
    }

    public int right( int pos ) {
        return (2*pos + 2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of integer elements to be sorted: ");
        int n = scan.nextInt();
        System.out.println("Enter " + n + " integer elements: ");
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = scan.nextInt();
        }

        System.out.println("Enter Kth largest element to be searched: ");
        int k = scan.nextInt();
        if(k < 0 || k > arr.length)
        {
            System.out.println("Invalid position, Enter integer less than Array length");
        }else
        {
            System.out.println("Inserted array: ");
            for(int i = 0; i < n; i++)
            {
                System.out.print(" " + arr[i]);
            }
            MaxHeap heap = new MaxHeap(50, arr);
            int res = heap.getMax( k );
            System.out.println("");
            System.out.println(k +"th maximum element is : " +res);
        }

    }
}