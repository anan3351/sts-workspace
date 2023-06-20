package java0509;

public class Constant {
    int num = 10;
    final int NUM = 200; //상수는 대문자를 주로 사용함->일반변수와 구분 목적
    public static void main(String[] args) {
        Constant cons = new Constant();
        cons.num = 50;
//        cons.NUM = 200; //상수는 값변경 불가능
        System.out.println(cons.num);
        System.out.println(cons.NUM);
    }
}
