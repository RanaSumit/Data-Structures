package com.sumit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int[] a = new int[N];
        int[] b = new int[M];
        for(int i = 0; i < N; i++)
        {
            a[i] = scan.nextInt();
        }
        for(int i = 0; i < M; i++)
        {
            b[i] = scan.nextInt();
        }
        findLCS(a,b);

    }
    private static void findLCS(int[] a, int[] b) {
        int[][] lcs = new int[a.length+1][b.length+1];
        for(int i = 0; i <= a.length; i++) {
            for(int j = 0; j <= b.length; j++) {
                if(i == 0 | j == 0)
                    lcs[i][j] = 0;
                else if(a[i-1] == b[j-1])
                    lcs[i][j] = lcs[i-1][j-1] +1;
                else
                    lcs[i][j] = lcs[i-1][j] > lcs[i][j-1] ? lcs[i-1][j]:lcs[i][j-1];                       }
        }

        int[] result = new int[lcs[a.length][b.length]];
        int index = result.length;
        int i = a.length, j = b.length;
        while(i > 0 && j > 0) {
            if(a[i-1] == b[j-1]) {
                result[index-1] = a[i-1];
                index--; i--; j--;
            } else {
                if(lcs[i-1][j] > lcs[i][j-1]) {
                    i--;
                } else {
                    j--;
                }
            }
        }
        for(int x:result)
            System.out.print(x + " ");
    }

}
