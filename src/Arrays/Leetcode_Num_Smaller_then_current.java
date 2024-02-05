package Arrays;
import java.util.Scanner;

public class Leetcode_Num_Smaller_then_current {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            int count=0;
            int start=0;
            for(int j=start;j<arr.length;j++){
                if(i==j){
                    continue;
                }
                if(arr[i]>arr[j]){
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}
