package java0314;

public class DataType {
    public static void main(String[] args) {
        int num = 15; //10진수
        int num2 = 015; //8진수
        int num3 = 0x15; //16진수(21)
        int num4 = 0b0101; //2진수(5)

        long lnum = 24L; //소문자 l은 1과 헷갈릴 수 있어 대문자 사용
        long lnum2 = 24L;

        double dnum = 0.1245;
        double dnum2 = 1234E-4; //1234*18^-4 = 0.1234

        float fnum = 0.123f;
        double dnum3 = .1245; //0.1234와 동일

        char a = 'W';
        char b = '글';

        //boolean
        boolean isBoolean = true;
        boolean isTrue = 10 > 0; //불린타입에는 변수명에 is를 붙이는게 암묵적인 규칙

        System.out.println(isTrue);

        String str = null;

    }
}
