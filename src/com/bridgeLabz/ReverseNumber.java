package com.bridgeLabz;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        int reverse=0,remainder=0;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        while (num != 0){
            remainder = num%10;
            reverse = reverse*10 + remainder;
            num = num/10;
        }
        System.out.println("reverse number is : " + reverse);
    }
}
