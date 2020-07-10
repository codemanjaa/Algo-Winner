package InsertionSort;

public class InsertionSort {
    public static void main(String[] args) {

        int arr[] = {900,8,99,110,8,87,637,8,3,13,87,12,99};
       int res[] = sortInsertion(arr);

        System.out.print("[ ");
       for(int i=0; i<res.length; i++){
           System.out.print( res[i]+ " ");
       }
        System.out.print("]");
    }

    public static int[] sortInsertion(int arr[]){

        for(int out=1; out<arr.length; out++){
            for(int inner = out; inner > 0; inner--) {
                if(arr[inner] < arr[inner-1]){
                    int temp = arr[inner-1];
                    arr[inner-1] = arr[inner];
                    arr[inner] = temp;
                }

            }
        }
        return  arr;
    }
}
