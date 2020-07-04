package test;

import java.util.Scanner;

public class Fabianocci {

    public static void main(String[] args) {

        System.out.print("Enter the integer value for print the Fabionacci numbers : ");
        Scanner scanner = new Scanner(System.in);
        int range = scanner.nextInt();

        int start =0, next = 1;

        while (start < range) {
            System.out.println(start);
            int temp = next;
            next = (start + next);
            start = temp;
        }

    }
}
