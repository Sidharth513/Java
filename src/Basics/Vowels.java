package Basics;

import java.util.Scanner;



public class Vowels {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while(true){
            char ch=sc.next().charAt(0);
           if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
               System.out.println("Vowel");
           }else if(ch=='x' || ch=='X'){
               break;
           }
           else System.out.println("Not vowel");
        }

    }
}
