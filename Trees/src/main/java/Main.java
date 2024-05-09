import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Binary Tree :- ");
    Scanner sc = new Scanner(System.in);
    BinaryTree tree = new BinaryTree();
    tree.populate(sc);
    tree.display();
  }
}