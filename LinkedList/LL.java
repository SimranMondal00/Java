package LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }
    public void insertAtEnd(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }
    public void insert(int value, int index){
        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index == size){
            insertAtEnd(value);
            return;
        }
        Node temp = head;
        for(int i=0;i<index;i++){
            temp = temp.next;
        }
        Node node = new Node(value ,temp.next);
        temp.next = node;
        size++;
    }

    public int deleteFirst(){
        int val = head.val;
        Node node = head;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size --;
        return val;
    }
    public int deleteLat(){
        if(size<=1){
            deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.val;
        tail = secondLast;
        tail.next = null;
        return val;
    }
    public Node get(int index){
        Node node = head;
        for(int i=0;i<index;i++){
            node = node.next;
        }
        return node;
    }
    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLat();
        }
        Node prev = get(index-1);
        int val = prev.next.val;
        prev.next = prev.next.next;
        return val;
    }
    public Node find(int value){
        Node node = head;
        while(node!=null){
            if(node.val == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }
public void display(){
    Node temp = head;
    while(temp != null){
        System.out.print(temp.val + "->");
        temp = temp.next; // Move to the next node
    }
    System.out.println("END");
}

    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
