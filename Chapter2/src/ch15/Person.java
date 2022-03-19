package ch15;

public class Person {
	
	String personName;
	int money;
	int roadDistance;
	
	public Person(String personName, int money, int roadDistance) {
		this.personName = personName;
		this.money = money;
		this.roadDistance = roadDistance;
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		taxi.ride(roadDistance);
		this.money -= 10000;
	}
	
	public void showInfo() {
		System.out.println(personName + "���� " + roadDistance + "km ��ŭ ��������, ���� ���� " + money + "�� �Դϴ�.");
	}
	

}
