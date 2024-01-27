package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Nth term");
        int num = sc.nextInt();
       for(int i=0; i<=num ;i++){
           System.out.println(Arrays.toString(new int [] {fibo(i)}));
       }
    }

    private static int fibo(int num) {
        if(num<2){
            return num;
        }
        return fibo(num-1) + fibo(num-2);
    }
}
