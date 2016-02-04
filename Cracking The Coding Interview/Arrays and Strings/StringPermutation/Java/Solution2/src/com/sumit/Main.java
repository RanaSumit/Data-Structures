package com.sumit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        System.out.println(solution(str1,str2));
    }
    public static boolean solution(String str1, String str2)
    {
        if(str1.length() != str2.length()) return false;

        int[] letters = new int[256]; //Assuming ASCII String
        char[] strArray = str1.toCharArray();
        for(char c : strArray)
        {
            //counting number of each characters in String 1
            letters[c]++;
        }
        for(int i = 0; i < str2.length(); i++)
        {
            int c = (int) str2.charAt(i);
            if(--letters[c] < 0)
            {
                return false;
            }
        }
        return true;
    }
}
