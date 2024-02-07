package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Leetcode_Plus_One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            arr[i]=arr[i]+1;
            if(arr[i]<10){
                break;
            }
            else{
                arr[i]=0;
            }
        }
        System.out.println(Arrays.toString(arr));
        if(arr[0]==0){
            int[] arr1=new int[n+1];
            arr1[0]=1;
            System.out.println(Arrays.toString(arr1));
        }
    }
}
