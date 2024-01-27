package Recursion.level1Questions;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Sum of digits of " + num + " is " + calculateSum(num));
    }

    private static int calculateSum(int num) {
        if(num == 0){
            return 0;
        }
        return (num%10) + calculateSum(num/10);
    }
}
