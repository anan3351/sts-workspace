package java0620;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamTest2 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("C:\\java\\sts-workspace\\java23\\src\\data\\input.txt")){
            int i;
            while ((i = fis.read()) != -1){
                System.out.println(i);
            }
            System.out.println("end");
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
