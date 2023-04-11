package java0404;

public class Student {
    int studentId;
    String studentName;
    String grade;
    public String getStudentName(){
        return studentName; //클래스에 선언된 변수 사용
    }
    public  void setStudentName(String name){
        studentName = name; //name -> Student 클래스의 studentName에 name 삽입
    }
    public static void main(String[] args) {
        Student student = new Student(); //디폴트 생성자
        student.studentName = "홍길동";
        System.out.println(student.studentName);
        System.out.println(student.getStudentName());

    }
}
