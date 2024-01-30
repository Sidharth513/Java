package Basics;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp,count=0;
        int taken=num;
        while(num!=0){
            temp =num%10;
            count++;
            num=num/10;
        }
        System.out.println(count);
//        int n=count;
        int val=0;
        int taken2=taken;
        while(taken!=0){
            temp=taken%10;
            val=(int)Math.pow(temp,count)+val;
            taken=taken/10;
        }
//        System.out.println(val);
        if(val==taken2){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }

    }
}
