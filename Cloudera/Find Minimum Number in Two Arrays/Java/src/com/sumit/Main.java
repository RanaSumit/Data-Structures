package com.sumit;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        int a[] = {6,7,1};
        int b[] = {6,2,2,1};

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

        Set<Integer> hashSet=new HashSet<Integer>();
        for(int i=0;i<smallerArr.length;i++){

            hashSet.add(smallerArr[i]);

        }
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

