public class Main {
  public static void main(String[] args) throws Exception{
    // CircularQueue queue = new CircularQueue(10);
    CircularQueue queue = new DynamicQueue(4);
    queue.insert(03);
     queue.insert(13);
     queue.insert(23);
     queue.insert(33);
     queue.insert(43);
     queue.insert(53);
     queue.display();
    queue.remove();
    queue.remove();
    queue.display();
  }
}