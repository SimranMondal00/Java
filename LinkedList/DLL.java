package LinkedList;

public class DLL {
    private Node head;

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }
    public void insertLast(int value){
        Node node =new Node(value);
        Node last = head;
        node.next = null;
        if(head == null){
            head.prev = null;
            head = node;
            return;
        }
        while(last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }
    public void insert(int after , int val){
        Node p = find(after);
        if(p == null){
            System.out.println("Node does not exists");
            return;
        }
        Node node = new Node(val);
        node.next = p.next;
        p.next  = node;
        node.prev = p;
        if(node.next != null){
            node.next.prev = node;
        }
    }

    private Node find(int value) {
        Node temp = head;
        while(temp != null){
            if(temp.value == value){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
//        while(temp.prev != null){
//            System.out.print(temp.prev.value + "->");
//            temp.prev = temp.prev.prev;
//        }
//        System.out.println("START");
    }
//    public void displayInReverse(){
//        Node temp = head;
//        while(temp != null){
//            temp = temp.next;
//        }
//       while(temp.prev != null){
//           System.out.print("<-"+temp.prev.value);
//           temp.prev = temp.prev.prev;
//       }
//        System.out.print("START");
//    }
    public class Node{
        int value;
        Node next;
        Node prev;
        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next, Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

}
