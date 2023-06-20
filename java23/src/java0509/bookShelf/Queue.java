package java0509.bookShelf;

public interface Queue {
    void enQueue(String title); //큐에 넣는것
    String deQueue(); //큐에서 빼는것. 선입선출. 먼저 넣은것부터 빠져나옴
    int getSize();
}
