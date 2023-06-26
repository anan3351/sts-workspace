

interface Predator{ //육식동물 인터페이스, 원래 단독파일로 저장해야함. 아래 있는 클래스들도 마찬가지
    String getFood(); // 메서드 정의만 해두고, 내용은 각 클래스에서 정의

}

class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger extends Animal implements Predator {
    public String getFood() {
        return "apple";
    } //인터페이스의 메서드는 항상 public 으로 구현

} //애니멀을 상속, 인터페이스를 구현(implements)

class Lion extends Animal implements Predator {
    public String getFood() {
        return "banana";
    }
} //애니멀을 상속, 인터페이스를 구현(implements)

class ZooKeeper { //사육사 클래스
    // void feed(Tiger tiger) {  // 호랑이가 오면 사과를 던져 준다.
    //     System.out.println("feed apple");
    // }

    // void feed(Lion lion) {  // 사자가 오면 바나나를 던져준다.
    //     System.out.println("feed banana");
    // } //메소드 오버로딩
    // // 동물별로 feed를 생성해야 한다면 너무 귀찮아짐 -> 인터페이스를 작성

    void feed(Predator predator) {
        System.out.println("feed "+predator.getFood());
    } //인터페이스 적용하면서 feed가 이렇게 수정
    // 이제 동물이 추가 돼도 class Crocodile extends Animal implements Predator {} 처럼 추가만 하면 된다
}

public class Interface {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        zooKeeper.feed(tiger);  // feed apple 출력
        zooKeeper.feed(lion);  // feed banana 출력
    }
}