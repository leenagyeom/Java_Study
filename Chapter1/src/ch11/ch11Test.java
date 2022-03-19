package ch11;

public class ch11Test {
	public static void main(String[] args) {
		int num1 = 10; // 1010
		int num2 = 5;  // 0101 
		
		int val1 = num1 & num2;
		int val2 = num1 | num2;
		int val3 = num1 ^ num2;
		int val4 = ~num1;
		int val5 = num1<<2;
		int val6 = num1>>2;
		
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		System.out.println(val4);
		System.out.println(val5);
		System.out.println(val6);	
	}
}