package ch21;

public class BookTest {

	public static void main(String[] args) {

		Book[] book = new Book[5];
		
//		for (int i = 0; i < book.length ; i ++) {
//			System.out.println(book[i]);
//		}
		
		book[0] = new Book ("������ �������� �ʴ´�", "��� �з�");
		book[1] = new Book ("������ ������", "��ȣ��");
		book[2] = new Book ("�̾���� ������ ����", "�̾��");
		book[3] = new Book ("�ø�ƽ ���� ���信����", "��í, ��������");
		book[4] = new Book ("���� ������ 1~2 ��Ʈ", "���ؿ�");
		
		for (Book n : book) {
			System.out.println(n);
			n.showInfo();
		}
	}

}
