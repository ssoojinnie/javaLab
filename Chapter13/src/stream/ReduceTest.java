package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) {//바이너리 operator는 항상 apply라는 function을 구현해야함
		if(s1.getBytes().length>=s2.getBytes().length) return s1;//한글, 영어 -> 바이트 비교
		else return s2;
	}
	
}

public class ReduceTest {

	public static void main(String[] args) {

		//1) reduce() 정의된 연산이 아닌 프로그래머가 직접 지정하는 연산
		int[] arr = {1,2,3,4,5,};
		Arrays.stream(arr).reduce(0, (a, b)->a+b); //reduce(초기값, 각 요소가 수행할 기능);
		// 기능 : binaryOperator (두개의 매개변수를 가지고 연산)
				
		
		String[] greetings = {"안녕하세요!~~~~!", "Hello", "good morning", "반갑습니다."};
		
		//2) 람다식 표현
		System.out.println(
				Arrays.stream(greetings).reduce("", (s1, s2)->{
			if(s1.getBytes().length>=s2.getBytes().length) return s1;//한글, 영어 -> 바이트 비교
			else return s2;
		}));
		
		//3) 바이너리 operator
		String str = Arrays.stream(greetings).reduce(new CompareString()).get();//초기값 생략 가능
		System.out.println(str);
	}

}
