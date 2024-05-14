class AVL{
  public class Node{
    private int value;
    private int height;
    private Node left;
    private Node right;
    public Node(int value){
      this.value = value;
    }
    public int getValue(){
      return value;
    }
  }
  private Node root;
  public int height(Node node){
    if(node == null){
      return -1;
    }
    return node.height;
  }
  public boolean isEmpty(){
    return root == null;
  }
  public void insert(int val){
    root = insert(val, root);
  }
  private Node insert(int val, Node node){
    if(node == null){
      node = new Node(val);
      return node;
    }
    if(val<node.value){
      node.left = insert(val, node.left);
    }
    if(val>node.value){
      node.right = insert(val, node.right);
    }
    node.height = node.height = Math.max(height(node.left), height(node.right)) + 1;;
    return rotate(node);
  }
  public void populate(int[] nums){
    for(int i=0;i<nums.length;i++){
      this.insert(nums[i]);
    }
  }
  private Node rotate(Node node){
    if(height(node.left) - height(node.right)>1){
      //left heavy
      if(height(node.left.left)- height(node.left.right)>0){
        //left-left case
        return rightRotate(node);
      }
      if(height(node.left.left)-height(node.left.right)<0){
        //left-right case
        node.left = leftRotate(node.left);
        return rightRotate(node.right);
      }
    }
    if(height(node.left)-height(node.right)<-1){
      //right heavy
      if(height(node.right.left)-height(node.right.right)<0){
        //right-right case
        return leftRotate(node);
      }
      if(height(node.right.left)-height(node.right.right)>0){
        node.right = rightRotate(node.right);
        return leftRotate(node);
      }
    }
    return node;
  }
  public Node rightRotate(Node p){
    Node c = p.left;
    Node t = c.right;
    c.right = p;
    p.left = t;
    p.height = Math.max(height(p.left),height(p.right)+1);
    c.height = Math.max(height(c.left),height(c.right)+1);
    return c;
  }
  public Node leftRotate(Node c){
    Node p = c.right;
    Node t = p.left;
    c.right = t;
    p.height = Math.max(height(p.left),height(p.right)+1);
    c.height = Math.max(height(c.left),height(c.right)+1);
    return p;
  }
}
