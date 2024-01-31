package Methods;

import java.util.Scanner;

public class Prime_btw_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        for(int i=num1;i<=num2;i++) {
            if (isprime(i)) {
                System.out.println(i + " ");
            }
        }
    }
    static boolean isprime(int n){
        if(n<=1){
            return false;
        }
//        int c=2;
//        while(c*c <n){
//            if(n%c==0){
//                return false;
//            }
//            c++;
//        }
//        return c*c>n;
          for(int i=2;i<=n/2;i++) {
             if (n % i == 0) {
               return false;
             }
          }
       return true;
    }
}
