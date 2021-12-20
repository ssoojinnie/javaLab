package collection.hashmap;

import collection.Member;


public class MemberHashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memLee = new Member(102, "이순신");
		Member memKim = new Member(101, "김유신");
		Member memShin = new Member(103, "신사임당");
		
		memberHashMap.addMember(memLee);
		memberHashMap.addMember(memKim);
		memberHashMap.addMember(memShin);
		
		memberHashMap.showAllMember();
		System.out.println();
		memberHashMap.removeMember(102);
	
		memberHashMap.showAllMember();
		
	}

}
