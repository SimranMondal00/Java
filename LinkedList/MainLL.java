package LinkedList;

public class MainLL {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(100);
        list.insertFirst(75);
        list.insertFirst(50);
        list.insertFirst(25);
        list.display();
        list.insertAtEnd(99);
        list.display();
        list.insert(101, 3);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLat());
        list.display();
        System.out.println(list.delete(2));
        list.display();
    }
}
