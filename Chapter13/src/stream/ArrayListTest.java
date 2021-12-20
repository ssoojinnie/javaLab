package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListTest {

	public static void main(String[] args) {

		List<String> slist = new ArrayList<String>();
		
		slist.add("Tomas");
		slist.add("James");
		slist.add("Edward");
		
		Stream<String> stream = slist.stream();
		
		//forEach
		stream.forEach(s->System.out.println(s)); //1) ���ٽ�ǥ�� �Ű����� s, 2) �ݺ����� ���鼭 ��Ʈ���� �Ҹ�Ϸ�
		
		for(String str : slist) {
			System.out.println(str);
		}//�� 21���ΰ� ����
		
		
		slist.stream().sorted().forEach(s->System.out.println(s)); //sorted() �߰����� forEach ��������
		// sorted() ������ String�� comparable ����, ���� String�� �ƴ� �ٸ� ��ü�� ����Ѵٸ� Comparable ������ �������ְ� ����ؾ���
		
		
		
		
		
		
	}

}
