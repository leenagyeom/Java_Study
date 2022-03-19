package ch08;

public class OrderInfo {
	
	public String orderNumber;
	public String phoneNumber;
	public String address;
	public String date;
	public String time;
	public String price;
	public String menuNumber;

	public OrderInfo() {}
	public OrderInfo(String orderNumber, String phoneNumber, String address, String date, String time, String price, String menuNumber) {
		this.orderNumber = orderNumber;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.date = date;
		this.time = time;
		this.price = price;
		this.menuNumber = menuNumber;
	}
	
	public void showOrderInfo() {
		System.out.println("�ֹ� ���� ��ȣ : " + orderNumber);
		System.out.println("�ֹ� �ڵ��� ��ȣ : " + phoneNumber);
		System.out.println("�ֹ� �� �ּ� : " + address);
		System.out.println("�ֹ� ��¥ : " + date);
		System.out.println("�ֹ� �ð� : " + time);
		System.out.println("�ֹ� ���� : " + price);
		System.out.println("�޴� ��ȣ : " + menuNumber);
	}
}
