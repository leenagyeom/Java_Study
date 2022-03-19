package ch16;

public class EmployeeTest {

	public static void main(String[] args)
	{
		Employee employeeNagyeom = new Employee();
		employeeNagyeom.setEmployeeName("이나겸");

		System.out.println(employeeNagyeom.getSerialNum());
		
		Employee employeeDaeun = new Employee();
		employeeDaeun.setEmployeeName("이다은");

		System.out.println(employeeNagyeom.getEmployeeName() + "님의 사번은 " + employeeNagyeom.getEmployeeId() + "입니다.");
		System.out.println(employeeDaeun.getEmployeeName() + "님의 사번은 " + employeeDaeun.getEmployeeId() + "입니다.");		
	}
}
