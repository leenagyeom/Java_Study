package ch02;

public class Student implements Cloneable {

	private int studentNum;
	private String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}
	
	public void setStudentName(String name) {
		this.studentName = name;
	}
	
	public String toString() {
		return studentNum + ", " + studentName;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student std = (Student)obj;
			if (this.studentNum == std.studentNum) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	//	넘어온 obj를 Student로 다운캐스팅 한다

	@Override
	public int hashCode() {
		
		return studentNum;
	}
	// 멤버변수를 이용해서 제너레이트 한다.

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
