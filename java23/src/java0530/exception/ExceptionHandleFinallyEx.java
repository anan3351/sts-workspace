package java0530.exception;

import java0523.object.Person;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandleFinallyEx {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("a.txt"); //에러발생
        } catch (FileNotFoundException e) {
            System.out.println(e);
            return;
        } finally {
            if(fis != null){
                try{
                    fis.close(); //에러발생 -> Exception 던지도록
                } catch(IOException e){
                    e.printStackTrace();
                }
            }
            System.out.println("항상 수행됩니다.");
        }
        System.out.println("여기서도 수행됩니다.");
    }
}
