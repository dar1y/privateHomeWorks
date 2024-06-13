import java.io.*;

public class FilePractice {
    public static void main(String[] args) {
        try( FileInputStream fos = new FileInputStream("src/text.txt")){
            BufferedInputStream buInStr = new BufferedInputStream(fos,200);
            int i;
            while((i=buInStr.read())!=-1){
                System.out.print((char)i);
            }
        }  catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
