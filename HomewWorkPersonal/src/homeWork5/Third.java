package homeWork5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Third {
    public static void main(String[] args) throws FileNotFoundException {

        try (FileInputStream fis = new FileInputStream("src/homeWork5/textCopy.txt");
             FileOutputStream fos = new FileOutputStream("src/homeWork5/thirdPracticeCopy.txt",true)) {
            while(fis.available()>0){
                int data = fis.read();
                fos.write(data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
