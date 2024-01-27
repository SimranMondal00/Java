package Recursion.level1Questions;

import java.util.Scanner;

public class ReverseOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to be reversed");
        int num = sc.nextInt();
        System.out.println("Reverse of " + num + " is " + Reverse(num));
    }
    static int rev = 0;

    private static int Reverse(int num) {
        if(num==0){
            return rev;
        }
        int rem = num%10;
        rev = rev*10 + rem;
        return Reverse(num/10);
    }
}
