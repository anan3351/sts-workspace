package java0404.staticSample;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {
    public static String getCurrentDate(){
        String localDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        //LocalDateTime도 클래스지만 new를 사용할 필요가 없음
        return localDate;
    }
    public static String getCurrentMonth(){
        String localDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM"));
        return localDate;
    }
    public static String getCurrentDate(String pattern){ //메소드 오버로딩.
        // 출력할 때 날짜 형식을 전달받음
        String localDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern(pattern));
        return localDate;
    }


}
