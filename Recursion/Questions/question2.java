package Recursion.Questions;
//Print numbers from 1 to N

import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth term");
        int nth = sc.nextInt();
        print(1,nth);
    }
    public static void print(int i , int j){
        if(i>j){
            return;
        }
        System.out.println(i);
        print(i+1,j);
    }
}
