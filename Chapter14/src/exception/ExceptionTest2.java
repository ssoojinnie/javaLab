package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//try-with resources �� -> ���ҽ� �ڵ� ���� 
		try (FileInputStream fis = new FileInputStream("a.txt")){
			//�� ���ҽ��� autoCloseable �� �����Ǿ��־���� 
		} catch (IOException e) {//fileNotFound -> IOException
			System.out.println(e);
		}
		System.out.println("end");
	}

}
