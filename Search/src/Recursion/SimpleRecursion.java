package Recursion;

public class SimpleRecursion {
    public static void main(String[] args) {

        reducer(10);
    }
    public static void reducer(int n){
        if(n >= 0){
            reducer(n-1);
        }
        System.out.println("Complete with "+ n);
    }
}
