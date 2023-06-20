package java0509.bookShelf;

public class BookSelfEx {
    public static void main(String[] args) {
        Queue shelfQueue = new BookSelf();
        shelfQueue.enQueue("태백산맥 1");
        shelfQueue.enQueue("태백산맥 2");
        shelfQueue.enQueue("태백산맥 3");
//        System.out.println(shelfQueue.getSize());
        System.out.println(shelfQueue.deQueue());
        System.out.println(shelfQueue.deQueue());
        System.out.println(shelfQueue.deQueue());

    }
}
