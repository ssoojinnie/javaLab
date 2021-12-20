package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);//filenotfound
		Class c = Class.forName(className);//classnotfound
		return c;
	}//���ο��� trycatch �Ŵ� ����� ����
	//�ƴϸ� Ŭ���� �̸� ���� throws �̷�Exception ���
	
	public static void main(String[] args) {
		ThrowsException ex = new ThrowsException();
		try {
			ex.loadClass("b.txt", "java.lang.string");//�����δ� java.lang.String
		} catch(FileNotFoundException e) {
			System.out.println(e);
		} catch(ClassNotFoundException e) {
			System.out.println(e);
		} catch(Exception e) {//� exception �� �߻����� ����~
			//�� �ֻ��� Ŭ�����̱� ������ catch�� ���� �տ� �θ� �ȵ�!
			//�� �տ��θ� ������ exception �� ������ �����Ƿ� ������ ����
			System.out.println(e);
		}
		System.out.println("end");
	}

}
