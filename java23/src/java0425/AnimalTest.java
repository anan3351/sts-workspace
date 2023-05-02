package java0425;

class Animal{
    public void move(){
        System.out.println("동물이 움직입니다.");
    }
}
class Human extends Animal{
    @Override
    public void move(){
        System.out.println("사람이 두 발로 걷습니다.");
    }
}
class Tiger extends Animal{
    @Override
    public void move(){
        System.out.println("호랑이가 네 발로 뜁니다.");
    }
}
class Eagle extends Animal{
    @Override
    public void move(){
        System.out.println("독수리가 하늘을 납니다.");
    }
}
public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest animalTest = new AnimalTest();
         // Animal animal = new Human();
        // animalTest.moveAnimal(animal); // line29~30 = line31과 같음
        animalTest.moveAnimal(new Human());
        animalTest.moveAnimal(new Tiger());
        animalTest.moveAnimal(new Eagle());
    }
    public void moveAnimal(Animal animal){
        // 선언한 클래스 형이 아닌 생성된 인스턴스의 메서드 호출 : virtual method
        animal.move();
    }
}
