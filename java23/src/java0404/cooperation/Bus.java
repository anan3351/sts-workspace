package java0404.cooperation;

public class Bus {
    private int busNumber;
    private int passengerCount;
    private int money;
    public Bus(int busNumber){
        this.busNumber = busNumber;
    }
    public void take(int money){
        this.money += money;
        passengerCount++;
    }
    public void showInfo(){
        System.out.println(busNumber + "번 버스의 " + "승객은 " + passengerCount + "명이고, 수입은 " + money + "원 입니다.");
    }
}