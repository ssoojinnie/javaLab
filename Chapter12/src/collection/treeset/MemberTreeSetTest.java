package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memLee = new Member(102, "�̼���");
		Member memKim = new Member(101, "������");
		Member memShin = new Member(103, "�Ż��Ӵ�");
		
		memberTreeSet.addMember(memLee);
		memberTreeSet.addMember(memKim);
		memberTreeSet.addMember(memShin);
		
		memberTreeSet.showAll();
	}

}
