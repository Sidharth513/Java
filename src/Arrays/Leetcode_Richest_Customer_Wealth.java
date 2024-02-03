package Arrays;

import java.util.Scanner;

public class Leetcode_Richest_Customer_Wealth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
       int max= Integer.MIN_VALUE;
        for (int[] ints : arr) {
            int sum = 0;
            for (int anInt : ints) {
                sum = anInt + sum;
            }
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println(max);
    }
}
