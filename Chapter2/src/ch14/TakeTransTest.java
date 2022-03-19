package ch14;

public class TakeTransTest {

	public static void main(String[] args) {
		
		Student JH = new Student("ÁÖÇå", 5000);
		Student HW = new Student("Çü¿ø", 10000);
		
		Bus bus100 = new Bus(100);
		Bus bus200 = new Bus(200);
		Bus bus300 = new Bus(300);
		JH.takeBus(bus100);

		
		Subway subway2 = new Subway(2);
		HW.takeSubway(subway2);
		
		JH.showInfo();
		HW.showInfo();
		
		bus100.showBusInfo();
		subway2.showSubwayInfo();
		
		bus200.showBusInfo();
		bus300.showBusInfo();

	}

}
