package Recursion.level2Questions;

import java.util.ArrayList;
import java.util.Arrays;

public class Subset {
    public static void main(String[] args) {
       printSubset("","abc");
        System.out.println(printSubset2("","abc"));
        printSubsetASCII("","abc");
    }

    private static void printSubsetASCII(String p, String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        printSubsetASCII(p+ch,up.substring(1));
        printSubsetASCII(p,up.substring(1));
        printSubsetASCII(p + (ch+0),up.substring(1));
    }

    private static ArrayList<String> printSubset2(String p, String up) {
        if(up.isEmpty()){
            ArrayList<String> sub = new ArrayList<>();
            sub.add(p);
          return sub;
        }
        char ch = up.charAt(0);
       ArrayList<String> left = printSubset2(p+ch,up.substring(1));
        ArrayList<String> right = printSubset2(p,up.substring(1));
        left.addAll(right);
        return left;
    }

    private static void printSubset(String p, String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        printSubset(p+ch,up.substring(1));
        printSubset(p,up.substring(1));
    }
}
