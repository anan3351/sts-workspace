package java0404.cooperation;

public class TakeTrans {
    public static void main(String[] args) {
        Student studentJames = new Student("James", 5000);
        Student studentTomas = new Student("Tomas", 5000);

        Bus bus = new Bus(100);
        Subway subway = new Subway("2호선");

        studentJames.takeBus(bus);
        studentJames.showInfo();
        bus.showInfo();
        System.out.println();

        studentJames.takeSubway(subway);
        studentJames.showInfo();
        subway.showInfo();
        System.out.println();

        studentTomas.takeSubway(subway);
        studentTomas.showInfo();
        subway.showInfo();
        System.out.println();

        // Subway subway = new Subway("2호선")
        studentJames.takeBus(bus);
        studentJames.showInfo();
        bus.showInfo();
    } //시험문제
}
