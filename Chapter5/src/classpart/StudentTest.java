package classpart;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentlee = new Student();
		studentlee.studentName = "�̼���";
		studentlee.showStudentIbfor();
		
		Student studentkim = new Student(1234, "�达");
		
		studentlee.showStudentIbfor();
		studentkim.showStudentIbfor();
		
	}

}
