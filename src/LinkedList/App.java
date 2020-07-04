package LinkedList;

import sun.awt.image.ImageWatched;

public class App {
    public static void main(String[] args) {
       /* Node nodeA = new Node();
        nodeA.data = 4;

        Node nodeB = new Node();
        nodeB.data = 3;

        Node nodeC = new Node();
        nodeC.data = 7;

        Node nodeD = new Node();
        nodeD.data = 8;

        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;

        System.out.println(nodeA.next.data);
        System.out.println(listLength(nodeA));
        */

        LinkedList linkedList = new LinkedList();
        linkedList.insertFirst(10);
        linkedList.insertFirst(5);
        linkedList.insertLast(15);
        linkedList.displayList();

    }

    public static int listLength(Node aNode){

        int length = 0;
        while(aNode != null){
            length++;
            aNode = aNode.next;
        }
        return length;

    }
}
