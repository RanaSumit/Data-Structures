package com.sumit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(solution(str));

    }
    public static Boolean solution(String str)
    {
        char ch;
        if(str.length() > 256)
            return false;
        boolean[] charSet = new boolean[256];
        for(int i = 0; i < str.length(); i++)
        {
            ch = str.charAt(i);
            if(charSet[ch]) {
                return false;
            }
            charSet[ch] = true;
        }
        return true;
    }
}
