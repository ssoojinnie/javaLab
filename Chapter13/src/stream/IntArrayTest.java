package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {

	public static void main(String[] args) {

		int [] arr = {1,2,3,4,5,};
		
		//�迭, �÷��� ���� ������� ������ ���� ���డ��
		Arrays.stream(arr);//1) stream ���� ���
							//2) IntStream ��ȯ
		
		IntStream tmpStream = Arrays.stream(arr);
		int sum = tmpStream.sum(); // �� ���ο��� ������ ������ ����� ����
		
		int count = (int)tmpStream.count(); //3) sum() �������� ��Ʈ���� �Ҹ�Ǿ��⶧���� �̷��� ���� �����߻�
		int count2 = (int)Arrays.stream(arr).count();//��Ʈ�� �ٽû���! , long Ÿ������ ��ȯ�ǹǷ� casting
		
		Arrays.stream(arr);
		
		
	}

}
