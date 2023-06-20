package java0509.bookShelf;

import java.util.ArrayList;

public class Shelf {
    protected ArrayList<String> shelf;
    public Shelf(){
        shelf = new ArrayList<String>(); //String 안 적어도 괜찮음. 암묵적 허용
    }
    public  ArrayList<String> getShelf(){
        return shelf;
    }
    public int getCount(){
        return shelf.size();
    }
}
