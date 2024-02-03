package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Leetcode_Concatination_Of_Array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
       int[] arr2=new int[2*n];
        for(int i=0;i<arr.length;i++){
            arr2[i]= arr[i];
            arr2[i+n]=arr[i];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
