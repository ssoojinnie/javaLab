package array;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[3];
		
		int[] test1 = {0, 1, 2};
		int [] test2;
		test2 = {0,1,2};//ºÒ°¡´É
		int[] test3;
		test3 = new int[] {0,1,2};
		
		for(int i =0;i<3; i++) {
			numbers[i] = i;
			System.out.println(numbers[i]);
		}
		System.out.println(numbers.length);
		
		double[] num = new double[5];
		int size = 0;
		
		num[0] = 10.0; size++;
		num[1] = 20.0; size++;
		num[2] = 30.0; size++;
		
		double total = 1;
		for(int i =0; i<size; i++) {
			total*= num[i];
		}
		System.out.println("total: "+total);
		
		char[] alphabets = new char[26];
		char ch = 'A';
		for(int i=0; i<alphabets.length; i++, ch++) {
			alphabets[i] = ch;	
		}
	}

}
