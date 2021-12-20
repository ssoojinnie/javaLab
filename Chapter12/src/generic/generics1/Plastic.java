package generic.generics1;

public class Plastic extends Material {
	
	public String toString() {
		return "재료는 plastic";
	}

	@Override
	public void doPrinting() {
		// TODO Auto-generated method stub
		System.out.println("Plastic 재료로 출력");
	}
	
	
}
