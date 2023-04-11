package java0404.staticSample;

public class StudentNumber {
    public static int serialNum = 1000;
    public int studentId;
    private String studentName;
    private int grade;
    private String address;

    public StudentNumber(){ // 생성자. 생성하자마자 학번 자동부여.
        serialNum++; // 중복값이 나오지 않음
        studentId = serialNum;
    }
    public String getStudentName(){
        return this.studentName;
    }
    public void setStudentName(String name){
        this.studentName = name;
    }
}

