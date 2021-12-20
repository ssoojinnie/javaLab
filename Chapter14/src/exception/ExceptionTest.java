package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) { //������ ������
			System.out.println("1) "+e);
		} finally {
			try {
				fis.close();//��� ������ ����
			} catch (IOException e) {//a.txt�� ��� �ȿ����ٸ�
				e.printStackTrace();
			}
			System.out.println("finally");
		}
		System.out.println("end");
	}

}
