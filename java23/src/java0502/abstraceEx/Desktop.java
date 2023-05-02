package java0502.abstraceEx;

public class Desktop extends Computer{ //에러 발생 -> 반드시 선언만 해둔 메소드를 구현해야함
    @Override
    public void display() {

    }

    @Override
    public void typing() {

    }
    @Override
    public void turnOff() {
        System.out.println("ffffffffff");
    }
}
