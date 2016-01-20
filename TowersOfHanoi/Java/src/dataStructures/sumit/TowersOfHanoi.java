package dataStructures.sumit;

import java.util.Scanner;

public class TowersOfHanoi {

    public void logic (int n, String start, String aux, String dest)
    {

        if(n==1)
        {
            System.out.println(start + "->" + dest);
        }
        else
        {
            logic(n-1, start, dest, aux);
            System.out.println(start + "->" + dest);
            logic(n-1, aux, start, dest);
        }

    }

    public static void main(String[] args) {
	TowersOfHanoi TOH = new TowersOfHanoi();
        System.out.println("Enter number of disks: ");
        Scanner scanner = new Scanner(System.in);
        int discs = scanner.nextInt();
        TOH.logic(discs,"A", "B", "C");
    }
}
