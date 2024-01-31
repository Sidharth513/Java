package Methods;

import java.util.Scanner;

public class Pythagorean_Triplet {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        boolean ans = pythag(num1,num2,num3);
        System.out.println(ans);
    }
    static boolean pythag(int a,int b,int c){
        int ans = a*a +b*b;
        return ans == c * c;
    }
}
