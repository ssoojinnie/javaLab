package collection.treemap;

import collection.Member;


public class MemberTreeMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberTreeMap memberTreeMap = new MemberTreeMap();
		
		Member memLee = new Member(102, "이순신");
		Member memKim = new Member(101, "김유신");
		Member memShin = new Member(103, "신사임당");
		
		memberTreeMap.addMember(memLee);
		memberTreeMap.addMember(memKim);
		memberTreeMap.addMember(memShin);
		
		memberTreeMap.showAllMember();
		//자동정렬 -> key 인 Integer 클래스에 compare 구현되어있기떄문
		//
		/*
		 * System.out.println(); memberTreeMap.removeMember(102);
		 * memberTreeMap.showAllMember();
		 */
	}

}
