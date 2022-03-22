package ch07;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer customerT = new Customer(10001, "Tom");
		Customer customerA = new Customer(10002, "Aom");
		Customer customerB = new GoldCustomer(20001, "Bom");
		Customer customerC = new GoldCustomer(20002, "Com");
		Customer customerD = new VIPCustomer(30001, "Dom");
		Customer customerE = new VIPCustomer(30002, "Eom");
		
		customerList.add(customerT);
		customerList.add(customerA);
		customerList.add(customerB);
		customerList.add(customerC);
		customerList.add(customerD);
		customerList.add(customerE);
		
		if (customerB instanceof GoldCustomer) {
			GoldCustomer vc = (GoldCustomer)customerB;
			System.out.println(customerB.showCustomerInfo());
		}
	}		
}
