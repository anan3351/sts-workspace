package java0321;

public class MyDate {
    private int day;
    private int month;
    //private int month = 2; 이렇게 값 설정도 가능
    private int year;

    public void setDay(int day){
        if(month == 2){
            if(day < 1 || day > 28){
                System.out.println("날짜형식이 맞지 않습니다.");
            } else {
                this.day = day;
            }
        } else {
            this.day = day;
        }
    }
    public int getDay(){
        return this.day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    } //alt+ins -> get, set 생성
}
