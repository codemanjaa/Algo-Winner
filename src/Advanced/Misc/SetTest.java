package Advanced.Misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class SetTest {
    public static void main(String[] args) {
        Set<String> wordList = Arrays.asList(args).stream()
                .collect(Collectors.toSet());
        System.out.println(wordList.size() + " unique word "+ wordList);
    }
}
