package ch10;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("�õ��ɾ�");
	}
	
	public void turnOff() {
		System.out.println("�õ�����");
	}
	
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();	
	} // �� �ó������� ���ϸ� �ȵȴ�. ����Ŭ�������� ������ ���Ѵ�!
	
}
