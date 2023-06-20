package java0530.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException{
        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className);
        return c;
    }
    public static void main(String[] args) {
        ThrowsExceptionEx test = new ThrowsExceptionEx();
        try {
            test.loadClass("a.txt", "java.lang.String");
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace(); //맨 마지막에는 반드시 최상위 클래스를 적어야한다.
        }
    }
}
