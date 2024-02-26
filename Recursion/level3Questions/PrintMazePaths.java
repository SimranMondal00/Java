package Recursion.level3Questions;

import java.util.ArrayList;
import java.util.Scanner;
public class PrintMazePaths {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int row = sc.nextInt();
        int col = sc.nextInt();
        printPath("",row,col);
        System.out.println(pathReturn("",row,col));
    }

    private static void printPath(String s, int row, int col) {
        if(row==1 || col==1){
            System.out.println(s);
            return;
        }
        if(row>1){
            printPath(s+'D',row-1,col);
        }
        if(col>1){
            printPath(s+'R',row,col-1);
        }
    }
    private static ArrayList<String> pathReturn(String p,int r , int c){
        if(r==1 || c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1){
            list.addAll(pathReturn(p+'D',r-1,c));
        }
        if(c>1){
            list.addAll(pathReturn(p+'R',r,c-1));
        }
        return list;
    }
}
