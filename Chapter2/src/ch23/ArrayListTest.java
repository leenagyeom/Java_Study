package ch23;

import java.util.ArrayList;
import ch21.Book;

public class ArrayListTest {
	public static void main(String args[]) {
		
		ArrayList<Book> library = new ArrayList<>();
		library.add(new Book("������ �������� �ʴ´�", "��� �з�"));
		library.add(new Book("������ ������", "��ȣ��"));
		library.add(new Book("�̾���� ������ ����", "�̾��"));
		library.add(new Book("�ø�ƽ ���� ���信����", "��í, ��������"));
		library.add(new Book("���� ������ 1~2 ��Ʈ", "���ؿ�"));
		
		library.remove(2);
		library.set(2, new Book("����","����"));
		
		for(int i = 0; i < library.size(); i++) {
			library.get(i).showInfo();
		}
	}
}