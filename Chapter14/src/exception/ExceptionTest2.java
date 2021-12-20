package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//try-with resources 문 -> 리소스 자동 해제 
		try (FileInputStream fis = new FileInputStream("a.txt")){
			//단 리소스가 autoCloseable 이 구현되어있어야함 
		} catch (IOException e) {//fileNotFound -> IOException
			System.out.println(e);
		}
		System.out.println("end");
	}

}
