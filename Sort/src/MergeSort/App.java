package MergeSort;

import static MergeSort.MergeSort.sort;

public class App {
    public static void main(String[] args) {
        int arr[] = {10,20,3,4,5,8,9,123,345};
        sort(arr);

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
