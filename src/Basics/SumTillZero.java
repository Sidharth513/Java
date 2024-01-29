package Basics;

import java.util.Scanner;

public class SumTillZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        while(true){

            int num = sc.nextInt();
            if(num>0) {
                sum = num + sum;
            }else if(num==0){
                break;
            }
        }
        System.out.println(sum);
    }

}
