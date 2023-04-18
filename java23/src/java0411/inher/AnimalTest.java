package java0411.inher;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        Eagle eagle = new Eagle();
        eagle.fly();
        eagle.eat(); //상속이 필요함 - class명 옆에 extends Animal 입력

        Lion lion = new Lion();
        lion.sleep();

//        super.
    }
}
