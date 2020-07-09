package Recursion;

public class RecursiveBinarySearch {

    public static void main(String[] args) {

        int arr[] = {10,20,30,40,50,55,60,70,80,90};
        int finder = 60;
        int result = recursiveBinary(arr, finder, 0, arr.length-1);
        System.out.println(result);

    }

    public static int recursiveBinary(int arr[], int finder, int start, int range){
        System.out.println("[ "+start+"... "+range+" ]");

        if(start > range){
            return -1;
        }
        else {
            int mid = (start+range)/2;
            if(arr[mid] == finder){
                return mid;
            }
            else if(arr[mid] > finder){
                range = mid - 1 ;
                System.out.println("Starting with new range..."+ range);
                return recursiveBinary(arr, finder,start,range);
            }
            else{
                start = mid + 1;
                System.out.println("Starting with new start at "+ start);
                return recursiveBinary(arr, finder,start,range);
            }

        }

    }
}
