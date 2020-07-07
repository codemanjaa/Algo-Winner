package Recursion;

public class RecursiveLinearSearch {

    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70,80,90};

    }

    public static int recurLinearSearch(int arr[], int location, int finder) {

        if (location > arr.length -1){
            return -1;
        }
        else if(arr[location] == finder){
            return location;
        }
        else {
            System.out.println("index at: "+ location);
            return recurLinearSearch(arr, location+1, finder);
        }
    }


}
