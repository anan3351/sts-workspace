package java0502.array;

//java bean
public class Book {
    private String bookName;
    private String author; //저자
    public Book(){}//생성자 구현
    public Book(String bookName, String author){
        this.bookName = bookName;
        this.author = author;
    }

    public String getBookName() {
        return this.bookName; //this를 넣음으로서 어디에 있는 변수인지를 명확히 지정함/어느 클래스에 있는 변수인지
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void showBookInfo(){
        System.out.println(bookName + ", " + author);
    }
}
