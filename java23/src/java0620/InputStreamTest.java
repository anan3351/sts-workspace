package java0620;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("C:\\java\\sts-workspace\\java23\\src\\data\\input.txt");
            System.out.println(fis.read());
            System.out.println(fis.read());
            System.out.println(fis.read());
        } catch (IOException e) {
            System.out.println(e);
            System.out.println("=================================");
            e.printStackTrace(); //윗줄과 마찬가지로 에러 메시지 출력 가능
        } finally {
            try {
                fis.close();
            } catch (NullPointerException | IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("end");
    }
}