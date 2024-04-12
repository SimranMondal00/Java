
public class StackMain {
    public static void main(String[] args) throws Exception {
        System.out.println("Customised Stack");
        CustomS stack = new CustomS(4);
        stack.push(7);
        stack.push(6);
        stack.push(5);
        stack.push(1);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
