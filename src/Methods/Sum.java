package Methods;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sum(num));
    }
    static int sum(int a){
        int sum=0;
        for(int i=1;i<=a;i++){
            sum =i+sum;
        }
        return sum;
    }
}
