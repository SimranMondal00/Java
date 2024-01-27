package Recursion.level1Questions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find the Factorial");
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " is " + fact(n));
    }

    private static int fact(int n) {
        if(n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);
    }
}
