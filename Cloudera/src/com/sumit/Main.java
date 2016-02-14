package com.sumit;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        int a[] = {6,7,8};
        int b[] = {1,2,2};

        System.out.print(solution(a,b));
    }
    static int solution(int A[], int B[]) {

        int largerArr[]=null;

        int smallerArr[]=null;

        if(A.length<B.length){

            smallerArr=A;

            largerArr=B;

        }else{

            smallerArr=B;

            largerArr=A;
        }

        /*put smaller array in hashmap-save memory*/
        Set<Integer> hashSet=new HashSet<Integer>();
        for(int i=0;i<smallerArr.length;i++){

            hashSet.add(smallerArr[i]);

        }

        /*loop through larger array*/

        int min_val=Integer.MAX_VALUE;

        for(int j=0;j<largerArr.length;j++){

            if(hashSet.contains(largerArr[j])){

                if(largerArr[j]<min_val){

                    min_val=largerArr[j];

                }

            }

        }
        if(min_val==Integer.MAX_VALUE){

            return -1;

        }

        return min_val;

    }
}

