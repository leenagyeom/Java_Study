package ch21;

public class ObjectCopyTest {

	public static void main(String[] args) {

		Book[] book = new Book[5];
		Book[] cpBook = new Book[5];
		
		book[0] = new Book ("물고기는 존재하지 않는다", "룰루 밀러");
		book[1] = new Book ("불편한 편의점", "김호연");
		book[2] = new Book ("이어령의 마지막 수업", "이어령");
		book[3] = new Book ("시멘틱 에러 포토에세이", "왓챠, 래몽래인");
		book[4] = new Book ("나의 아저씨 1~2 세트", "박해영");

		System.arraycopy(book, 0, cpBook, 0, 5);
		
		book[0].setAuthor("박완서");
		book[0].setTitle("나목");
		cpBook[2].setAuthor("켈리 최");
		cpBook[2].setTitle("웰씽킹");
		
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
