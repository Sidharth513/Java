package Basics;

import java.util.Scanner;

public class Perfect_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int val=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                val=i+val;
            }
        }
        System.out.println(val);
        if(num==val){
            System.out.println("Perfect Number");
        }else System.out.println("Not Perfect Number");
    }
}
