package LinkedList;

public class MainDLL {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(10);
        list.insertFirst(9);
        list.insertFirst(8);
        list.insertFirst(7);
        list.insertFirst(6);
        list.display();
        list.insertLast(99);
        list.display();
    }
}
