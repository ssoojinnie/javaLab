package collection.treemap;

import java.util.Iterator;
import java.util.TreeMap;

import collection.Member;

public class MemberTreeMap {
	//Comparable<Member> 명시하지 않는이유는 key로 사용하는 클래스 (Interger) 의 compare 함수 사용하기 떄문
	
	private TreeMap<Integer, Member> treeMap;

	public MemberTreeMap() {
		//treeMap = new TreeMap<Integer, Member>();
		//만약 앞의 예제 MyCompare 처럼 다른 정렬방식을 사용하고 싶다면
		treeMap = new TreeMap<Integer, Member>(new MyCompare());
	}
	
	public void addMember(Member member) {
		treeMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		//TreeMap의 경우 있는지 확인하는 소스코드 구현 필요
		if(treeMap.containsKey(memberId)) {
			treeMap.remove(memberId);
			return true;
		}
		System.out.println(memberId +"없음");
		return false;
	}
	
	public void showAllMember() {
		//key와 value를 동시에 가져오는 function없음
		Iterator<Integer> ir = treeMap.keySet().iterator();
				//hashMap.keySet();//모든 키를 가져옴, Set 반환
		while(ir.hasNext()) {
			int key = ir.next();
			
			Member member = treeMap.get(key);
			System.out.println(member);
		}
		
	}
}
