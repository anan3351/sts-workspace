package java0404.staticSample;
/*
        int s = 0;
        if(조건){
            s = a
        } else{
            s = b
        }
        // 이걸 간단히 표현한게 삼항연산자 -> (조건) ? a : b; 조건이 맞으면 a, 맞지 않으면 b가 출력
 */
public class Calc {
    public static int abs(int a){
        return a > 0 ? a : -a; // a가 0보다 크면 a를 반환, 작으면 -a를 반환.
    }
    public static int max(int a, int b){
        return a > b ? a : b;
    }

    public static int min(int a, int b){
        return a < b ? a : b;
    }
}