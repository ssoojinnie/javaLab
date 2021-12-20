package thisEx;

class Birthday{
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year; //this없으면 가까운 변수 참조하므로 매개변수 가리킴
	}
	
	public void printThis() {
		System.out.println(this.year);
	}
}

public class ThisExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
