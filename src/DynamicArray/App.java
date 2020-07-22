package DynamicArray;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lets work with Dynamic array...");

        Array array = new Array();
        System.out.println(array.size());
        System.out.println("Enter the value: ");
        String a = scanner.next();
        array.add(a);
        array.add("AI");
        System.out.println(array.toString());
        System.out.println(array.size());
    }

}
