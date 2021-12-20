package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);//filenotfound
		Class c = Class.forName(className);//classnotfound
		return c;
	}//내부에서 trycatch 거는 방법도 있음
	//아니면 클래스 이름 옆에 throws 미룰Exception 명시
	
	public static void main(String[] args) {
		ThrowsException ex = new ThrowsException();
		try {
			ex.loadClass("b.txt", "java.lang.string");//실제로는 java.lang.String
		} catch(FileNotFoundException e) {
			System.out.println(e);
		} catch(ClassNotFoundException e) {
			System.out.println(e);
		} catch(Exception e) {//어떤 exception 이 발생할지 몰라~
			//단 최상위 클래스이기 떄문에 catch문 제일 앞에 두면 안됨!
			//맨 앞에두면 하위의 exception 에 잡히지 않으므로 컴파일 에러
			System.out.println(e);
		}
		System.out.println("end");
	}

}
