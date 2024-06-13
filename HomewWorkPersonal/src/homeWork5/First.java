package homeWork5;

import java.io.*;
import java.nio.charset.Charset;

public class First {
    static int counter;

    public static void main(String[] args) {
        String line;


        try (FileInputStream fis = new FileInputStream("src/homeWork5/textCopy.txt");
             InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
             BufferedReader br = new BufferedReader(isr)) {
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                counter++;
            }
            System.out.println("here is " + counter + " lines");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
