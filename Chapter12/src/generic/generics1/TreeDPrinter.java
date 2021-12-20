package generic.generics1;

public class TreeDPrinter <T extends Material> {// Material 을 상속한 클래스만

	//private Object material;
	private T material;//모든 클래스의 최상위 클래스, 어떤 클래스든 Object 로 변환해서 사용 가능
	//private static T material;
	
	
	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting();
	}
	
}
