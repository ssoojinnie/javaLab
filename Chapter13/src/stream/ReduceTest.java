package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) {//���̳ʸ� operator�� �׻� apply��� function�� �����ؾ���
		if(s1.getBytes().length>=s2.getBytes().length) return s1;//�ѱ�, ���� -> ����Ʈ ��
		else return s2;
	}
	
}

public class ReduceTest {

	public static void main(String[] args) {

		//1) reduce() ���ǵ� ������ �ƴ� ���α׷��Ӱ� ���� �����ϴ� ����
		int[] arr = {1,2,3,4,5,};
		Arrays.stream(arr).reduce(0, (a, b)->a+b); //reduce(�ʱⰪ, �� ��Ұ� ������ ���);
		// ��� : binaryOperator (�ΰ��� �Ű������� ������ ����)
				
		
		String[] greetings = {"�ȳ��ϼ���!~~~~!", "Hello", "good morning", "�ݰ����ϴ�."};
		
		//2) ���ٽ� ǥ��
		System.out.println(
				Arrays.stream(greetings).reduce("", (s1, s2)->{
			if(s1.getBytes().length>=s2.getBytes().length) return s1;//�ѱ�, ���� -> ����Ʈ ��
			else return s2;
		}));
		
		//3) ���̳ʸ� operator
		String str = Arrays.stream(greetings).reduce(new CompareString()).get();//�ʱⰪ ���� ����
		System.out.println(str);
	}

}
