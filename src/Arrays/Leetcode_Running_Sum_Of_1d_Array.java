package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Leetcode_Running_Sum_Of_1d_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt();
        }
        int[] arr2 =new int [n];
        int r=0;
        for(int i=0;i<arr.length;i++){

            arr2[i]=arr[i]+r;
            r=arr[i]+r;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
