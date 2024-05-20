class SegmentTree{
  private static class Node{
    int data;
    int startIntervel;
    int endInterval;
    Node left;
    Node right;

    public Node(int startInterval, int endInterval){
      this.startIntervel = startInterval;
      this.endInterval = endInterval;
    }
  }
  Node root;
  public SegmentTree(int[] arr){
     this.root = constructTree(arr,0,arr.length-1);
  }
  private Node constructTree(int[] arr, int start, int end){
    if(start == end){
      Node leaf = new Node(start,end);
      leaf.data = arr[start];
      return leaf;
    }
    Node node = new Node(start,end);
    int mis = (start+end)/2;
    node.left = this.construtTree(arr,start,mid);
    node.right = this.constructTree(arr,mid+1,end);
    node.data = node.left.data + node.right.data;
    return node;
  }
  public void display(){
    display(this.root);
  }
  public void display(Node node){
    String str = " ";
    if(node.left != null){
      str = str + "Interval [ " + node.left.startIntervel + " - " + node.left.endInterval + "] and data " + node.left.data + " => ";
    }else{
      str = str + "No left child";
    }
    str = str + "Interval [ " + node.startIntervel + " - " + node.endInterval + "] and data " + node.data + " <= ";

    if(node.right != null){
      str = str + "Interval [ " + node.right.startIntervel + " - " + node.right.endInterval + "] and data " + node.right.data;
    }else{
      str = str + "No right child";
    }
    System.out.println(str + "\n");
    if(node.left != null){
      display(node.left);
    }
    if(node.right != null){
      display(node.right);
    }
  }
  public int query(int qsi,int qei){
    return this.query(this.root,qsi,qei);
  }
  private int query(Node node , int qsi , int qei){
    if(node.startIntervel >= qsi && node.endInterval <= qei){
      return node.data;
    }
    else if(node.startIntervel > qei && node.endInterval < qsi){
      return 0;
    }
    else{
      return this.query(node.left,qsi,qei) + this.query(node.right,qsi,qei);
    }
  }
  public void update(int index,int value){
    this.root.data = update(this..root,index,value);
  }
  private int update(Node node, int index,int value){
    if(index >= node.startIntervel && index <= node.endInterval){
      if(index == node.startIntervel && index == node.endInterval){
        node.data = value;
        return node.data;
      }else{
        int leftAns = update(node.left,index,value);
        int rightAns = update(node.right,index,value);
        node.data = leftAns + rightAns;
        return node.data;
      }
    }
    return node.data;
  }
}
