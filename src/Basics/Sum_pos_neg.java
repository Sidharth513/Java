package Basics;

import java.util.Scanner;

public class Sum_pos_neg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pe = 0,po=0,neg=0;
        while(true){
        int num = sc.nextInt();
            if (num > 0 && num % 2 == 0) {
                pe = num + pe;
            } else if (num > 0 && num % 2 != 0) {
                po = num + po;
            } else if (num < 0) {
                neg = neg + num;
            } else if (num == 0) {
                break;
            }
    }
        System.out.println("Sum of positive even numbers "+pe);
        System.out.println("Sum of positive odd numbers "+po);
        System.out.print("Sum of positive neg numbers "+neg);
    }
}
