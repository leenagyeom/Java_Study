package ch09;

public abstract class Computer {

	public abstract void display();
	public abstract void typing();
	// 구현하지 않으면 abstract로 놓는다.


	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}

}
