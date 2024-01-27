package Recursion.level1Questions;

import java.util.Scanner;

import java.util.Scanner;

public class belowForm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a lowercase letter: ");
        char ch = sc.next().charAt(0);

        if (Character.isLowerCase(ch)) {
            funBoth(ch);
        } else {
            System.out.println("Please enter a lowercase letter.");
        }

        // Close the Scanner
        sc.close();
    }

    private static void funBoth(char i) {
        if (i == 'a') {
            return;
        }
        System.out.println(i);
        funBoth((char) (i - 1));
        System.out.println(i);
    }
}

