import java.util.ArrayList;
public class Main {
    public static void main(String[] args) throws Exception {
        Heaps<Integer> heap = new Heaps<>();

        heap.insert(86);
        heap.insert(85);
        heap.insert(32);
        heap.insert(89);
        heap.insert(26);

        ArrayList list = heap.heapSort();
        System.out.println(list);
    }
}