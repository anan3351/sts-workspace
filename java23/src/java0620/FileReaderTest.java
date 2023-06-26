package java0620;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("C:\\java\\sts-workspace\\java23\\src\\data\\reader.txt")){
            int i;
            while ((i = fr.read()) != -1){
                System.out.println((char) i);
            }
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
