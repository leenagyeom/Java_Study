package ch15_3;

public class BookShelfTest {

	public static void main(String[] args) {

		Queue bookQueue = new BookShelf();
		bookQueue.enQueue("토지1");
		bookQueue.enQueue("토지2");
		bookQueue.enQueue("토지3");
		bookQueue.enQueue("토지4");
		bookQueue.enQueue("토지5");
		bookQueue.enQueue("토지6");
		bookQueue.enQueue("토지7");
		bookQueue.enQueue("토지8");
		bookQueue.enQueue("토지9");
		bookQueue.enQueue("토지10");
		bookQueue.enQueue("토지11");
		bookQueue.enQueue("토지12");
		
		System.out.println(bookQueue.getSize());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
	}

}
