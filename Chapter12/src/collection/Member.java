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
		//Ŭ���� ���ǽ� <Member> �� Ÿ�� ��� ���༭
		//��� �����ָ� Object 
		//�񱳱��� : ȣ���ϴ� �ν��Ͻ�
		//�߰��Ǵ� member �� ������ Ʈ���� �����ϴ� ���(����ν��Ͻ�) �Ѱ�
		
		//return (this.memberId - member.memberId);
		//> 0 �̸� �������� 
		//< 0 �̸� �������� *(-1)
   		
		return (this.memberName.compareTo(member.memberName));
		//String class �� compareTo �� �־ Ȱ��
	}
	@Override
	public int compare(Member o1, Member o2) {
		// TODO Auto-generated method stub
		//�� ���� : o1
		return (o1.memberId-o2.memberId);
	}

}
