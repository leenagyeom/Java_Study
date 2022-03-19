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
			System.out.println(studentName + "�л��� " + subject.getSubjectName() + "������ ������ " + subject.getSubjectScore() + "�Դϴ�.");
		}
		System.out.println(studentName + "�л��� ������ " + total + "�Դϴ�.");
	}

}
