package ch03;

public class CustomerTest {

	public static void main(String[] args) {
//		Customer customerYoo = new Customer(1002, "������");
//		customerYoo.bonusPoint = 1000;
//		System.out.println(customerYoo.showCustomerInfo());
//	
//		VIPCustomer customerIm = new VIPCustomer(2002, "��â��");
//		customerIm.bonusPoint = 10000;
//		System.out.println(customerIm.showCustomerInfo());
//	
		Customer vc = new VIPCustomer(12345, "�̳���");
		System.out.println(vc.getCustomerID());
		System.out.println(vc.showCustomerInfo());
	}

}
