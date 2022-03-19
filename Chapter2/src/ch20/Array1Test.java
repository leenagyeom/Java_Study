package ch20;

public class Array1Test {

	public static void main(String[] args) {
		double [] arr1  = new double[5];
		int cnt = 0;
		
		arr1[0] = 1.1; cnt++;
		arr1[1] = 2.2; cnt++;
		arr1[2] = 3.3; cnt++;
		
		double total = 0;
		
		for (int i = 0; i < cnt; i++ ) {
			total += arr1[i];
		}
		System.out.println(total);
	}

}
