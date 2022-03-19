package ch20;

public class ArrayTest {
	public static void main(String[] args) {
		int[] arr = new int[10];
		int total = 0;
		
		for(int i = 0, num = 1; i < arr.length; i++) {
			arr[i] = num++;
		}
		for(int n : arr) { // 엘리먼트 데이터타입 변수 선언 : 배열이름
			System.out.println(n);
			total += n;
		}
		System.out.println("arr 배열요소의 총 합은 " + total + "입니다.");
	}
}
