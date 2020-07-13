package MergeSort;

public class MergeSort {


    public static void sort(int inputArr[]) {


        sort(inputArr, 0, inputArr.length-1);
    }

    public static void sort(int arr[], int start, int end) {

        if(end <= start){
            return;
        }
        else{
            int mid = (start + end)/2;
            sort(arr, start, mid);
            sort(arr, mid+1, end);
            merge(arr, start, mid, end);
        }
    }


    public static void merge(int arr[], int start, int mid, int end ) {

        //int i =start; int j = mid; int loc = 0;

        /*for(int a=0; a<arr.length; a++ ){
            if (arr[i] > arr[j]) {
                arr[a] = arr[j];
                j++;
            }
            else if(arr[j] > arr[i]){
                    arr[a] = arr[i];
                    i++;
                }

            }*/

        int tempArray[] = new int[end - start +1];

        int leftSlot = start;
        int rightSlot = mid + 1;
        int loc = 0;

        while(leftSlot <= mid && rightSlot <= end){
            if(arr[leftSlot] < arr[rightSlot]){
                tempArray[loc] = arr[leftSlot];
                leftSlot++;
            }
            else {
                tempArray[loc] = arr[rightSlot];
                rightSlot++;
            }
            loc++;
        }

        if(leftSlot <= mid){
            while(leftSlot <= mid) {
                tempArray[loc] = arr[leftSlot];
                leftSlot++;
                loc++;
            }
        }
        else if(rightSlot <= end){
            while(rightSlot <= end) {
                tempArray[loc] = arr[rightSlot];
                rightSlot++;
                loc++;
            }
        }

        for(int i =0; i<tempArray.length; i++){
            arr[start+i] = tempArray[i];
        }

    }

}

