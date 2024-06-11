package homeWork4.fourth;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class FileReaderMain {
    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> wordsMap = new HashMap<>();
        List<String> listOfWords;

        String expression = new String(Files.readAllBytes(Paths.get("src/homeWork4/fourth/text.txt")), StandardCharsets.UTF_8);

        listOfWords = Arrays.asList(expression.split(" "));

        for (String s : listOfWords) {
            if (!wordsMap.containsKey(s.toLowerCase())) {
                wordsMap.put(s.toLowerCase(), 1);
            } else {
                wordsMap.put(s.toLowerCase(), wordsMap.get(s.toLowerCase()) + 1);
            }
        }
        for (Map.Entry entry : wordsMap.entrySet()) {
            System.out.println(entry);
        }

    }
}
