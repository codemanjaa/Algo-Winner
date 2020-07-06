package DoublyLinkedList;

public class App {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertFirst(50);
        doublyLinkedList.insertFirst(55);
        doublyLinkedList.insertFirst(99);
        doublyLinkedList.insertFirst(88);
        doublyLinkedList.displayList();
        doublyLinkedList.deleteKey(55);
        doublyLinkedList.deleteKey(50);
        doublyLinkedList.displayList();

    }
}
