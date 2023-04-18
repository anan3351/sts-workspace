package java0314;

public class First {
    public static int sum(int n, int m) { //스태틱 메서드. -> 객체생성없이 메서드 직접호출 가능
        int s = n+m;
        return s;
    }
    public static void main(String[] args) {
        int i = 20;
        int s;

        s = sum(i, 20);
        System.out.println("합은 " + s + "입니다.");

        char a = '가'; // ""는 string에 사용
        System.out.println(a);

        String str = "안녕하세요?";
        System.out.println(str);
    }
}
