package ch21;

public class ArrayDeepCopyTest {

	public static void main(String[] args) {

		Book[] book = new Book[5];
		Book[] copyBook = new Book[5];
		
		book[0] = new Book ("������ �������� �ʴ´�", "��� �з�");
		book[1] = new Book ("������ ������", "��ȣ��");
		book[2] = new Book ("�̾���� ������ ����", "�̾��");
		book[3] = new Book ("�ø�ƽ ���� ���信����", "��í, ��������");
		book[4] = new Book ("���� ������ 1~2 ��Ʈ", "���ؿ�");
		
		copyBook[0] = new Book();
		copyBook[1] = new Book();
		copyBook[2] = new Book();
		copyBook[3] = new Book();
		copyBook[4] = new Book();
		
		for (int i = 0; i < book.length; i++) {
			copyBook[i].setAuthor(book[i].getAuthor());
			copyBook[i].setTitle(book[i].getTitle());
		}
		
		book[1].setAuthor("�� �ӷ� �������");
		book[1].setTitle("�ٴ��� ����");
		copyBook[3].setAuthor("��Ÿ�߸� ������");
		copyBook[3].setTitle("������ ���� ����");
		
		System.out.println("--- original booklist ---");
		for (Book n : book) {
			System.out.print(n + "\t");
			n.showInfo();
		}
		
		System.out.println("--- copy booklist ---");
		for (Book n : copyBook) {
			System.out.print(n + "\t");
			n.showInfo();
		}

	}

}
