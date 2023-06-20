package java0530.collection;

public class Member {//회원가입 관련 테이블
    private int memberId;
    private String memberName;
    public Member(int memberId, String memberName){
        this.memberId = memberId;
        this.memberName = memberName;
    }
    public int getMemberId(){
        return memberId;
    }
    public void setMemberId(int memberId){
        this.memberId = memberId;
    }

    public String getMemberName(){
        return this.memberName;
    }
}
