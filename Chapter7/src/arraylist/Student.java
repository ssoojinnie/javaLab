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
		System.out.println("학번 :"+studentID);
		for(Subject subject : subjectList) {
			System.out.println("학생 "+name+"님의 "+subject.getName()+"과목점수는 "+subject.getScorePoint()+"점입니다.");
			total += subject.getScorePoint();
		}
		System.out.println("총점 : "+total);
	}
}
