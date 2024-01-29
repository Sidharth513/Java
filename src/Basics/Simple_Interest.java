package Basics;

import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input principle amount:");
        int principle = input.nextInt();
        System.out.println("Input time:");
        int time = input.nextInt();
        System.out.println("Input rate:");
        int rate = input.nextInt();
        int SI = (principle*time*rate)/100;
        System.out.println("Simple Interest is: "+ SI);
    }
}
