package Basics;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int prev1=0;
        int prev2=1;
        int f=0;
        int n =input.nextInt();
        for(int i=1;i<=n;i++){
            f = prev1+prev2;
            prev1=prev2;
            prev2=f;
            System.out.println(f);
        }
    }
}
