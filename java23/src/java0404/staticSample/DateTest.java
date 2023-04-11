package java0404.staticSample;

public class DateTest {
    public static void main(String[] args) {
        String currentDate = DateUtil.getCurrentDate();
        System.out.println(currentDate);

        String currentMonth = DateUtil.getCurrentMonth();
        System.out.println(currentMonth);

        //메소드 오버로딩
        String currentDate2 = DateUtil.getCurrentDate("yyyy-MM-dd");
        System.out.println(currentDate2);
    }
}