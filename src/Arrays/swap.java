package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++){
          arr[i] = sc.nextInt();
       }
        System.out.println(Arrays.toString(arr));
        int a =sc.nextInt();
       int b= sc.nextInt();
       sw(arr,a,b);
        System.out.println(Arrays.toString(arr));
    }
    static void sw(int[] a,int x,int y){
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }
    }




