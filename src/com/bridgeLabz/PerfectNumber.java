package com.bridgeLabz;
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int num = sc.nextInt();
        for (int i=1;i<=num/2;i++){
            if (num%i == 0){
                sum = sum + i;
            }
        }
        if (sum == num)
            System.out.println(num + "Is a Perfect Number");
        else
            System.out.println(num + "Is not a Perfect Number");
    }
}
