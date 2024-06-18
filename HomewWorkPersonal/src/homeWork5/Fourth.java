package homeWork5;
import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Fourth {
    public static void main(String[] args) throws IOException {

        List<File> files = Arrays.asList(new File("src/homeWork5/file1.txt")
                , new File("src/homeWork5/file2.txt"));
        try (FileOutputStream fos = new FileOutputStream("src/homework5/fourthFile3.txt", true)) {
            byte[] buf = new byte[200];
            for (File file : files) {
                try (FileInputStream fis = new FileInputStream(file)) {
                    int b = 0;
                    while ((b = fis.read(buf)) != -1) {
                        fos.write(buf, 0, b);
                    }
                }
            }
        }
    }
}
