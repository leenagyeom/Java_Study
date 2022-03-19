package ch15;

public class Taxi {
	
	String taxiCompanyName;
	int money;
	int passengerAddResult;
	int roadDistance;
	
	public Taxi (String taxiCompanyName) {
		this.taxiCompanyName = taxiCompanyName;
	}
	
	public void take (int money) {
		this.money += money;
		passengerAddResult++;
	}
	
	public void ride (int roadDistance) {
		this.roadDistance += roadDistance;
	}
	
	public void showInfoTaxi() {
		System.out.println(taxiCompanyName + " 택시의 이동거리는 " + roadDistance + "km 이고, 수입은 " + money + "입니다.");
	}

}
