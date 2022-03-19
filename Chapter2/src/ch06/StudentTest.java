package ch06;

public class StudentTest {

	public static void main (String[] args) {

		Student studentIm = new Student();
		studentIm.grade = 1;
		studentIm.studentName = "ÀÓÃ¢±Õ";
		studentIm.studentNumber = 20150126;
		System.out.println(studentIm.showStudentInfo());
				
		Student studentLee = new Student(20100413, "ÀÌ³ª°â", 4);
		System.out.println(studentLee.showStudentInfo());
	}
}