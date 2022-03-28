package ch02;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student std1 = new Student(100, "Lee");
		Student std2 = new Student(100, "Lee");
		Student std3 = std1;
		
		System.out.println(std1 == std2);
		System.out.println(std1.equals(std2)); // 논리적으로 같음
		System.out.println(std1.equals(std3));
		
		System.out.println(std1.hashCode()); // 논리적으로 같아서 같은 해쉬값이 반환됨
		System.out.println(std2.hashCode()); // 논리적으로 같아서 같은 해쉬값이 반환됨
		System.out.println(std3.hashCode());
		
		System.out.println(System.identityHashCode(std1)); // 실제 hashCode 값
		System.out.println(System.identityHashCode(std2));
		System.out.println(System.identityHashCode(std3));
		
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		Integer i = 100;
		System.out.println(i.hashCode());
		
		std1.setStudentName("Kim");
		Student copyStudent = (Student)std1.clone();
		System.out.println(copyStudent);
		// 생성이 아니라 인스턴스 상태를 그대로 복제해서 사용할 수 있다.
	}
}
