package ch20;

public class CharArrayTest {
	
	public static void main(String args[]) {
		char[] alphabetArr = new char[26];
		
		char ch = 'A';
		
		for (int i = 0; i < alphabetArr.length; i++) {
			alphabetArr[i] = ch++;
		}
		for (int i = 0; i < alphabetArr.length; i++) {
			System.out.println(alphabetArr[i] + " ���ĸ��� int ���� " + (int)alphabetArr[i] + " �Դϴ�.");
		}
	}
}
