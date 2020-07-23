package Advanced.Stack;

public class StackApp {
    public static void main(String[] args) {
        System.out.println("Stack with LinkedList");
        Stack stack = new Stack();
        System.out.println(stack.isEmpty());
        stack.push("One");
        stack.push("Two");
        System.out.println(stack.size());
        System.out.println(stack.iterator());
    }
}
