package Arrays;
import java.util.Scanner;

public class Leetcode_Flipping_an_Image {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            int start=0;
            int end=n-1;
           while(end>start){
               int temp=arr[i][start];
               arr[i][start]=arr[i][end];
               arr[i][end]=temp;

               start++;
               end--;
           }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==0){
                    arr[i][j]=1;
                }
                else{
                    arr[i][j]=0;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
