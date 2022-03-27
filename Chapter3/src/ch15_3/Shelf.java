package ch15_3;

import java.util.ArrayList;

public class Shelf {

	protected ArrayList<String> shelf;
	
	public Shelf() {
		shelf = new ArrayList();
		// 생성자가 호출될 때, 멤버변수를 initialize 하게끔 한다.
	}
	
	public ArrayList<String> getShelf(){
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
}
