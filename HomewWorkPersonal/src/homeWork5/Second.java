package homeWork5;

import java.io.*;

public class Second {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("newSecondText.txt", true)) {
            String line = "this is new string";
            int i;
            char ch[] = line.toCharArray();
            for (i = 0; i < line.length(); i++) {
                fos.write(ch[i]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
