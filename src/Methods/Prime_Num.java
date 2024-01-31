package Methods;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Prime_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean ans = prime(num);
        System.out.println(ans);
    }
    static boolean prime(int a){

        if(a<=1){
            return false;
        }
        int c=2;
        while(c*c <a){
            if(a%c==0){
                return false;
            }
            c++;
        }
        return c*c>a;
    }
}
