package arraylist;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student lee = new Student("Lee");
		lee.addSubject("����", 100);
		lee.addSubject("����", 90);
		
		lee.showStudentInfo();
		
		Student kim = new Student("Kim");
		kim.addSubject("����", 95);
		kim.addSubject("����", 85);
		kim.addSubject("����", 75);
	
		kim.showStudentInfo();
	}

}
