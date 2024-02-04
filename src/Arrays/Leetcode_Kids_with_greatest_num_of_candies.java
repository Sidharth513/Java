package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Leetcode_Kids_with_greatest_num_of_candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int extra=sc.nextInt();
        List <Boolean> result =kidsWithCandies(arr,extra);
        System.out.println(result);
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result =new ArrayList<>();
        int max= Integer.MIN_VALUE;
        for(int candy : candies){
            if(candy>max){
                max=candy;
            }
        }
        for(int candy:candies){
            if(candy+extraCandies>=max){
                result.add(true);
            }else result.add(false);
        }
        return result;
    }
}
