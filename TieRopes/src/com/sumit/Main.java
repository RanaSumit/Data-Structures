package com.sumit;

public class Main {

         public int solution(int K, int[] A) {
                 if (A.length == 1)
                         return A[0] >= K? 1 :0;
                 int count = 0;
                 int sum = 0;
                 for (int i = 0; i < A.length; i++) {
                         if ((sum += A[i]) >= K) {
                                 sum = 0;
                                 count++;
                             }
                     }
                 return count;
             }

                 public static void main(String[] args) {

                     int p[] = {1, 2, 3, 4, 1, 1, 3};
         		     System.out.println(new Main().solution(4, p));
             }
     }
