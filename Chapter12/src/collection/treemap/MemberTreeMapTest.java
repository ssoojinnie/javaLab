package collection.treemap;

import collection.Member;


public class MemberTreeMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberTreeMap memberTreeMap = new MemberTreeMap();
		
		Member memLee = new Member(102, "�̼���");
		Member memKim = new Member(101, "������");
		Member memShin = new Member(103, "�Ż��Ӵ�");
		
		memberTreeMap.addMember(memLee);
		memberTreeMap.addMember(memKim);
		memberTreeMap.addMember(memShin);
		
		memberTreeMap.showAllMember();
		//�ڵ����� -> key �� Integer Ŭ������ compare �����Ǿ��ֱ⋚��
		//
		/*
		 * System.out.println(); memberTreeMap.removeMember(102);
		 * memberTreeMap.showAllMember();
		 */
	}

}
