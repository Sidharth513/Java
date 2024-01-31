package Methods;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();

            int sum =fact(num);
        System.out.println(sum);
    }
        static int fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
}
