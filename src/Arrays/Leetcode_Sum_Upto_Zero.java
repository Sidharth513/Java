package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Leetcode_Sum_Upto_Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int d = -n / 2;
        if(n%2!=0){
            for (int i = 0; i < arr.length; i++) {
                arr[i]=d;
                d=d+1;
            }
        }
        if(n%2==0){
            for(int i=0;i<arr.length;i++){
                if(d==0){
                    d=d+1;
                }
                arr[i]=d;
                d=d+1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
