package java0404.singleton;

public class CompanyTest {
    public static void main(String[] args) {
        Company company1 = Company.getInstance(); // 이미 생성했기 때문에 get으로 받아옴
        Company company2 = Company.getInstance();

        System.out.println(company1);
        System.out.println(company2); //메모리가 같음 => 주소가 같음

        System.out.println(company1 == company2);
    }
}
