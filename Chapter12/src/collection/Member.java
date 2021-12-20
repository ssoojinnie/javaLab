package collection;

import java.util.Comparator;
import java.util.Objects;

public class Member implements Comparable<Member>, Comparator<Member>{
	
	private int memberId;
	private String memberName;
	
	public Member() {}
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	@Override
	public String toString() {
		return "Member [memberName=" + memberName + ", memberId=" + memberId + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member)obj;
			
			if(this.memberId ==member.memberId) {
				return true;
			}else
				return false;
		}
		return false;
	}

	@Override
	public int compareTo(Member member) {
		// TODO Auto-generated method stub
		//클래스 정의시 <Member> 로 타입 명시 해줘서
		//명시 안해주면 Object 
		//비교기준 : 호출하는 인스턴스
		//추가되는 member 와 기존의 트리를 구성하는 노드(멤버인스턴스) 한개
		
		//return (this.memberId - member.memberId);
		//> 0 이면 오름차순 
		//< 0 이면 내림차순 *(-1)
   		
		return (this.memberName.compareTo(member.memberName));
		//String class 에 compareTo 가 있어서 활용
	}
	@Override
	public int compare(Member o1, Member o2) {
		// TODO Auto-generated method stub
		//비교 기준 : o1
		return (o1.memberId-o2.memberId);
	}

}
