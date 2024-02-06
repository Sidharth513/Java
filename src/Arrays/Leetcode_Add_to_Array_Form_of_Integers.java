package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Leetcode_Add_to_Array_Form_of_Integers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        ArrayList<Integer> result = addToArrayForm(arr,k);
        System.out.println(result);
    }
    public static ArrayList<Integer> addToArrayForm(int[] num, int k) {
       ArrayList<Integer> res=new ArrayList<>();
       int carry=0;
       int index=num.length-1;
       while(index>=0||k>0||carry>0){
           int sum=carry;
           if(index>=0){
               sum=sum+num[index];
               index--;
           }
           if(k>0){
               sum=sum+k%10;
               k=k/10;
           }
           res.addFirst(sum%10);
           carry=sum/10;
        }
       return res;
    }
}
