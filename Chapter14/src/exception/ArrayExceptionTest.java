package exception;

public class ArrayExceptionTest {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, };
		
		for (int i = 0; i <= 5; i++) {
			System.out.println(arr[i]);
		}
		
		try {
			for (int i = 0; i <= 5; i++) {
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			return;//finally 수행 후 return -> end 출력 X
		} finally {
			System.out.println("finally");
		}
		System.out.println("end");
	}

}
