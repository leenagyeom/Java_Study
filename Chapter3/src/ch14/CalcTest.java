package ch14;

public class CalcTest {

	public static void main(String[] args) {
	
		int num1 = 10;
		int num2 = 2;
		
		Calc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.divide(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		
		// default method (재정의하면 재정의한 결과가 나옴) CompleteCalc 인스턴스
		calc.description();
		
		// static 메서드기 때문에 인터페이스를 바로 호출해서 쓸 수 있다.
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(Calc.total(arr));
		
	}
}
