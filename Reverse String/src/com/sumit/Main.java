package com.sumit;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args )throws FileNotFoundException, IOException
    {
        String s;

	    Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        s = scan.nextLine();

        System.out.println("Original String: " + s);

        //reverse String using StringBuffer in Java
        String reverse = new StringBuffer(s).reverse().toString();
        System.out.println("Reverse String in Java using StringBuffer: " + reverse);

        //reverse String using iterative method in Java
        reverse = iterativeReverse(s);
        System.out.println("Reverse String in Java using iterative method: " + reverse);

        // reverse String using recursive method in Java

        reverse = recursiveReverse(s);
        System.out.println("Reverse String in Java using recursive method: " + reverse);

    }
    public static String iterativeReverse(String str)
    {
        StringBuilder strBuilder = new StringBuilder();
        char[] strChars = str.toCharArray();

        for(int i = strChars.length - 1; i >= 0; i--)
        {
            strBuilder.append(strChars[i]);
        }

        return strBuilder.toString();
    }

    public static String recursiveReverse(String str)
    {
        if(str.length() <2)
        {
            return str;
        }

        return recursiveReverse(str.substring(1)) + str.charAt(0);
    }
}
