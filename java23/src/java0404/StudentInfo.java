package java0404;

public class StudentInfo {
    int studentId;
    private String studentName; //직접적인 접근 불가
    private String grade;
    public int getStudentId(int studentId){
        return this.studentId;
    }
    public void setStudentId(int StudentId) {
//        if (studentId < 10000){
//            this.studentId = 10000;
//        } else {
//            this.studentId = studentId;
//        }
        this.studentName = studentName;
    }

    public String getStudentName(){
        return this.studentName;
    }
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
} // this : 생성된 인스턴스 스스로를 가리키는 예약어. this 멤버 형태로 멤버를 접근할 때 사용
