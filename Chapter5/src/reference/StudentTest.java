package reference;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentJames = new Student(100, "James");
		studentJames.setKorea("����", 50);
		studentJames.setMath("����", 90);
		
		Student studentTomas = new Student(100, "Tomas");
		studentTomas.setKorea("����", 20);
		studentTomas.setMath("����", 40);
		
		studentJames.showStudentInfo();
		studentTomas.showStudentInfo();
	}

}
