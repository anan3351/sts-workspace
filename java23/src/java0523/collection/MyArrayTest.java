package java0523.collection;

import java.util.ArrayList;

class MyArray<E>{
    private Object[] array = new Object[10];
    int i;
    public void add(E obj){
        array[i++] = obj; //이 타입이 어떤 타입이든 배열 안에 하나씩 넣겠다.
    }
    public E get(int index){
        return (E) array[index];
    }
} //제너릭 형태의 구조를 만든것
public class MyArrayTest {
    public static void main(String[] args) {
        MyArray<String> myArray1 = new MyArray<>(); //호출하는 순간 MyArray는 String형이 된다. /메인에서 선언한 형으로 설정됨
        myArray1.add(new String("test"));
        myArray1.add(new String("test1"));
        String str = myArray1.get(1); //0을 넣으면 test, 1을 넣으면 null이 출력된다. 들어간 배열이 0번뿐이기 때문/값을 추가하면 그 값이 출력된다.
        System.out.println(str);

        MyArray<Integer> myArray2 = new MyArray<>();
        myArray2.add(new Integer(100));
        Integer num = myArray2.get(0);
        System.out.println(num);

        MyArray<ArrayList<String>> myArray3 = new MyArray<>(); //제너릭 안에 제너릭 생성 가능
        ArrayList<String> strList = new ArrayList<>();
        strList.add("ArrayList");
        strList.add("ArrayList2");
        myArray3.add(strList);

        ArrayList<String> strList1 = new ArrayList<>();
        strList1.add("ArrayList3");
        myArray3.add(strList1);

        System.out.println(myArray3.get(0));
        System.out.println(myArray3.get(0).get(0));
        System.out.println(myArray3.get(0).get(1));
        System.out.println(myArray3.get(1).get(0));
    }
}
