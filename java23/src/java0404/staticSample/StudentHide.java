package java0404.staticSample;

public class StudentHide {
    //private 예제
    private int studentId;
    private String studentName;
    private String studentDepart; //학과
    private String studentAddress;
    private String studentTelNo;
    public StudentHide(){ //생성자

    }
    public String getstudentTelNo() {
        return studentTelNo;
    }

    public void setstudentTelNo(String telNo) {
        this.studentTelNo = studentTelNo;
    }

    public String getStudentMobile() {
        return studentMobile;
    }

    public void setStudentMobile(String studentMobile) {
        this.studentMobile = studentMobile;
    }

    private String studentMobile;
    //getter and setter -> alt+insert
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentDepart() {
        return studentDepart;
    }

    public void setStudentDepart(String studentDepart) {
        this.studentDepart = studentDepart;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    //오버라이드, StringBuffer
//    @Override
//    public String toString(){
//        final StringBuffer sb = new StringBuffer();
//        sb.append("studentId = ").append(this.studentId).append("\n")
//                .append("studentName = ").append(this.studentName).append("\n")
//                .append("studentDepart = ").append(this.studentDepart).append("\n")
//                .append("studentAddress = ").append(this.studentAddress).append("\n")
//                .append("studentTelNo = ").append(this.studentTelNo).append("\n")
//                .append("studentMobile = ").append(this.studentMobile);
//        return sb.toString();
//    } //alt+insert -> tostring()을 선택하면 json 형식으로 출력

    @Override
    public String toString() {
        return "StudentHide{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentDepart='" + studentDepart + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                ", studentTelNo='" + studentTelNo + '\'' +
                ", studentMobile='" + studentMobile + '\'' +
                '}';
    } //json 형식으로 출력
}
