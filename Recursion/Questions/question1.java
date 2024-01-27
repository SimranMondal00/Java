package Recursion.Questions;

// Recursively reverse a number
import java.util.Scanner;
public class question1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be reversed");
        int num = sc.nextInt();
        System.out.println("Reverse of " + num + " is " + Reverse(num , 0));
    }

    public static int Reverse(int n,int rev){
        if(n>0){
            int rem = n%10;
            rev = rev*10+rem;
            return Reverse(n/10,rev);
        }
        return rev;
    }
}
