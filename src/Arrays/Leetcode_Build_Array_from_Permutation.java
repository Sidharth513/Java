package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Leetcode_Build_Array_from_Permutation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        int[] ans=new int[n];
        for(int i=0;i<arr.length;i++){
            ans[i]= arr[arr[i]];
        }
        System.out.println(Arrays.toString(ans));
    }
}
