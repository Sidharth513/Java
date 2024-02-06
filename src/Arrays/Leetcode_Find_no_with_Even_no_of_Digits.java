package Arrays;

import java.util.Scanner;

public class Leetcode_Find_no_with_Even_no_of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int count =0;
        for(int i=0;i<arr.length;i++){
            int num =(int)Math.floor(Math.log10(arr[i])+1);
            if(num%2==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
