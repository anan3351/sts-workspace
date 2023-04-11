package java0404;

public class Person {
    String name;
    float height;
    float weight;

    public Person(){ //클래스명을 함수화 시킴 / 디폴트 생성자

    }
    public Person(String pName){
        name = pName;
    }
    public Person(String pName, float pHeight, float pWeight){
        name = pName;
        height = pHeight;
        weight = pWeight;
    }
    // 모든 클래스에 메인이 필요하진 않음
}
