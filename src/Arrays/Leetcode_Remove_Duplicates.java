package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Leetcode_Remove_Duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr[j]){
                arr[++j]=arr[i];
            }
        }
        System.out.println(j+1);
        System.out.println(Arrays.toString(arr));
    }
}
