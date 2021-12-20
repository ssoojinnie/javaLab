package arraylist;

import java.util.ArrayList;

public class Student {

	private static int sid = 1001;
	
	private int studentID;
	private String name;
	private ArrayList<Subject> subjectList;
	
	public Student(String name) {
		this.studentID = sid;
		sid++;
		this.name = name;
		
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String name, int scroe) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(scroe);
		
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		System.out.println("�й� :"+studentID);
		for(Subject subject : subjectList) {
			System.out.println("�л� "+name+"���� "+subject.getName()+"���������� "+subject.getScorePoint()+"���Դϴ�.");
			total += subject.getScorePoint();
		}
		System.out.println("���� : "+total);
	}
}
