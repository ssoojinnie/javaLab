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
		stream.forEach(s->System.out.println(s)); //1) 람다식표현 매개변수 s, 2) 반복문을 돌면서 스트림이 소모완료
		
		for(String str : slist) {
			System.out.println(str);
		}//위 21라인과 동일
		
		
		slist.stream().sorted().forEach(s->System.out.println(s)); //sorted() 중간연산 forEach 최종연산
		// sorted() 연산은 String의 comparable 연산, 만약 String이 아닌 다른 객체를 사용한다면 Comparable 연산을 정의해주고 사용해야함
		
		
		
		
		
		
	}

}
