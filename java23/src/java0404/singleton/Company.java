package java0404.singleton;

public class Company {
    private static Company instance = new Company();
    private Company(){}

    public static Company getInstance(){
        if(instance == null){ //null이면 하나 생성함 -> 하나의 인스턴스만 가져감 / 아이디가 중복되지 않게하듯
            instance = new Company();
        }
        return instance;
    }
}
