package homeWork6;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class work5 {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("src/homeWork6/userText.txt")) {
            System.out.println("please enter the text for saving in the txt file");
            String line = sc.nextLine();
            int i;
            char ch[] = line.toCharArray();
            for (i = 0; i < line.length(); i++) {
                fos.write(ch[i]);
            }
            System.out.println("file has been saved");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
