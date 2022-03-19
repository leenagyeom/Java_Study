package ch09;

public class Student {
	
	int studentId;
	String studentName;
	
	Subject korea;
	Subject math;
	Subject english;
	
	Student(int studentId, String studentName){
		this.studentId = studentId;
		this.studentName = studentName;
		
		korea = new Subject();
		math = new Subject();
		english = new Subject();
	}
	
	public void setKoreaSubject(int id, String name, int score) {
		korea.subjectId = id;
		korea.subjectName = name;
		korea.score = score;
	}
	
	public void setMathSubject(int id, String name, int score) {
		math.subjectId = id;
		math.subjectName = name;
		math.score = score;
	}
	
	public void setEnglishSubject(int id, String name, int score) {
		english.subjectId = id;
		english.subjectName = name;
		english.score = score;
	}

	public void showScoreInfo() {
		int total = korea.score + math.score + english.score;
		System.out.println( studentName + " 학생의 총점은 " + total + "점 입니다.");
		int ave = total / 3;
		System.out.println( studentName + " 학생의 평균은 " + ave + "점 입니다.");
	}
}
