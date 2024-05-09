import java.util.Scanner;
class BinaryTree{
  public BinaryTree(){
    
  }
  public class Node{
    int value;
    Node left;
    Node right;
    public Node(int val){
      this.value = val;
    }
  }
  private Node root;
  public void populate(Scanner scanner){
    System.out.println("Enter the root node: ");
    int item = scanner.nextInt();
    root = new Node(item);
    populate(scanner, root);
  }
  private void populate(Scanner scanner, Node node){
    System.out.println("Do you want to enter in the left of " + node.value);
    boolean left = scanner.nextBoolean();
    if(left){
      System.out.println("Enter the value of left of " + node.value);
      int item = scanner.nextInt();
      node.left = new Node(item);
      populate(scanner,node.left);
    }
    System.out.println("Do you want to enter in right of "+ node.value);
    boolean right = scanner.nextBoolean();
    if(right){
      System.out.println("Enter the value for the right og "+ node.value);
      int item = scanner.nextInt();
      node.right = new Node(item);
      populate(scanner, node.right);
    }
  }
  public void display(){
    display(root, " ");
  }
  private void display(Node node, String indent){
    if(node == null){
      return;
    }
    System.out.println(indent + node.value);
    display(node.left, indent+"\t");
    display(node.right, indent+"\t");
  }
}