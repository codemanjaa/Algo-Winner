package Hash;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the hash table size: ");
        int size = scanner.nextInt();
        Hash test = new Hash(size);

        //TODO
        System.out.println("Training data");
        Hash hash = new Hash(19);
        hash.insert("Apple");
        hash.insert("Hello");
        hash.insert("Feeling");
        hash.insert("Water");
        hash.insert("Africa");
        hash.insert("Speed");
        hash.insert("Phone");
        hash.insert("September");
        hash.insert("Michael");
        hash.insert("Milk");
        hash.insert("Huge");
        hash.insert("Apple");
        hash.insert("Dogs");


        System.out.println("Locate the words   ");
        System.out.println(hash.find("Apple"));

    }
}
