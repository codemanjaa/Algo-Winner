package BinarySearch;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {

        int iarr[] = generate();
        System.out.println("Enter the value you want to search");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int result = binarySearch(x, iarr);

        if(result != -1){
            System.out.println("Your search located at the "+ result+ " place");
        }
        else {
            System.out.println("NA");
        }

        int arr[] = {10, 20,30,40,50};
        System.out.print(binarySearch(50, arr));

    }

    public static int [] generate(){
        System.out.println("Let's search the integer value: ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of values in your search  ");
        int len = scanner.nextInt();


        if(len >0){
            int arr[] = new int[len];

            for(int i=0; i<len; i++){
                System.out.print("Enter the "+ (i+1) +" value :");
                arr[i] = scanner.nextInt();
            }
            return arr;
        }
        return null;
    }

    public static int binarySearch(int x, int arr[]){

        int result = -1;

        int start = 0;
        int range = arr.length;


        while(start <= range){
            int mid = (start + range)/2;
            if(x == arr[mid]){
                result = mid;
                return result;
            }
            else if (arr[mid] > x) {
                range =mid-1;
            }
            else {
                start = mid+1;
            }

        }
        return result;
    }
}
