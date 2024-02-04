package Arrays;

import java.util.Scanner;

public class Leetcode_Number_of_good_pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
//        for(int i=0;i<arr.length-1;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]==arr[j]){
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);
        int[] ans=new int[101];
        for(int i=0;i<arr.length;i++){
            count=count+ans[arr[i]];
            ans[arr[i]]++;
        }
        System.out.println(count);
    }
}
