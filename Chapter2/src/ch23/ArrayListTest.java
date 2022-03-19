package ch23;

import java.util.ArrayList;
import ch21.Book;

public class ArrayListTest {
	public static void main(String args[]) {
		
		ArrayList<Book> library = new ArrayList<>();
		library.add(new Book("물고기는 존재하지 않는다", "룰루 밀러"));
		library.add(new Book("불편한 편의점", "김호연"));
		library.add(new Book("이어령의 마지막 수업", "이어령"));
		library.add(new Book("시멘틱 에러 포토에세이", "왓챠, 래몽래인"));
		library.add(new Book("나의 아저씨 1~2 세트", "박해영"));
		
		library.remove(2);
		library.set(2, new Book("나겸","나겸"));
		
		for(int i = 0; i < library.size(); i++) {
			library.get(i).showInfo();
		}
	}
}