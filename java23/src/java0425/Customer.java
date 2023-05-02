package java0425;

public class Customer {
    private int customerId;
    private String customerName;
    protected String customerGrade; //private로 하면 에러발생 - get set 필요
    protected int bonusPoint;
    double bonusRatio;

    public Customer(){ //생성자
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }

    public Customer(int customerId, String customerName){
        this.customerId = customerId;
        this.customerName = customerName;
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }
    public int calPrice(int price){
        bonusPoint += price * bonusRatio;
        return price;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String showCustomerInfo(){
        return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
    }
}
