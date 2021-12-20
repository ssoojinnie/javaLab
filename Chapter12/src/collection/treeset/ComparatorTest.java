package collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		//������ String Ŭ������ �����Ǿ��ִ� compare ���� comparator ������ �ʿ��ҋ�
		
		return o1.compareTo(o2)*(-1);//���� String�� compareTo �� ���������ε� ������������ �ٲٴ°��
	}
	
}

public class ComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> tree = new TreeSet<String>();
		
		tree.add("aaaa");
		tree.add("cccc");
		tree.add("bbbb");
		
		System.out.println(tree); //������������������ �Ǿ� ��µ�
		
		TreeSet<String> tree2 = new TreeSet<String>(new MyCompare());
		
		tree2.add("aaaa");
		tree2.add("cccc");
		tree2.add("bbbb");
		
		System.out.println(tree2); //������������������ �Ǿ� ��µ�
	}

}
