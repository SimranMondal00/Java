package MathInJava;

import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check");
        int n = sc.nextInt();
        if(check(n)){
            System.out.println(n + " is odd");
        }
        else{
            System.out.println(n + " is even");
        }
    }
    private static boolean check(int n) {
        return (n&1)==1;
    }
}
