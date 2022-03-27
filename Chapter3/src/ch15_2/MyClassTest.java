package ch15_2;

public class MyClassTest {

	public static void main(String[] args) {
		
		MyClass mClass = new MyClass();
		
		X xClass = mClass;
		xClass.x();
		
		Y yClass = mClass;
		yClass.y();
		
		MyClass myclass = mClass;
		myclass.x();
		myclass.y();
		myclass.myMethod();
	}
}
