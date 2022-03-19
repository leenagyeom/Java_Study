package ch02;

public class VIPCustomer extends Customer {
	
	// if-else가 많다면 상속을 생각해보는 것도 중요하다.
	// Customer class에서 담당상담원ID, 할인율
	
	double salesRatio;
	String agentID;
	
	public VIPCustomer() {
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}

	public String getAgentID() {
		return agentID;
	}
}
