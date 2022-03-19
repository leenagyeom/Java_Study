package ch03;

public class CustomerTest {

	public static void main(String[] args) {
//		Customer customerYoo = new Customer(1002, "À¯±âÇö");
//		customerYoo.bonusPoint = 1000;
//		System.out.println(customerYoo.showCustomerInfo());
//	
//		VIPCustomer customerIm = new VIPCustomer(2002, "ÀÓÃ¢±Õ");
//		customerIm.bonusPoint = 10000;
//		System.out.println(customerIm.showCustomerInfo());
//	
		Customer vc = new VIPCustomer(12345, "ÀÌ³ª°â");
		System.out.println(vc.getCustomerID());
		System.out.println(vc.showCustomerInfo());
	}

}
