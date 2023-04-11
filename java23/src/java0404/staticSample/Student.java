package java0404.staticSample;

public class Student {
    public static int serialNum = 1000;
    public int studentId;
    public String studentName;
    public int grade;
    public String address;
    public String getStudentName(){
        return studentName;
    }
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
    public static void main(String[] args) {
    }
}
