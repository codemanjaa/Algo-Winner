package Heap;

public class Heap {

    private Node[] heapArray;
    private int maxSize;
    private int currentSize;

    public Heap(int maxSize) {
        this.maxSize = maxSize;
        currentSize = 0;
        heapArray = new Node[maxSize];
    }

    public int getSize() {
        return currentSize;
    }

    public boolean isEmpty() {

        return (currentSize == 0);
    }

    public boolean insert(int key) {

        if (currentSize == maxSize) {
            return false;
        }

        Node newNode = new Node(key);
        heapArray[currentSize] = newNode;

        trickleup(currentSize);

        currentSize++;
        return true;
    }

    public void trickleup(int index) {

        int parentIndex = (index - 1) / 2;
        Node nodeToInsert = heapArray[index];


        while (index > 0 && heapArray[parentIndex].getKey() < nodeToInsert.getKey()) {
            heapArray[index] = heapArray[parentIndex];
            index = parentIndex;
            parentIndex = (parentIndex - 1) / 2;
        }
        heapArray[index] = nodeToInsert;
    }


    public Node remove() {

        Node root = heapArray[0];
        heapArray[0] = heapArray[--currentSize];
        trickeDown(0);

       /* int index = 0;
        Node lastNode = heapArray[currentSize];
        int leftIndex = (2*index)+1;
        int rightIndex = (2*index)+2;
        heapArray[index] = lastNode;

        while( heapArray[leftIndex].getKey() > lastNode.getKey() || heapArray[rightIndex].getKey() > lastNode.getKey()){

            if(heapArray[leftIndex].getKey() > heapArray[rightIndex].getKey()){
                heapArray[index] = heapArray[leftIndex];
            }
            else{
                heapArray[index] = heapArray[rightIndex];
            }
        }

        */

       return root;

    }

    private void trickeDown(int index){

        int bigChildIndex;
        Node top = heapArray[index];

        while( index < currentSize/2){

            int leftChildIndex = (2 * index)+1;
            int rightChildIndex = (2 * index)+2;

            if(rightChildIndex < currentSize && heapArray[leftChildIndex].getKey() < heapArray[rightChildIndex].getKey()){

                bigChildIndex = rightChildIndex;
            }
            else {
                bigChildIndex = leftChildIndex;
            }
            heapArray[index] = heapArray[bigChildIndex];
            index = bigChildIndex;

            if(top.getKey() >= heapArray[bigChildIndex].getKey()){
                break;
            }
        }
        heapArray[index] = top;
    }

    public void displayHeap() {

        System.out.println("Printing the hepa");

        for(int i=0; i<currentSize; i++){
            if(heapArray[i] != null){
                System.out.print(heapArray[i].getKey()+ " ");
            }
            System.out.println();

            int nBlanks = 32;
            int itemPerRow = 1;
            int column = 0;
            int item = 0;

            String dash = "-----------------------------------------";

            System.out.println(dash+dash);

            while(currentSize >0){
                if(column == 0){
                    for(int k = 0; k<nBlanks; k++){
                        System.out.print(" ");
                    }
                }
                System.out.print(heapArray[item].getKey());
                item++;
                if(item == currentSize){
                    break;
                }
                column++;
                if(column == itemPerRow){
                    nBlanks = nBlanks/2;
                    itemPerRow = itemPerRow * 2;
                    column = 0;
                    System.out.println();

                }else {
                    for(int k=0; k<nBlanks*2; k++){
                        System.out.print(" ");
                    }

                }
            }
            System.out.println();
        }


    }

}
