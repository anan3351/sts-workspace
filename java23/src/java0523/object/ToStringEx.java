package java0523.object;

class Book{
    int bookNumber;
    String bookTitle;
    Book(int bookNumber, String bookTitle){
        this.bookNumber = bookNumber;
        this.bookTitle = bookTitle;
    }
    @Override //명시적으로 해놔야 혼란이 덜함
    public String toString(){
        return bookTitle + ", " + bookNumber;
    } //이 부분이 사라지면 주소값 반환 => 기존 toString()이 실행됨
}
public class ToStringEx {
    public static void main(String[] args) {
        Book book1 = new Book(200, "명품자바");

        System.out.println(book1);
        System.out.println(book1.toString());
    }
}
