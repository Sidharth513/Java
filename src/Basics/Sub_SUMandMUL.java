package Basics;

import java.util.Scanner;

public class Sub_SUMandMUL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int rem,sum =0;
        int mul=1;
        for(int i=1;i<=n;i++){
            rem = n%10;
            sum = rem+sum;
            mul =mul*rem;
            n=n/10;
        }
        int sub=mul-sum;
        System.out.println(sub);

    }
}
