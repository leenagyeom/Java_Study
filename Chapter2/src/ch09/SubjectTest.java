package ch09;

public class SubjectTest {

	public static void main(String[] args) {

		Student studentLee = new Student(2010167, "이나겸");
		studentLee.setKoreaSubject(100, "국어", 90);
		studentLee.setEnglishSubject(200, "영어", 70);
		studentLee.setMathSubject(300, "수학", 100);
		
		Student studentSon = new Student(2011634, "손현우");
		studentSon.setKoreaSubject(100, "국어", 80);
		studentSon.setMathSubject(300, "수학", 90);
		studentSon.setEnglishSubject(200, "영어", 70);

		studentLee.showScoreInfo();
		studentSon.showScoreInfo();

	}
}