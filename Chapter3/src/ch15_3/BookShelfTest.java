package ch15_3;

public class BookShelfTest {

	public static void main(String[] args) {

		Queue bookQueue = new BookShelf();
		bookQueue.enQueue("����1");
		bookQueue.enQueue("����2");
		bookQueue.enQueue("����3");
		bookQueue.enQueue("����4");
		bookQueue.enQueue("����5");
		bookQueue.enQueue("����6");
		bookQueue.enQueue("����7");
		bookQueue.enQueue("����8");
		bookQueue.enQueue("����9");
		bookQueue.enQueue("����10");
		bookQueue.enQueue("����11");
		bookQueue.enQueue("����12");
		
		System.out.println(bookQueue.getSize());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
	}

}
