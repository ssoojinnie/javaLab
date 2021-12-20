package cooperation;

public class Student {

	String studentName;
	int grade;
	int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);//°´Ã¼ÀÇ Çù¾÷
		money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1000);//°´Ã¼ÀÇ Çù¾÷
		money -= 1000;
	}
	
	public void showInfo() {
		System.out.println(studentName +"ÀÇ ³²Àº µ·Àº "+money);
		
	}
}
