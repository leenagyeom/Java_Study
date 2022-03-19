package ch08;

public class PersonInfoTest {

	public static void main (String[] args) {
		
		PersonInfo Tomas = new PersonInfo();
		Tomas.tall = 180;
		Tomas.weight = 78;
		Tomas.gender = "남성";
		Tomas.name = "Tomas";
		Tomas.age = 37;
		System.out.println(Tomas.showPersonInfo());
		
		PersonInfo Sally = new PersonInfo(168, 58, "여성", "Sally", 32);
		System.out.println(Sally.showPersonInfo());
	}
}

