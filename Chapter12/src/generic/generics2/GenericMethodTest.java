package generic.generics2;

public class GenericMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point<Integer, Double> p1 = new Point<Integer, Double>(0, 0.0);
		Point<Integer, Double> p2 = new Point<Integer, Double>(10, 10.0);
		
		//���ʸ� �޼��� - ����� �ڷ��� ���� ���� ����
		double rec = GenericMethod.<Integer, Double>makeRectangle(p1, p2);
		System.out.println("���� :" +rec);
	}

}
