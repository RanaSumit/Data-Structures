package com.sumit;

public class Main {

    public static void main(String[] args) {
	    int array[] = {23, 34, 2, 99, 3, 21, 44, 101, 45, 100, 79, 39};

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
