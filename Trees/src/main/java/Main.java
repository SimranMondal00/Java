import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // System.out.println("Binary Tree :- ");
    // Scanner sc = new Scanner(System.in);
    // BinaryTree tree = new BinaryTree();
    // tree.populate(sc);
    // tree.display();
     BST tree = new BST();
    int[] nums = {5,2,7,1,4,6,9,8,3,10};
    tree.populate(nums);
    tree.display();
    tree.preOrder();
    System.out.println();
    tree.inOrder();
    System.out.println();
    tree.postOrder();
  }
}
