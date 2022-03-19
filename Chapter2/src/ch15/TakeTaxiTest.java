package ch15;

public class TakeTaxiTest {
	
	public static void main (String[] args) {

		Person IM = new Person("УЂБе", 20000, 20);
		Taxi taxiIM = new Taxi("I.M");
	
		IM.takeTaxi(taxiIM);
		IM.showInfo();
		
		taxiIM.showInfoTaxi();
	}
}