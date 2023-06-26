package java0620;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\java\\javaimsi\\zoom\\newFile.txt");
        file.createNewFile(); //파일이 없다면 새로 생성

        File file2 = new File("C:\\java\\javaimsi\\zoom\\aaa"); //폴더 생성도 가능
        file2.mkdir();

        File file3 = new File("C:\\java\\javaimsi\\zoom2\\log");
        file3.mkdirs(); //여러개의 폴더 생성

        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());

//        file.delete(); //파일삭제
    }
}
