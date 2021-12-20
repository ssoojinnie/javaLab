package arraylist;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student lee = new Student("Lee");
		lee.addSubject("국어", 100);
		lee.addSubject("수학", 90);
		
		lee.showStudentInfo();
		
		Student kim = new Student("Kim");
		kim.addSubject("국어", 95);
		kim.addSubject("수학", 85);
		kim.addSubject("영어", 75);
	
		kim.showStudentInfo();
	}

}
