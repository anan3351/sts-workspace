package java0530.collection;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
    private HashMap<Integer, Member> hashMap; //앞이 키(중복x), 뒤가 값(중복o)
    public MemberHashMap(){
        hashMap = new HashMap<>();
    }
    public void addMember(Member member){
        hashMap.put(member.getMemberId(), member); //int키, member값
    }
    public boolean removeMember(int memberId){
        if (hashMap.containsKey(memberId)){
            hashMap.remove(memberId);
            return true;
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }
    public void showAllMember(){
        Iterator<Integer> ir = hashMap.keySet().iterator();
        while (ir.hasNext()){ //next를 가지고 있다면 반복, 없다면 종료
            int key = ir.next();
            Member member = hashMap.get(key);
//            System.out.println(member);
            System.out.println(member.getMemberName() + "님의 아이디는 " + member.getMemberId() + "입니다.");
        }
    }
}
