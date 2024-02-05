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

//        for(int i=0;i<arr.length;i++){
//            int end=arr.length-1;
//            while(end>i){
//                if(arr[i]==arr[end]){
//                    count++;
//                }
//                end--;
//            }
//        }
//        System.out.println(count);

//        int[] ans=new int[101];
//        for(int i=0;i<arr.length;i++){
//            ans[arr[i]]++;
//        }
//        for(int i=0;i<ans.length;i++){
//            count=count+(ans[i]*(ans[i]-1))/2;
//        }
//        System.out.println(count);

        int[] ans=new int[101];
        for(int i=0;i<arr.length;i++){
            count = count+ans[arr[i]];
            ans[arr[i]]++;
        }
        System.out.println(count);
    }
}
