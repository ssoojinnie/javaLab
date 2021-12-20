package generic.generics0;

public class ThreeDPrinter <T> { //제네릭 클래스
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
}
