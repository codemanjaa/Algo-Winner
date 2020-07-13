package BST;

import java.util.Objects;

public class BST {

    private Node root;


    public void insert(int key, String value){
        Node newNode = new Node(key, value);

        if(root == null){
            root = newNode;
        }
        else{
            Node current = root;
            Node parent;

            while(true){
                parent = current;
                if(key < current.key){
                    current = current.leftChild;
                    if(current == null){
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if(current == null){
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }


        }
    }

    public Node findMin(){

        Node current = root;
        Node last = null;

        while(current != null){
            last = current;
            current = current.leftChild;
        }
        return last;
    }

    public Node findMax(){
        Node current = root;
        Node last = null;

        while(current != null){
            last = current;
            current = current.rightChild;
        }
        return last;
    }

    public boolean delete(int key) {
        Node current = root;
        Node parent = root;
        boolean isLeftChild = false;


        while (current.key != key) {
            parent = current;

            if (key < current.key) {
                isLeftChild = true;
                current = current.leftChild;
            } else {
                current = current.rightChild;
                isLeftChild = false;
            }
            if (current == null) {
                return false;
            }

        }

        Node delNode = current;

        //if node is leaf

        if(delNode.leftChild == null && delNode.rightChild == null){
            if(delNode == root){
                root = null;
            }
            else if(isLeftChild){
                parent.leftChild = null;
            }
            else {
                parent.rightChild = null;
            }
        }
        else if(delNode.rightChild == null){
            if(delNode == root){
                root = delNode.leftChild;
            }
            else if(isLeftChild){
                parent.leftChild = delNode.leftChild;
            }
            else {
                parent.rightChild = delNode.leftChild;
            }
        }

        else if(delNode.leftChild == null){
            if(delNode == root){
                root = delNode.rightChild;
            }
            else if(isLeftChild){
                parent.leftChild = delNode.rightChild;
            }
            else{
                parent.rightChild = delNode.rightChild;
            }
        }
        else {

            Node successor = getSuccessor(delNode);

            // Connect parent of node todelete to successor instead
            if(delNode == root){
                root = successor;
            }
            else if(isLeftChild){
                parent.leftChild = successor;
            }
            else{
                parent.rightChild = successor;
            }
            successor.leftChild = delNode.leftChild;

        }

        return true;

    }

    private Node getSuccessor(Node dellNode){
        Node successorParnet = dellNode;
        Node successor = dellNode;

        Node current = dellNode.rightChild; // Get the right chiled

        while(current != null){ // start going left down the tree
            successorParnet=successor;
            successor = current;

            current = current.leftChild;
        }

        if(successor != dellNode.rightChild){
            successorParnet.leftChild = successor.rightChild;
            successor.rightChild = dellNode.rightChild;
        }
        return successor;

    }

}


        /*while(current != null){


            if(current.key > key){
                current = current.leftChild;
                if(current.key == key){
                    current.leftChild = null;
                }

            }
            else {
                current = current.rightChild;
                if(current.key == key){
                    current.rightChild = null;
                }


            }
        }
*/

        // node has one child

        // node has two child

