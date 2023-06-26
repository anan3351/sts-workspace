package java0620;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
    public static void main(String[] args) {
        try(InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\java\\sts-workspace\\java23\\src\\data\\reader.txt"))){
            //파일인풋스트림으로 읽은 파일(->파라미터)을 인풋스트림리더(보조)로 넘겨준다. 파일인풋스트림으로 읽을땐 깨졌지만, 인풋스프림리더를 거치면서 정상출력이 된다.
            int i;
            while ((i = isr.read()) != -1){
                System.out.println((char) i);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
