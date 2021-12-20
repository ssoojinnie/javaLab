package collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import collection.Member;

public class MemberHashMap {

	private HashMap<Integer, Member> hashMap;

	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		//TreeMap의 경우 있는지 확인하는 소스코드 구현 필요
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}
		System.out.println(memberId +"없음");
		return false;
	}
	
	public void showAllMember() {
		//key와 value를 동시에 가져오는 function없음
		Iterator<Integer> ir = hashMap.keySet().iterator();
				//hashMap.keySet();//모든 키를 가져옴, Set 반환
		while(ir.hasNext()) {
			int key = ir.next();
			
			Member member = hashMap.get(key);
			System.out.println(member);
		}
		
	}
}
