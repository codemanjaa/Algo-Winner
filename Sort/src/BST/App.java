package BST;

public class App {
    public static void main(String[] args) {
        BST tree = new BST();

        tree.insert(10, "This is ten");
        tree.insert(20, "Twenty");
        tree.insert(15, "Thirty");
        tree.insert(5, "Five");

        System.out.println(tree.findMax().key);
        System.out.println(tree.findMin().value);

        System.out.println(tree.delete(10));
        System.out.println(tree.findMin().key);

        tree.printTree();
    }
}
