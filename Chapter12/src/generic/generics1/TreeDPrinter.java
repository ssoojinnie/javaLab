package generic.generics1;

public class TreeDPrinter <T extends Material> {// Material �� ����� Ŭ������

	//private Object material;
	private T material;//��� Ŭ������ �ֻ��� Ŭ����, � Ŭ������ Object �� ��ȯ�ؼ� ��� ����
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
