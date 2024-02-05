package Arrays;

import java.util.Scanner;

public class Leetcode_Find_The_Highest_Altitude {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt();
        }

        int max= 0;
        int current=0;
        for(int i=0;i<arr.length;i++){
            current =arr[i]+current;
            if(current>max){
                max=current;
            }
        }
        System.out.println(max);

    }
}
