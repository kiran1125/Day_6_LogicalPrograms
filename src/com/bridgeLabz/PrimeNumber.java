package com.bridgeLabz;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        int flag=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        for (int i=2;i<=n/2;i++){
            if (n%i != 0)
                flag=0;
            else
                flag=1;
        }
        if (flag==0)
            System.out.println(n + " is a Prime Number");
        else
            System.out.println(n + " is not a Prime Number ");

    }
}
