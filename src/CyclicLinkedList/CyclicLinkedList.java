package CyclicLinkedList;

public class CyclicLinkedList {

    private Node first;
    private Node last;

    public CyclicLinkedList(){
        first = null;
        last = null;
    }

    public boolean isEmpty(){
        return this.first == null;
    }

    public void insertFirst(int data){
        Node aNode = new Node();
        aNode.data = data;

        if(isEmpty()){
            last = aNode;
        }

            aNode.next = first;
            first = aNode;
    }

    public void insertLast(int data){
        Node node = new Node();
        node.data = data;

        if(isEmpty()){
            first = node;
        }
        else {
            last.next = node;
            last = node;
        }


    }

    public int deleteFirst(){

        int temp = first.data;

        if(first.next == null){
            last = null;
        }
        first = first.next;
        return temp;
    }

    public void displayList(){
        System.out.println("List (First ---> Last) ");
        Node current = first;

        while (current != null){
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

    public int deleteLast() {

        int temp=0;
        Node nLast = null;
        if (last != null) {
            temp= last.data;
            Node current = first;

            while (current != null) {
                if (current.next == last) {

                    nLast = current;
                    current.next = null;
                    break;
                }
                else {
                    current = current.next;
                }

            }

            System.out.println("====="+ last.data);




        }
        last = nLast;
        return temp;

    }



}
