package reference;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentJames = new Student(100, "James");
		studentJames.setKorea("국어", 50);
		studentJames.setMath("수학", 90);
		
		Student studentTomas = new Student(100, "Tomas");
		studentTomas.setKorea("국어", 20);
		studentTomas.setMath("수학", 40);
		
		studentJames.showStudentInfo();
		studentTomas.showStudentInfo();
	}

}
