package Recursion.level3Questions;

import java.util.Scanner;
public class CountMazePath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int row = sc.nextInt();
        int column = sc.nextInt();
        System.out.println(count(row,column));
    }

    private static int count(int row, int column) {
        if(row==1 || column==1){
            return 1;
        }
        int left = count(row-1,column);
        int right = count(row,column-1);
        return left+right;
    }
}
