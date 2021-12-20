package collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		//기존에 String 클래스에 구현되어있는 compare 말고 comparator 구현이 필요할떄
		
		return o1.compareTo(o2)*(-1);//원래 String의 compareTo 가 오름차순인데 내림차순으로 바꾸는경우
	}
	
}

public class ComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> tree = new TreeSet<String>();
		
		tree.add("aaaa");
		tree.add("cccc");
		tree.add("bbbb");
		
		System.out.println(tree); //오름차순으로정렬이 되어 출력됨
		
		TreeSet<String> tree2 = new TreeSet<String>(new MyCompare());
		
		tree2.add("aaaa");
		tree2.add("cccc");
		tree2.add("bbbb");
		
		System.out.println(tree2); //내림차순으로정렬이 되어 출력됨
	}

}
