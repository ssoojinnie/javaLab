package collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> tree = new TreeSet<String>();
		//String class �� comparable �����Ǿ��ֱ� ������ ����x
		
		tree.add("aaaa");
		tree.add("cccc");
		tree.add("bbbb");
		
		System.out.println(tree); //������������������ �Ǿ� ��µ� 
	}

}
