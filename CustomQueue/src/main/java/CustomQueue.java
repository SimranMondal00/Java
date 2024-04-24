public class CustomQueue{
  private int[] arr;
  private static final int DEFAULT_SIZE = 10;
  int end = 0;
  public CustomQueue(){
    this(DEFAULT_SIZE);
  }
  public CustomQueue(int size){
    this.arr = new int[size];
  }
  public boolean isFull(){
    return end == arr.length;
  }
  public boolean isEmpty(){
    return end == 0;
  }
  public boolean enqueue(int value){
    if(isFull()){
      return false;
    }
    arr[end++] = value;
    return true;
  }
  public int dequeue(){
    if(isEmpty()){
      return -1;
    }
    int remove = arr[0];
    for(int i=1;i<end;i++){
      arr[i-1] = arr[i];
    }
    end--;
    return remove;
  }
  public void display(){
    for(int i=0;i<end;i++){
      System.out.print(arr[i]+"->");
    }
    System.out.println("End");
  }
}