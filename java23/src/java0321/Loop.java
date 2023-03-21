package java0321;

public class Loop {
    public static void doWhileEx(){
        int num = 1;
        int sum = 0;
        do{
            sum += num;
            num++;
        } while (num <= 10);
        System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
        // do while과 while의 차이 -> do의 내용을 먼저 실행 후 while문을 실행
        // 어떤 조건이 오더라도 반드시 한번은 실행함(while은 조건 부합하지 않으면 실행하지 않고 종료)
    }

    public static void forEx(){
        int sum = 0;
        for (int i=0; i<11; i++){
            sum += i;
        }
        System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
    }

    public static void for_(){
        for(int i=2; i<10; i++){
            for(int j=1; j<10; j++){
                System.out.println(i+" * "+j+" = "+i*j);
            }
            System.out.println();
        }
    } //구구단

    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        while (num <= 10){
            sum += num;
            num++;
        }
        System.out.println("1부터 10까지의 합은 " + sum + "입니다.");

        doWhileEx();
        forEx();
        for_();
    }
}
