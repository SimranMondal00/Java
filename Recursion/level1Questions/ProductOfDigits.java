package Recursion.level1Questions;

import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Product of digits of " + num + " is " + calculateProduct(num));
    }

    private static int calculateProduct(int num) {
        if(num == 0){
            return 1;
        }
        return (num%10)*calculateProduct(num/10);
    }
}
