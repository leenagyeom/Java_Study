package ch08;

public class PersonInfo {
	
	public int tall;
	public int weight;
	public String gender;
	public String name;
	public int age;
	
	public PersonInfo() {}
	public PersonInfo(int tall, int weight, String gender, String name, int age) {
		this.tall = tall;
		this.weight = weight;
		this.gender = gender;
		this.name = name;
		this.age = age;
	}
	
	public String showPersonInfo() {
		return "Ű�� " + tall + " �̰�, �����԰� " + weight + " ų���� " + gender + "�� �ֽ��ϴ�. �̸��� " + name + " �̰� ���̴� " + age + " �� �Դϴ�."; 
	}

}
