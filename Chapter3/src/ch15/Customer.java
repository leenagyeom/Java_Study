package ch15;

public class Customer implements Buy, Sell {

	@Override
	public void sell() {

		System.out.println("customer sell");
	}

	@Override
	public void buy() {
		System.out.println("customer buy");
		
	}
	
	// Duplicate 오류가 뜨기 때문에 둘 중 하나를 선택하거나 재정의 해야한다.

	@Override
	public void order() {
		System.out.println("customer order");
	}
	
	public void hello(){
		System.out.println("hello");
	}
	
	

}
