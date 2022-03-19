package ch02;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer();
		customerLee.setCustomerName("ÀÌ¹ÎÇõ");
		customerLee.setCustomerID(1001);
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		
		VIPCustomer customerChae = new VIPCustomer();
		customerChae.setCustomerName("Ã¤Çü¿ø");
		customerChae.setCustomerID(2001);
		customerChae.bonusPoint = 3000;
		System.out.println(customerChae.showCustomerInfo());
	}

}
