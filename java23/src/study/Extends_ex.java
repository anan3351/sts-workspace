package study;

class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {  // Animal 클래스를 상속한다.
    Dog() {
    } // 내부에 내용이 없음 -> 디폴트 생성자

    void sleep() {
        System.out.println(this.name+" zzz");
    } // 기능을 확장
}

class HouseDog extends Dog {
    HouseDog(String name) {
        this.setName(name);
    } //메서드명이 클래스명과 동일하고 리턴 자료형을 정의하지 않는 메서드를 !생성자! 라고 한다.
    // 1. 클래스명과 메서드명이 동일하다.
    // 2. 리턴타입을 정의하지 않는다. (void도 사용하지 않는다.)
    // 입력값이 필요함 -> new 키워드로 객체 생성 시 문자열을 전달해야 한다.

    HouseDog(int type) {
        if (type == 1) {
            this.setName("yorkshire");
        } else if (type == 2) {
            this.setName("bulldog");
        }
    } //생성자 오버로딩


    void sleep() {
        System.out.println(this.name + " zzz in house");
    }

    void sleep(int hour) {
        System.out.println(this.name + " zzz in house for " + hour + " hours");
    } // 오버로딩 -> 같은 함수명, 다른 파라미터

} //Dog를 상속받아 구체화 시킴, 오버라이딩(같은 함수명, 다른 기능)

public class Extends_ex {
    public static void main(String[] args) {
        // Dog dog = new Dog();
        // dog.setName("poppy");
        // System.out.println(dog.name);
        // dog.sleep();

        // HouseDog houseDog = new HouseDog();
        // houseDog.setName("happy");
        // houseDog.sleep();  // happy zzz 출력
        // houseDog.sleep(3);  // happy zzz in house for 3 hours 출력

        HouseDog dog = new HouseDog("happy");
        HouseDog dog1 = new HouseDog(1);
        System.out.println(dog.name);
        System.out.println(dog1.name);
    }
}

// 클래스 상속을 위해서는 extends 키워드를 사용한다. Dog 클래스는 Animal 클래스를 상속하게 된다. Dog 클래스에는 name 객체변수와 setName 메소드가 없지만, Animal을 상속받았기에 사용이 가능하다.
