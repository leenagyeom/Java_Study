package ch02;

public class VIPCustomer extends Customer {
	
	// if-else�� ���ٸ� ����� �����غ��� �͵� �߿��ϴ�.
	// Customer class���� ������ID, ������
	
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
