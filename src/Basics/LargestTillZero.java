package Basics;

import java.util.Scanner;

public class LargestTillZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int largest = 0;
        while (true) {
            int num = sc.nextInt();
            if (num > largest) {
                    largest=num;
                } else if (num == 0) {
                    break;
                }
            }
            System.out.println(largest);
        }
}

