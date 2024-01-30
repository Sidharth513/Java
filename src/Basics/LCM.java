package Basics;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int max=(a>b)?a:b;
        int i;
        for(i=max;i<=a*b;i=i+max){
            if(i%a==0 && i%b==0) {
                break;
            }
        }
        System.out.println(i);
    }
}
