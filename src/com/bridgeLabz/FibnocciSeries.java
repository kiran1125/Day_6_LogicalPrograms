package com.bridgeLabz;
import java.util.Scanner;
public class FibnocciSeries {
    public static void main(String[] args) {
        int a=0,b=1;
        int c=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = scanner.nextInt();
        for (int i=0;i<=n;i++){
            if (i==0)
                System.out.println(a);
            else if (i==1)
                System.out.println(a+b);
            else {
                c = a + b;
                System.out.println(c);
                a = b;
                b = c;
            }
        }
    }
}
