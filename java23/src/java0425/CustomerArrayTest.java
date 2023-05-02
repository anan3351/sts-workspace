package java0425;

import java.util.ArrayList;

public class CustomerArrayTest {
    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<>(); //ArrayList는 개수를 정하지 않아도 됨
//        int aa[] = new int[10]; // 배열은 생성 시 개수를 정해야 함

        ArrayList<Integer> iii = new ArrayList<>();
//        int i[] = new int[10]; //line10, line11 같은 의미

        Customer customerLee = new Customer(10010, "이순신");
        Customer customerSin = new Customer(10020, "신사임당");
        Customer customerHong = new Customer(10030, "홍길동");
        Customer customerYul = new Customer(10040, "이율곡");
        Customer customerKim = new CustomerVip(10050, "김유신", 12345);

        customerList.add(customerLee);
        customerList.add(customerSin);
        customerList.add(customerHong);
        customerList.add(customerYul);
        customerList.add(customerKim);

        System.out.println("======고객정보 출력======");
        for(Customer customer : customerList){
            System.out.println(customer.showCustomerInfo());
        }
        System.out.println("size : " + customerList.size());
        System.out.println("customer : " + customerList.get(0).showCustomerInfo());
        // for(Customer ; i < customerList.size();)
        // for(int i=0; i<10; i++) == for(Integer i : i)
    }
}
