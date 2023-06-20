package java0509;

public abstract class Calculator implements Calc{ //인터페이스 상속시에는 선언이 필요함
    //abstracts 넣어서 일부만 구현
    //인터페이스를 이용해 추상클래스 구현 -> 오버라이딩
    @Override
    public int add(int num1, int num2) {
        return num1+num2;
    }

    @Override
    public int substract(int num1, int num2) {
        return num1-num2;
    }

//    @Override
//    public int times(int num1, int num2) {
//        return num1*num2;
//    }
//
//    @Override
//    public int divide(int num1, int num2) {
//        return num1/num2;
//    }
}
