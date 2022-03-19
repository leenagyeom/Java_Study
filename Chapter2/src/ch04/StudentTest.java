package ch04;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student studentLee = new Student();
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "서울 강남구";
		
		studentLee.showStudentInfo();
		
		Student nagyeom = new Student();
		nagyeom.studentID = 2010167;
		nagyeom.studentName = "이나겸";
		nagyeom.address = "대구광역시 동구";
		
		nagyeom.showStudentInfo();
	
		System.out.println(studentLee);
		System.out.println(nagyeom);
	}
}
