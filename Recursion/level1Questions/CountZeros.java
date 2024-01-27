package Recursion.level1Questions;

import java.util.Scanner;
public class CountZeros {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("There are " + fun(num,0 ) + " in " + num);
    }

    private static int fun(int num, int c) {
        if(num == 0){
            return c;
        }
        if(num%10 == 0){
            return fun(num/10 , c+1);
        }
        return fun(num/10 , c);
    }
}
