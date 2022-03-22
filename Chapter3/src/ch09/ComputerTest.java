package ch09;

public class ComputerTest {

	public static void main(String[] args) {
	
		Computer desktop = new Desktop();
		desktop.display();
		desktop.typing();
		desktop.turnOn();
		desktop.turnOff();
		System.out.println();
		
		Notebook mynotebook = new MyNoteBook();
		mynotebook.display();
		mynotebook.typing();
		mynotebook.turnOn();
		mynotebook.turnOff();
		System.out.println();
	}

}
