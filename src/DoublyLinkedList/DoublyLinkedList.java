package DoublyLinkedList;

public class DoublyLinkedList {
  private Node first;
  private Node last;

    public DoublyLinkedList(){

        this.first = null;
        this.last = null;
    }

    public boolean isEmpty(){
        return this.first == null;
    }

    public void insertFirst(int data){
        Node node = new Node();
        node.data = data;

        if(isEmpty()){

            last = node;
        }
        else{
            first.previous = node;
        }
        node.next = first;
        this.first = node;
    }

    public void insertLast(int data){
        Node node = new Node();
        node.data = data;

        if(isEmpty()){
            first = node;
        }
        else{
           last.next = node;
           node.previous = last;
        }
        last = node;
    }

    public Node deleteFirst(){

        Node temp = first;
        if(first.next == null){
            last = null;
        }
        else{

            first.next.previous = null;
        }
        first = first.next;
        return temp;
    }

    public Node deleteLast(){

        Node temp = last;
        if(last.previous == null){
            first = null;
        }
        else{
            last.previous.next = null;
        }
        last = last.previous;
        return temp;
    }

    public boolean insertAfter(int key, int data){

        Node node = new Node();
        node.data = data;

        Node current = first;

        while(current.data != key){

            current = current.next;

            if( current == null){
                return false;
            }
        }
        if(current == last){
            current.next = null;
            last = node;
        }
        else {

            node.next = current.next;
            current.next.previous = node;
        }

        node.previous = current;
        current.next= node;
        return true;
    }

    public Node deleteKey(int key){

        Node current = first;

            while(current.data != key){
                current = current.next;

                if(current == null){
                    System.out.println("Empty nothing to delete");
                    return null;
                }
            }
            if(current == first){
                first = current.next;
            }
            else{
                current.previous.next = current.next;
            }
            if(current == last){
                last = current.previous;
            }
            else {
                current.next.previous = current.previous;
            }
            return current;

    }

    public void displayList(){
        System.out.printf("{ ");
        Node current = first;
        while(current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println("}");
    }
}

