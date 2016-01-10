package com.sumit;

public class Main {

    static int counter = 0;
    public static void main(String[] args)
    {
	    int x[] = {1,2,3,4,5,6,7};
        int y[] = {6,3,7,5,10};
        //System.out.print("Array length: "+x.length);
        System.out.println("First Array: ");
        for(int i = 0; i < x.length; i++)
        {

            System.out.print(" "+ x[i]);
        }
        System.out.println("");
        System.out.print("Second Array:");
        System.out.println("");
        for(int i = 0; i < y.length; i++)
        {

            System.out.print(" "+ y[i]);
        }
        commonElement(x,y);
    }
    static void commonElement(int x[], int y[])
    {
        int z[] = new int[x.length+y.length];

        for(int i = 0; i < x.length; i++)
        {
            for(int j = 0; j < y.length; j++)
            {
                if(x[i] == y[j])
                {
                    z[counter] = x[i];
                    counter++;
                }
            }
        }
        System.out.println("");
        System.out.println("Intersection of two arrays is: ");
        for(int i = 0; i < counter; i++)
        {
            System.out.print(" "+z[i]);
        }
    }
}
