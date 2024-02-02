package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        rev(arr);
        System.out.println(Arrays.toString(arr));
    }
        static void rev(int[] a){
            int start=0;
            int end=a.length-1;
            while(start<end){
                swap(a,start,end);
                start++;
                end--;
            }
        }
        static void swap(int[] a,int x,int y){
            int temp=a[x];
            a[x]=a[y];
            a[y]=temp;
        }
        }


