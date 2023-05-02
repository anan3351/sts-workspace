package java0502.abstraceEx;

public abstract class Computer { //abstract-추상클래스
    public abstract void display();
    public abstract void typing(); // abstract를 사용하면 선언만 가능하고 구현{}은 불가능. 선언만 해두고 추후, 상속받아 취향대로 구현
    public void turnOn(){
        System.out.println("Power On");
    }
    public void turnOff(){
        System.out.println("Power Off");
    }
}
