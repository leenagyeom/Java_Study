package ch11;

public class MakeReportTest {

	public static void main(String[] args) {
		
		MakeReport contact = new MakeReport();
		String contactbook = contact.getReport();
		
		System.out.println(contactbook);
	}

}
