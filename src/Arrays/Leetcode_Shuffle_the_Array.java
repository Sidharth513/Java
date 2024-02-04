package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Leetcode_Shuffle_the_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[2*n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int[] arr2 =new int [2*n];
        for(int i=0;i<n;i++){
            arr2[i*2]=arr[i];
            arr2[i*2+1]=arr[i+n];

        }
        System.out.println(Arrays.toString(arr2));
    }
}
