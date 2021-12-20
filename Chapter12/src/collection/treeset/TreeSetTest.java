package collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> tree = new TreeSet<String>();
		//String class 에 comparable 구현되어있기 때문에 에러x
		
		tree.add("aaaa");
		tree.add("cccc");
		tree.add("bbbb");
		
		System.out.println(tree); //오름차순으로정렬이 되어 출력됨 
	}

}
