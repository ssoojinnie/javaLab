package generic.generics1;

public class TreeDPrinterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TreeDPrinter클래스에서 Object로 upcasting
		TreeDPrinter printer = new TreeDPrinter();
		printer.setMaterial(new Powder());
		//Powder powder = printer.getMaterial(); //실제 반환값은 object 인데 받은 타입은 powder
		//Object로 upcasting 했을경우
		Powder powder = (Powder)printer.getMaterial();
		//결과를 받을때는 down casting 해야함

		
		TreeDPrinter<Powder> printer2 = new TreeDPrinter<>();
		printer2.setMaterial(new Powder());
		Powder powder2 = printer2.getMaterial();
		//실제로 Object 로 변환되는데 컴파일러가 
		//TreeDPrinter<Powder> printer2 = new TreeDPrinter<Powder>();
		//위 소스를 보고 casting 해줌
		//사용할 타입이 대체될 곳에 T 씀
		System.out.println(printer2);
		
		
		TreeDPrinter<Plastic> printer3 = new TreeDPrinter<>();
		printer3.setMaterial(new Plastic());
		Plastic plastic = printer3.getMaterial();
		System.out.println(printer3);
		
		// T extends Material
		TreeDPrinter<Water> printerWater = new TreeDPrinter<Water>();
		System.out.println(printerWater); //setMaterial 하지않아서 error
		
		
		printer2.printing();
		printer3.printing();
		
	}

}
