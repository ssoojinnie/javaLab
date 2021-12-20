package classpart;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student() {}
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
	}
	
	public void showStudentIbfor() {
		System.out.println(studentName +","+address);
	}
	
	/*public static void main(String[] args) {
		Student studentlee = new Student();
		studentlee.studentName = "ÀÌ¼ø½Å";
				
	}*/
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
}
