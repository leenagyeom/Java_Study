package ch20;

public class NineNineDanTest {

	public static void main (String[] args) {
		
		int dan = 2;
		while (dan < 10) {
			int num = 1;
			while (num < 10) {
				System.out.println(dan+"*"+num+"="+dan*num);
				num++;
			}
			dan++;
			System.out.println();
		}
	}
}