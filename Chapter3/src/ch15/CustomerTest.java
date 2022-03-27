package ch15;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.order();
		customer.hello();
		
		// 업 캐스팅
		// customer에서 재정의 했기 때문에 재정의 한 결과가 나온다
		Buy buyer = customer;
		buyer.buy();
		buyer.order();
		
		Sell seller = customer;
		seller.sell();
		seller.order();
		
	}
}
