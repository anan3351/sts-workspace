package java0425;

import java.util.Arrays;
//중간고사 해설
public class Midterm {

    public static void numCheck(int num[]){
        int intArray[] = new int[20]; //0~9까지 검사하려고 빈 공간 생성 = {0,0,0,0,0,0,0,0,0,0}
        for(int i=0; i<num.length; i++){
//            for(int j = 0; j<10; j++){
//                if(num[i] == j){
//                    intArray[j]++; //j값이 2이상 나오면 false
//                }
//            }
//            int result = ++intArray[num[i]];
//            System.out.println(result);
            ++intArray[num[i]];
        }
        boolean bool = true;
        for(int k=0; k<intArray.length; k++){
            if(intArray[k]>1){
                bool = false;
                break;
            }
        }
        System.out.println(Arrays.toString(num) + " : " + bool);
    }

    public static void main(String[] args) {
        int l1[] = {0,1,2,3,4,5,6,7,8,9};
        int l2[] = {1,2,5,0,1,2,3,4,5,6,7,8,9};
        int l3[] = {0,1,2,9,9,5,6,7,8,9};
        int l4[] = {0,1,2,3,8,9};
        int l5[] = {5,6,7,8,9};

        numCheck(l1);
        numCheck(l2);
        numCheck(l3);
        numCheck(l4);
        numCheck(l5);
    }
}
