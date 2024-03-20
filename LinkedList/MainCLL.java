package LinkedList;

public class MainCLL {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(23);
        list.insert(3);
        list.insert(19);
        list.insert(75);
        list.dispay();
        list.delete(19);
        list.dispay();
    }
}
