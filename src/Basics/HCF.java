package Basics;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        if(a>b){
            int temp=b;
            b=a;
            a=temp;
        }
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println(a);
    }
}
