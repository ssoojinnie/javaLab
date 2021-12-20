package collection.treemap;

import java.util.Iterator;
import java.util.TreeMap;

import collection.Member;

public class MemberTreeMap {
	//Comparable<Member> ������� �ʴ������� key�� ����ϴ� Ŭ���� (Interger) �� compare �Լ� ����ϱ� ����
	
	private TreeMap<Integer, Member> treeMap;

	public MemberTreeMap() {
		//treeMap = new TreeMap<Integer, Member>();
		//���� ���� ���� MyCompare ó�� �ٸ� ���Ĺ���� ����ϰ� �ʹٸ�
		treeMap = new TreeMap<Integer, Member>(new MyCompare());
	}
	
	public void addMember(Member member) {
		treeMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		//TreeMap�� ��� �ִ��� Ȯ���ϴ� �ҽ��ڵ� ���� �ʿ�
		if(treeMap.containsKey(memberId)) {
			treeMap.remove(memberId);
			return true;
		}
		System.out.println(memberId +"����");
		return false;
	}
	
	public void showAllMember() {
		//key�� value�� ���ÿ� �������� function����
		Iterator<Integer> ir = treeMap.keySet().iterator();
				//hashMap.keySet();//��� Ű�� ������, Set ��ȯ
		while(ir.hasNext()) {
			int key = ir.next();
			
			Member member = treeMap.get(key);
			System.out.println(member);
		}
		
	}
}
