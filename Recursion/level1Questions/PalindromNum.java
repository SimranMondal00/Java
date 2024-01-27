package Recursion.level1Questions;

import java.util.Scanner;
public class PalindromNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (isPalindrome(num)) {
            System.out.println("The entered number is a Palindrome number");
        }
        else {
            System.out.println("The entered number is not a Palindrome number");
        }
    }

    private static boolean isPalindrome(int num) {

        return num == Reverse(num, 0);
    }

    private static int Reverse(int num, int reversedNum) {
        if (num == 0) {
            return reversedNum;
        }
        int rem = num % 10;
        reversedNum = reversedNum * 10 + rem;
        return Reverse(num / 10, reversedNum);
    }

}
