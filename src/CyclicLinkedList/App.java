package CyclicLinkedList;

public class App {
    public static void main(String[] args) {

        CyclicLinkedList cyclicLinkedList = new CyclicLinkedList();
        cyclicLinkedList.insertFirst(5);
        cyclicLinkedList.insertFirst(10);
        cyclicLinkedList.insertFirst(20);
        cyclicLinkedList.insertFirst(30);
        cyclicLinkedList.insertFirst(40);
        cyclicLinkedList.deleteLast();

        cyclicLinkedList.displayList();
    }
}
