package ch04;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerYoo = new Customer(1002, "������");
		customerYoo.bonusPoint = 1000;
		int price = customerYoo.calcPrice(1000);
		System.out.println(price);
		System.out.println(customerYoo.showCustomerInfo());
	
		VIPCustomer customerIm = new VIPCustomer(2002, "��â��");
		customerIm.bonusPoint = 10000;
		price = customerIm.calcPrice(1000);
		System.out.println(price);
		System.out.println(customerIm.showCustomerInfo());
	
		Customer vc = new VIPCustomer(12345, "�̳���");
		vc.calcPrice(1000);
		System.out.println(vc.getCustomerID());
		System.out.println(vc.showCustomerInfo());
	}

}
