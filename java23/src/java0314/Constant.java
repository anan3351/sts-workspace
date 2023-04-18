package java0314;

public class Constant {
    public static void main(String[] args) {
        final int MAX_STUDENT_NUM = 30; //상수 선언 - final 키워드 사용, 선언시 초기값 지정, 실행 중 값 변경 불가
        final int MAX_NUM = 100;        // 값 할당은 한번만 가능함
        final int MIN_NUM;

        int count = 30;

        MIN_NUM = 0;
        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);
        System.out.println(count);

        if (count == MAX_STUDENT_NUM){
            System.out.println("TRUE");
        }

        String str = "30";
        String str2 = "30";
        if (str == str2){
            System.out.println("TRUE");
        }
    }
}
