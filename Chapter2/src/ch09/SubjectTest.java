package ch09;

public class SubjectTest {

	public static void main(String[] args) {

		Student studentLee = new Student(2010167, "�̳���");
		studentLee.setKoreaSubject(100, "����", 90);
		studentLee.setEnglishSubject(200, "����", 70);
		studentLee.setMathSubject(300, "����", 100);
		
		Student studentSon = new Student(2011634, "������");
		studentSon.setKoreaSubject(100, "����", 80);
		studentSon.setMathSubject(300, "����", 90);
		studentSon.setEnglishSubject(200, "����", 70);

		studentLee.showScoreInfo();
		studentSon.showScoreInfo();

	}
}