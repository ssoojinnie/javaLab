package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) { //파일이 없을떄
			System.out.println("1) "+e);
		} finally {
			try {
				fis.close();//열어본 파일은 닫음
			} catch (IOException e) {//a.txt가 없어서 안열었다면
				e.printStackTrace();
			}
			System.out.println("finally");
		}
		System.out.println("end");
	}

}
