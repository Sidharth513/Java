package Basics;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n%400==0){
            System.out.println("Leap Year");
        }else if(n%100!=0 && n%4==0){
            System.out.println("Leap Year");
        }else System.out.println("Not a Leap Year");
    }
}
