package BST;

public class App {
    public static void main(String[] args) {
        BST tree = new BST();

        tree.insert(10, "This is ten");
        tree.insert(20, "Twenty");
        tree.insert(30, "Thirty");
        tree.insert(5, "Five");

        System.out.println(tree.findMax().key);
        System.out.println(tree.findMin().value);
    }
}
