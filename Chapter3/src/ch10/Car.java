package ch10;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동걸어");
	}
	
	public void turnOff() {
		System.out.println("시동꺼라");
	}
	
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();	
	} // 이 시나리오는 변하면 안된다. 하위클래스에서 재정의 못한다!
	
}
