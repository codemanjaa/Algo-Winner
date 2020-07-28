package Advanced.Misc;

import java.util.HashSet;
import java.util.Set;

public class HashTest {
    public static void main(String[] args) {

        Set<String> hash = new HashSet<String>();

        for(String a: args)

            hash.add((a));
        System.out.println(hash.size() + " has unique "+ hash);



    }
}
