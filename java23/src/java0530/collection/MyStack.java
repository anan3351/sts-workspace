package java0530.collection;

import java.util.ArrayList;

public class MyStack {
    private ArrayList<String> arrayStack = new ArrayList<>();
    public void push(String data){
        arrayStack.add(data);
    }
    public String pop(){
        int len = arrayStack.size();
        if(len == 0){//사이즈가 0이라는건 쌓인 스텍이 없다는 것
            System.out.println("스택이 비었습니다.");
            return null;
        }
        return (arrayStack.remove(len-1));
    }
}
