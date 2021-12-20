package generic.generics1;

public class TreeDPrinterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TreeDPrinterŬ�������� Object�� upcasting
		TreeDPrinter printer = new TreeDPrinter();
		printer.setMaterial(new Powder());
		//Powder powder = printer.getMaterial(); //���� ��ȯ���� object �ε� ���� Ÿ���� powder
		//Object�� upcasting �������
		Powder powder = (Powder)printer.getMaterial();
		//����� �������� down casting �ؾ���

		
		TreeDPrinter<Powder> printer2 = new TreeDPrinter<>();
		printer2.setMaterial(new Powder());
		Powder powder2 = printer2.getMaterial();
		//������ Object �� ��ȯ�Ǵµ� �����Ϸ��� 
		//TreeDPrinter<Powder> printer2 = new TreeDPrinter<Powder>();
		//�� �ҽ��� ���� casting ����
		//����� Ÿ���� ��ü�� ���� T ��
		System.out.println(printer2);
		
		
		TreeDPrinter<Plastic> printer3 = new TreeDPrinter<>();
		printer3.setMaterial(new Plastic());
		Plastic plastic = printer3.getMaterial();
		System.out.println(printer3);
		
		// T extends Material
		TreeDPrinter<Water> printerWater = new TreeDPrinter<Water>();
		System.out.println(printerWater); //setMaterial �����ʾƼ� error
		
		
		printer2.printing();
		printer3.printing();
		
	}

}
