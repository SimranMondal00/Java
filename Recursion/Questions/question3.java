package Recursion.Questions;

// Print numbers from N to 1
import java.util.Arrays;
import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth term");
        int nth = sc.nextInt();
        Print(nth , 1);
    }
    public static void Print(int i , int j ){
        if(i<j){
            return;
        }
        System.out.print(i + " ");
        Print(i-1,j);
    }
}
