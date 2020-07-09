package SelectionSort;

public class SelectionSort {
    public static void main(String[] args) {

        int arr[] = {100,200,300,90,80,70,60,50};
        //int arr[] = {1000,200,300};
        int res[] = sortSelection(arr);

        for(int i=0; i<res.length; i++){

            System.out.print(res[i]+ " ");
        }
    }

    public static int[] sortSelection(int arr[]){


        for (int out=0; out<arr.length; out++){
            int min = out;
            int inner;
            for(inner = out; inner<arr.length; inner++){

                if(arr[min] > arr[inner]){
                    min = inner;
                }
            }
            int temp = arr[out];
            arr[out] = arr[min];
            arr[min] = temp;

        }
        return arr;
    }
}
