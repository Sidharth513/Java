package Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Leetcode_Target_Array_In_Given_Order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] index=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<index.length;i++){
            index[i]=sc.nextInt();
        }

        ArrayList<Integer>res=new ArrayList<>();
        int[] target =new int[arr.length];
        for(int i=0;i<arr.length;i++){
            res.add(index[i],arr[i]);
        }
        for(int i=0;i<res.size();i++){
            target[i]= res.get(i);
        }
        System.out.println(res);
        System.out.println(Arrays.toString(target));
    }
}
