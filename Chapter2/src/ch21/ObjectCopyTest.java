package ch21;

public class ObjectCopyTest {

	public static void main(String[] args) {

		Book[] book = new Book[5];
		Book[] cpBook = new Book[5];
		
		book[0] = new Book ("������ �������� �ʴ´�", "��� �з�");
		book[1] = new Book ("������ ������", "��ȣ��");
		book[2] = new Book ("�̾���� ������ ����", "�̾��");
		book[3] = new Book ("�ø�ƽ ���� ���信����", "��í, ��������");
		book[4] = new Book ("���� ������ 1~2 ��Ʈ", "���ؿ�");

		System.arraycopy(book, 0, cpBook, 0, 5);
		
		book[0].setAuthor("�ڿϼ�");
		book[0].setTitle("����");
		cpBook[2].setAuthor("�̸� ��");
		cpBook[2].setTitle("����ŷ");
		
		System.out.println("== original booklist ==");
		for (Book n : book) {
			System.out.println(n);
			n.showInfo();
		}
		
		System.out.println("");

		System.out.println("== copy booklist ==");
		for (Book n : cpBook) {
			System.out.println(n);
			n.showInfo();
		}
	}

}
