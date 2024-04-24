// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    System.out.println("Queue");
    CustomQueue queue = new CustomQueue(5);
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    queue.enqueue(4);
    queue.enqueue(5);
    queue.display();
    queue.dequeue();
    queue.dequeue();
    queue.display();
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}