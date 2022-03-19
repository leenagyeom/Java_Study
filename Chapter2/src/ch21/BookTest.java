package ch21;

public class BookTest {

	public static void main(String[] args) {

		Book[] book = new Book[5];
		
//		for (int i = 0; i < book.length ; i ++) {
//			System.out.println(book[i]);
//		}
		
		book[0] = new Book ("물고기는 존재하지 않는다", "룰루 밀러");
		book[1] = new Book ("불편한 편의점", "김호연");
		book[2] = new Book ("이어령의 마지막 수업", "이어령");
		book[3] = new Book ("시멘틱 에러 포토에세이", "왓챠, 래몽래인");
		book[4] = new Book ("나의 아저씨 1~2 세트", "박해영");
		
		for (Book n : book) {
			System.out.println(n);
			n.showInfo();
		}
	}

}
