package StingsAndStringBuilders;

import java.util.Scanner;
public class StringPractice2 {
    public static void main(String[] args) {
        //FINDING THE CHARACTER AT A GIVEN INDEX
        // WE WILL USE .charAt() METHORD
        findChar();
        preetyPrinting();
        StringConcate();
    }

    private static void findChar() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String");
        String name = new String(in.nextLine());
        System.out.println("Enter the  Index");
        int n = in.nextInt();
        System.out.println("Character at index " + n + " is " + name.charAt(n));
    }
    private static void preetyPrinting() {
        float a = 453.1274f;
        System.out.printf("Formatted number is %.2f", a);
        System.out.println();
        System.out.printf("Pie: %3f",Math.PI);
    }
    private static void StringConcate() {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        String personality = in.nextLine();
        System.out.printf("Hey! my name is %s and I am %s",name,personality);
    }
}
