package ch17;

public class WhileTest {

	public static void main(String[] args) {
		
		int count = 1;
		int sum = 0;
		
		while (count < 11) {
			sum += count;
			count++;			
		}
		System.out.println(sum);
		System.out.println(count);
	}

}