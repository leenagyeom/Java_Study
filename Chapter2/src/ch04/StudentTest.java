package ch04;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student studentLee = new Student();
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "���� ������";
		
		studentLee.showStudentInfo();
		
		Student nagyeom = new Student();
		nagyeom.studentID = 2010167;
		nagyeom.studentName = "�̳���";
		nagyeom.address = "�뱸������ ����";
		
		nagyeom.showStudentInfo();
	
		System.out.println(studentLee);
		System.out.println(nagyeom);
	}
}
