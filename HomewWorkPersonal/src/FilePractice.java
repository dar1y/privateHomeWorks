import java.io.*;

public class FilePractice {
    public static void main(String[] args) {
         try {
             FileInputStream fos = new FileInputStream("src/text.txt");
             if(fos.available()>0){
                 BufferedInputStream buInStr = new BufferedInputStream(fos, 200);
                 int i;
                 while ((i = buInStr.read()) != -1) {
                     System.out.print((char) i);
                 }
             }else {
                 System.out.println("the file is empty");
             }

         }catch(FileNotFoundException e){
             System.out.println("file not found here " );
             e.printStackTrace();
         } catch (IOException e) {
             throw new RuntimeException(e);
         }
    }
}
