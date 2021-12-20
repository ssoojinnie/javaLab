package classpart;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentlee = new Student();
		studentlee.studentName = "ÀÌ¼ø½Å";
		studentlee.showStudentIbfor();
		
		Student studentkim = new Student(1234, "±è¾¾");
		
		studentlee.showStudentIbfor();
		studentkim.showStudentIbfor();
		
	}

}
