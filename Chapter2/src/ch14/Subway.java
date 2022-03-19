package ch14;

public class Subway {
	
	int subwayLine;
	int passengerCount;
	int money;
	
	public Subway (int subwayLine) {
		this.subwayLine = subwayLine;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showSubwayInfo() {
		System.out.println(subwayLine + "ȣ���� �°� ���� " + passengerCount + "�̰�, ������ " + money + "�� �Դϴ�.");
	}
}
