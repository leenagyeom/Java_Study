package ch16;

public class EmployeeTest {

	public static void main(String[] args)
	{
		Employee employeeNagyeom = new Employee();
		employeeNagyeom.setEmployeeName("�̳���");

		System.out.println(employeeNagyeom.getSerialNum());
		
		Employee employeeDaeun = new Employee();
		employeeDaeun.setEmployeeName("�̴���");

		System.out.println(employeeNagyeom.getEmployeeName() + "���� ����� " + employeeNagyeom.getEmployeeId() + "�Դϴ�.");
		System.out.println(employeeDaeun.getEmployeeName() + "���� ����� " + employeeDaeun.getEmployeeId() + "�Դϴ�.");		
	}
}
