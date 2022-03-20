package ch06_1;

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
		
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "���� " + cost + "�� �����ϼ̽��ϴ�.");
			System.out.println(customer.getCustomerName() + "���� ���� ���ʽ� ����Ʈ�� " + customer.bonusPoint + " �Դϴ�.");
		}
	}

}
