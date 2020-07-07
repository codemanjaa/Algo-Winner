package LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {

        int arr[] = {10,20,30,40,50,60};
        System.out.println(linerSearch(arr, 10));
    }

    public static int linerSearch(int arr[], int x ){

        int result = -1;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                result = i;
            }
        }
        return result;
    }
}
