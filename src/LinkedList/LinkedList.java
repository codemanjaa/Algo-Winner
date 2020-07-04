package LinkedList;

public class LinkedList {
    private Node first;

    public LinkedList(){

    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void insertFirst(int data){
        Node node = new Node();
        node.data = data;
        node.next = first;
        first = node;
    }

    public Node deleteFirst(){
        Node temp = first;
        first = first.next;
        return temp;
    }

    public void displayList(){

        System.out.println("List (first --> last) ");
        Node current = first;
        while(current != null){
            current.display();
            current = current.next;
        }
    }

    public void insertLast(int data){
        Node current = first;
        while(current.next!= null){
            current = current.next;
        }
        Node newNode = new Node();
        newNode.data = data;
        current.next = newNode;
    }


}
