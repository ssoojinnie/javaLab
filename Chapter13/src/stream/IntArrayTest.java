package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {

	public static void main(String[] args) {

		int [] arr = {1,2,3,4,5,};
		
		//배열, 컬렉션 등을 대상으로 동일한 연산 수행가능
		Arrays.stream(arr);//1) stream 생성 방법
							//2) IntStream 반환
		
		IntStream tmpStream = Arrays.stream(arr);
		int sum = tmpStream.sum(); // 윗 라인에서 생성후 변수를 사용은 가능
		
		int count = (int)tmpStream.count(); //3) sum() 연산으로 스트림이 소모되었기때문에 이렇게 쓰면 에러발생
		int count2 = (int)Arrays.stream(arr).count();//스트림 다시생성! , long 타입으로 반환되므로 casting
		
		Arrays.stream(arr);
		
		
	}

}
