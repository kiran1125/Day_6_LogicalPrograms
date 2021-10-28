package com.bridgeLabz;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class CouponNumbers {
    public static void main(String[] args) {
        int temp = -1;
        int i=0;
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of coupons");
        int numOfCoupons = sc.nextInt();
        Random rand = new Random();

        while(i<numOfCoupons){
            int coupon = rand.nextInt(numOfCoupons + 30);
            for (int j=0;j<list.size();j++){
                if (list.get(j) == coupon)
                    temp = 0;
            }
            if (temp == -1){
                list.add(coupon);
                i++;
            }
        }
        for(int a : list){
            System.out.println(a);
        }
    }
}