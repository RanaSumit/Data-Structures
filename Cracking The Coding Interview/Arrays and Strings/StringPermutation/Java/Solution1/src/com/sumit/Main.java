package com.sumit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        System.out.println(permutation(str1,str2));
    }
    public static boolean permutation(String str1, String str2)
    {
        if(str1.length() != str2.length()) return false;

        return sort(str1).equals(sort(str2));
    }
    public static String sort(String s)
    {
        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }
}
