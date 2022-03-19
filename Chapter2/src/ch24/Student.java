package ch24;

import java.util.ArrayList;

public class Student {
	private int studentId;
	private String studentName;
	
	ArrayList<Subject> subjectList;
	
	public Student() {}
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		
		subjectList = new ArrayList<>();
	}
	
	public void addSubject(String subjectName, int subjectScore) {
		Subject subject = new Subject();
		subject.setSubjectName(subjectName);
		subject.setSubjectScore(subjectScore);
		
		subjectList.add(subject);
	}

	public void showStudentInfo() {
		int total = 0;
		
		for (Subject subject : subjectList) {
			total += subject.getSubjectScore();
			System.out.println(studentName + "학생의 " + subject.getSubjectName() + "과목의 성적은 " + subject.getSubjectScore() + "입니다.");
		}
		System.out.println(studentName + "학생의 총점은 " + total + "입니다.");
	}

}
