package java0530.exception;

public class ArrayExceptionHandlingEx {
    public static void main(String[] args) {
        int[] arr = new int[5];

        try{
            for (int i=0; i<=5; i++){
                arr[i] = i;
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
//            e.printStackTrace(); // 에러메시지 출력됨
            System.out.println("예외처리부분");
        }
        System.out.println("프로그램 종료"); // array가 다섯개 잡혀있는데, 0~5, 6개를 출력시켜서 나는 에러
    }
}
