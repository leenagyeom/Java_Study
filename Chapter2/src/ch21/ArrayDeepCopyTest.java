package ch21;

public class ArrayDeepCopyTest {

	public static void main(String[] args) {

		Book[] book = new Book[5];
		Book[] copyBook = new Book[5];
		
		book[0] = new Book ("물고기는 존재하지 않는다", "룰루 밀러");
		book[1] = new Book ("불편한 편의점", "김호연");
		book[2] = new Book ("이어령의 마지막 수업", "이어령");
		book[3] = new Book ("시멘틱 에러 포토에세이", "왓챠, 래몽래인");
		book[4] = new Book ("나의 아저씨 1~2 세트", "박해영");
		
		copyBook[0] = new Book();
		copyBook[1] = new Book();
		copyBook[2] = new Book();
		copyBook[3] = new Book();
		copyBook[4] = new Book();
		
		for (int i = 0; i < book.length; i++) {
			copyBook[i].setAuthor(book[i].getAuthor());
			copyBook[i].setTitle(book[i].getTitle());
		}
		
		book[1].setAuthor("앤 머로 린드버그");
		book[1].setTitle("바다의 선물");
		copyBook[3].setAuthor("가타야마 레이코");
		copyBook[3].setTitle("숲으로 보낸 편지");
		
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
