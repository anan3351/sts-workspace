package java0404;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "김유신";
        person.height = 180.0f;
        person.weight = 85.5f; //변수별로 선언

        Person personKim = new Person("김춘추");
        Person personLee = new Person("이순신", 180, 80.1f); //한줄로 선언

        System.out.println(person);
        System.out.printf(personKim.name);
        System.out.printf(personLee.name);
    }
}
