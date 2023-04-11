package java0404.staticSample;

public class StudentHideTest {
    public static void main(String[] args) {
        StudentHide studentHide = new StudentHide();

        studentHide.setStudentId(22077001);
        studentHide.setStudentName("김정현");
        studentHide.setStudentDepart("인공지능 학부");
        studentHide.setStudentAddress("서울시 강북구 노해로 8길");

        studentHide.getStudentAddress();

        System.out.println(studentHide.toString());

        StudentHide studentHide1 = new StudentHide();
        studentHide1.setStudentName("이순신");
        System.out.println(studentHide1.toString());
    }
}
