package Heap;

public class MaxHeap {


    public static void main(String[] args) {
        int container[] = {17,15,9,1,12,3,8};

        //Leftchild = 2n+1 ; rightchild = 2n+2 ; parent location = n-1/2
        for (int i=0; i<container.length; i++){

            if((i*2)+1 <container.length){
                System.out.println(container[i] + " Left child is :"+ container[(i*2)+1]);
            }

            if((i*2)+2<container.length){
                System.out.println(container[i]+ " right child is "+ container[(i*2)+2]);
            }
        }

    }




}
